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
@Table(name = "Tugasan")
public class Tugasan extends BaseEntity {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_TUG")
	@SequenceGenerator(name = "HB_SEQ_TUG", sequenceName = "SEQ_TUG")
	protected Long id;

	@ManyToOne
	@JoinColumn(name = "JNS_TGS")
	private SenaraiAhliKumpulan jenisTugasan;

	@Column(name = "AKTIF")
	private boolean aktif;

	@ManyToOne
	@JoinColumn(name = "PENGGUNA_ID")
	private Pengguna pengguna;

	@ManyToOne
	@JoinColumn(name = "FAKULTI_ID")
	private Fakulti fakulti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SenaraiAhliKumpulan getJenisTugasan() {
		return jenisTugasan;
	}

	public void setJenisTugasan(SenaraiAhliKumpulan jenisTugasan) {
		this.jenisTugasan = jenisTugasan;
	}

	public boolean isAktif() {
		return aktif;
	}

	public void setAktif(boolean aktif) {
		this.aktif = aktif;
	}

	public Pengguna getPengguna() {
		return pengguna;
	}

	public void setPengguna(Pengguna pengguna) {
		this.pengguna = pengguna;
	}

	public Fakulti getFakulti() {
		return fakulti;
	}

	public void setFakulti(Fakulti fakulti) {
		this.fakulti = fakulti;
	}

}
