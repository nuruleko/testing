package com.ptsb.tutorial.tutorialspringhibernate.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Jabatan")
public class Jabatan extends BaseEntity {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_JAB")
	@SequenceGenerator(name = "HB_SEQ_JAB", sequenceName = "SEQ_JAB")
	protected Long id;

	@Column(name = "KOD")
	private String kod;

	@Column(name = "NAMA")
	private String nama;

	@ManyToOne
	@JoinColumn(name = "PST_PGJ")
	private SenaraiAhliKumpulan pusatPengajian;

	@ManyToOne
	@JoinColumn(name = "FAKULTI_ID")
	private Fakulti fakulti;

	@OneToMany(mappedBy = "jabatan", cascade = CascadeType.ALL)
	private List<Subjek> subjekList = new ArrayList<Subjek>();

	public List<Subjek> getSubjekList() {
		return subjekList;
	}

	public void setSubjekList(List<Subjek> subjekList) {
		this.subjekList = subjekList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public SenaraiAhliKumpulan getPusatPengajian() {
		return pusatPengajian;
	}

	public void setPusatPengajian(SenaraiAhliKumpulan pusatPengajian) {
		this.pusatPengajian = pusatPengajian;
	}

	public Fakulti getFakulti() {
		return fakulti;
	}

	public void setFakulti(Fakulti fakulti) {
		this.fakulti = fakulti;
	}

}
