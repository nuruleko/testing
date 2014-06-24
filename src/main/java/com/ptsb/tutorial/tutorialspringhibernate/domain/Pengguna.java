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
@Table(name = "Pengguna")
public class Pengguna extends BaseEntity {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_PEN")
	@SequenceGenerator(name = "HB_SEQ_PEN", sequenceName = "SEQ_PEN")
	protected Long id;

	@Column(name = "NAMA_PERTAMA")
	private String namaPertama;

	@Column(name = "NAMA_AKHIR")
	private String namaAkhir;

	@ManyToOne
	@JoinColumn(name = "PST_PGJN_ID")
	private SenaraiAhliKumpulan pusatPengajian;

	@ManyToOne
	@JoinColumn(name = "JANTINA")
	private SenaraiAhliKumpulan jantina;

	@Column(name = "NO_KP")
	private String noKadPengenalan;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@ManyToOne
	@JoinColumn(name = "JAWATAN")
	private SenaraiAhliKumpulan jawatan;

	@Column(name = "AKSES")
	private Boolean akses;

	@Column(name = "EMEL")
	private String email;

	@Column(name = "PASSWORD")
	private String password;
	
	@ManyToOne
	@JoinColumn(name="TUGASAN_ID")
	private Tugasan tugasan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getAkses() {
		return akses;
	}

	public void setAkses(Boolean akses) {
		this.akses = akses;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNamaPertama() {
		return namaPertama;
	}

	public void setNamaPertama(String namaPertama) {
		this.namaPertama = namaPertama;
	}

	public String getNamaAkhir() {
		return namaAkhir;
	}

	public void setNamaAkhir(String namaAkhir) {
		this.namaAkhir = namaAkhir;
	}

	public SenaraiAhliKumpulan getPusatPengajian() {
		return pusatPengajian;
	}

	public void setPusatPengajian(SenaraiAhliKumpulan pusatPengajian) {
		this.pusatPengajian = pusatPengajian;
	}

	public SenaraiAhliKumpulan getJantina() {
		return jantina;
	}

	public void setJantina(SenaraiAhliKumpulan jantina) {
		this.jantina = jantina;
	}

	public String getNoKadPengenalan() {
		return noKadPengenalan;
	}

	public void setNoKadPengenalan(String noKadPengenalan) {
		this.noKadPengenalan = noKadPengenalan;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public SenaraiAhliKumpulan getJawatan() {
		return jawatan;
	}

	public void setJawatan(SenaraiAhliKumpulan jawatan) {
		this.jawatan = jawatan;
	}

	public Tugasan getTugasan() {
		return tugasan;
	}

	public void setTugasan(Tugasan tugasan) {
		this.tugasan = tugasan;
	}

}
