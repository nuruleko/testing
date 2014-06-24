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
@Table(name = "SenaraiKumpulan")
public class SenaraiKumpulan extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_SK")
	@SequenceGenerator(name = "HB_SEQ_SK", sequenceName = "SEQ_SK")
	protected Long id;

	@Column(name = "KOD")
	private String kod;

	@Column(name = "NAMA")
	private String nama;

	@Column(name = "PERIHAL")
	private String perihal;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@OneToMany(mappedBy = "senaraiKumpulan", cascade = CascadeType.ALL)
	private List<SenaraiAhliKumpulan> senaraiAhliKumpulanList = new ArrayList<>();

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

	public String getPerihal() {
		return perihal;
	}

	public void setPerihal(String perihal) {
		this.perihal = perihal;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public List<SenaraiAhliKumpulan> getSenaraiAhliKumpulanList() {
		return senaraiAhliKumpulanList;
	}

	public void setSenaraiAhliKumpulanList(
			List<SenaraiAhliKumpulan> senaraiAhliKumpulanList) {
		this.senaraiAhliKumpulanList = senaraiAhliKumpulanList;
	}

}
