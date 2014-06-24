package com.ptsb.tutorial.tutorialspringhibernate.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Fakulti")
public class Fakulti extends BaseEntity {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_FAK")
	@SequenceGenerator(name = "HB_SEQ_FAK", sequenceName = "SEQ_FAK")
	protected Long id;

	@Column(name = "KOD")
	private String kod;

	@Column(name = "PERIHAL")
	private String perihal;

	@OneToMany(mappedBy = "fakulti", cascade = CascadeType.ALL)
	private List<Jabatan> jabatanList = new ArrayList<Jabatan>();

	@OneToMany(mappedBy = "fakulti", cascade = CascadeType.ALL)
	private List<KalendarAkademik> kalendarAkademikList = new ArrayList<KalendarAkademik>();

	@OneToMany(mappedBy = "fakulti", cascade = CascadeType.ALL)
	private List<Tugasan> tugasanList = new ArrayList<>();

	public List<Tugasan> getTugasanList() {
		return tugasanList;
	}

	public void setTugasanList(List<Tugasan> tugasanList) {
		this.tugasanList = tugasanList;
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

	public String getPerihal() {
		return perihal;
	}

	public void setPerihal(String perihal) {
		this.perihal = perihal;
	}

	public List<Jabatan> getJabatanList() {
		return jabatanList;
	}

	public void setJabatanList(List<Jabatan> jabatanList) {
		this.jabatanList = jabatanList;
	}

	public List<KalendarAkademik> getKalendarAkademikList() {
		return kalendarAkademikList;
	}

	public void setKalendarAkademikList(
			List<KalendarAkademik> kalendarAkademikList) {
		this.kalendarAkademikList = kalendarAkademikList;
	}

}
