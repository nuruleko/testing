package com.ptsb.tutorial.tutorialspringhibernate.domain;

import java.util.Date;

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
@Table(name = "Cuti")
public class Cuti extends BaseEntity {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_CUTI")
	@SequenceGenerator(name = "HB_SEQ_CUTI", sequenceName = "SEQ_CUTI")
	protected Long id;

	@ManyToOne
	@JoinColumn(name = "JENIS_CUTI")
	private SenaraiAhliKumpulan jenisCuti;

	@Column(name = "TARIKH_MULA")
	private Date tarikhMula;

	@Column(name = "TARIKH_TAMAT")
	private Date tarikhTamat;

	@Column(name = "AKTIF")
	private Boolean aktif;

	@ManyToOne
	@JoinColumn(name = "SEMESTER_ID")
	private Semester semester;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SenaraiAhliKumpulan getJenisCuti() {
		return jenisCuti;
	}

	public void setJenisCuti(SenaraiAhliKumpulan jenisCuti) {
		this.jenisCuti = jenisCuti;
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

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

}
