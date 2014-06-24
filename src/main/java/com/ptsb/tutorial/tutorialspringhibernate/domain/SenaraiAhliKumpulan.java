package com.ptsb.tutorial.tutorialspringhibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SenaraiAhliKumpulan")
public class SenaraiAhliKumpulan extends BaseEntity {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_SAK")
	@SequenceGenerator(name = "HB_SEQ_SAK", sequenceName = "SEQ_SAK")
	protected Long id;

	@Column(name = "NAMA")
	private String nama;

	@Column(name = "KOD")
	private String kod;

	@Column(name = "PERIHAL")
	private String perihal;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@ManyToOne
	@JoinColumn(name = "SK_ID")
	private SenaraiKumpulan senaraiKumpulan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
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

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public SenaraiKumpulan getSenaraiKumpulan() {
		return senaraiKumpulan;
	}

	public void setSenaraiKumpulan(SenaraiKumpulan senaraiKumpulan) {
		this.senaraiKumpulan = senaraiKumpulan;
	}

}
