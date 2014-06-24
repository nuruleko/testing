package com.ptsb.tutorial.tutorialspringhibernate.domain;

import java.util.ArrayList;
import java.util.Date;
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
@Table(name = "KalendarAkademik")
public class KalendarAkademik extends BaseEntity{

	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_KA")
	@SequenceGenerator(name = "HB_SEQ_KA", sequenceName = "SEQ_KA")
	protected Long id;
	
	@Column(name="SESI")
	private String sesiAkademik;
	
	@Column(name="TARIKH_MULA")
	private Date tarikhMula;
	
	@Column(name="TARIKH_TAMAT")
	private Date tarikhTamat;
	
	@Column(name="TAHUN")
	private String tahun;
	
	@ManyToOne
	@JoinColumn(name="FAKULTI_ID")
	private Fakulti fakulti;
	
	@OneToMany(mappedBy="kalendarAkademik",cascade=CascadeType.ALL)
	private List<Semester> semesterList=new ArrayList<Semester>();

	public List<Semester> getSemesterList() {
		return semesterList;
	}

	public void setSemesterList(List<Semester> semesterList) {
		this.semesterList = semesterList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSesiAkademik() {
		return sesiAkademik;
	}

	public void setSesiAkademik(String sesiAkademik) {
		this.sesiAkademik = sesiAkademik;
	}

	public Date getTarikhMula() {
		return tarikhMula;
	}

	public void setTarikhMula(Date tarikhMula) {
		this.tarikhMula = tarikhMula;
	}

	public Date getTarikhTamat() {
		return tarikhTamat;
	}

	public void setTarikhTamat(Date tarikhTamat) {
		this.tarikhTamat = tarikhTamat;
	}

	public String getTahun() {
		return tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	public Fakulti getFakulti() {
		return fakulti;
	}

	public void setFakulti(Fakulti fakulti) {
		this.fakulti = fakulti;
	}
	
	
}
