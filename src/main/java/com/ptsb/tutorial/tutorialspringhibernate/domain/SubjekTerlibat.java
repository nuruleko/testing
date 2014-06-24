package com.ptsb.tutorial.tutorialspringhibernate.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SubjekTerlibat")
public class SubjekTerlibat extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_SUT")
	@SequenceGenerator(name = "HB_SEQ_SUT", sequenceName = "SEQ_SUT")
	protected Long id;

	@ManyToOne
	@JoinColumn(name = "PENGGUNA_ID")
	private Pengguna pengguna;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@OneToOne(mappedBy = "subjekTerlibat", cascade = CascadeType.ALL)
	private Subjek subjek;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pengguna getPengguna() {
		return pengguna;
	}

	public void setPengguna(Pengguna pengguna) {
		this.pengguna = pengguna;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public Subjek getSubjek() {
		return subjek;
	}

	public void setSubjek(Subjek subjek) {
		this.subjek = subjek;
	}

}
