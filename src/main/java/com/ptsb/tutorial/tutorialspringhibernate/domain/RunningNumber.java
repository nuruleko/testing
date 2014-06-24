package com.ptsb.tutorial.tutorialspringhibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RunningNumber")
public class RunningNumber extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_RUN")
	@SequenceGenerator(name = "HB_SEQ_RUN", sequenceName = "SEQ_RUN")
	protected Long id;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="RUNNING_NUMBER")
	private Long runningNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getRunningNumber() {
		return runningNumber;
	}

	public void setRunningNumber(Long runningNumber) {
		this.runningNumber = runningNumber;
	}
	
	

}
