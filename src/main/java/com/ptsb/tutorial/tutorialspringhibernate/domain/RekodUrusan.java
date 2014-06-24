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
@Table(name = "RekodUrusan")
public class RekodUrusan extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_REU")
	@SequenceGenerator(name = "HB_SEQ_REU", sequenceName = "SEQ_REU")
	protected Long id;

	@ManyToOne
	@JoinColumn(name = "SUBJEK_ID")
	private Subjek subjek;

	@ManyToOne
	@JoinColumn(name = "PENGGUNA")
	private Pengguna pengguna;

	@ManyToOne
	@JoinColumn(name = "KAL_AKA")
	private KalendarAkademik kalendarAkademik;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@Column(name = "CATATAN")
	private String catatan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Subjek getSubjek() {
		return subjek;
	}

	public void setSubjek(Subjek subjek) {
		this.subjek = subjek;
	}

	public Pengguna getPengguna() {
		return pengguna;
	}

	public void setPengguna(Pengguna pengguna) {
		this.pengguna = pengguna;
	}

	public KalendarAkademik getKalendarAkademik() {
		return kalendarAkademik;
	}

	public void setKalendarAkademik(KalendarAkademik kalendarAkademik) {
		this.kalendarAkademik = kalendarAkademik;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public String getCatatan() {
		return catatan;
	}

	public void setCatatan(String catatan) {
		this.catatan = catatan;
	}

}
