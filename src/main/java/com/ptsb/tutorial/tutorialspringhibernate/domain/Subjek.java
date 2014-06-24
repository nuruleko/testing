package com.ptsb.tutorial.tutorialspringhibernate.domain;

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
@Table(name = "Subjek")
public class Subjek extends BaseEntity {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_SUB")
	@SequenceGenerator(name = "HB_SEQ_SUB", sequenceName = "SEQ_SUB")
	protected Long id;

	@Column(name = "KOD_SUBJEK")
	private String kodSubjek;

	@Column(name = "NAMA_SUBJEK_BM")
	private String namaSubjekBm;

	@Column(name = "NAMA_SUBJEK_BI")
	private String namaSubjekBi;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@ManyToOne
	@JoinColumn(name = "JABATAN_ID")
	private Jabatan jabatan;
	
	@OneToOne
	@JoinColumn(name="SUB_TLB_ID")
	private SubjekTerlibat subjekTerlibat;

	public Jabatan getJabatan() {
		return jabatan;
	}

	public void setJabatan(Jabatan jabatan) {
		this.jabatan = jabatan;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKodSubjek() {
		return kodSubjek;
	}

	public void setKodSubjek(String kodSubjek) {
		this.kodSubjek = kodSubjek;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

}
