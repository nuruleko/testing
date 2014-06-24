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
@Table(name = "Semester")
public class Semester extends BaseEntity {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_SEM")
	@SequenceGenerator(name = "HB_SEQ_SEM", sequenceName = "SEQ_SEM")
	protected Long id;

	@Column(name = "KOD_SEMESTER")
	private String kodSemester;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@ManyToOne
	@JoinColumn(name = "KK_ID")
	private KalendarAkademik kalendarAkademik;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public KalendarAkademik getKalendarAkademik() {
		return kalendarAkademik;
	}

	public void setKalendarAkademik(KalendarAkademik kalendarAkademik) {
		this.kalendarAkademik = kalendarAkademik;
	}

}
