package com.ptsb.tutorial.tutorialspringhibernate.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Pengguna;
import com.ptsb.tutorial.tutorialspringhibernate.domain.RunningNumber;
import com.ptsb.tutorial.tutorialspringhibernate.repository.PenggunaRepository;
import com.ptsb.tutorial.tutorialspringhibernate.repository.RunningNumberRepository;
import com.ptsb.tutorial.tutorialspringhibernate.service.IDmsService;

@Service
@Transactional
public class DmsService implements IDmsService {

	protected EntityManager entityManager;
	@Autowired
	private PenggunaRepository penggunaRepository;

	@Autowired
	private RunningNumberRepository runningNumberRepository;

	@Override
	public void savePengguna(Pengguna pengguna) {
		penggunaRepository.save(pengguna);
	}

	@Override
	@Transactional(readOnly = true)
	public Pengguna findPenggunaByEmail(String email) {
		return penggunaRepository.findByEmail(email);
	}
	
	@Override
	@Transactional(readOnly=true)
	public RunningNumber findRunningNumberByCode(String code){
		return runningNumberRepository.findByCode(code);
	}
	
	@Override
	public RunningNumber saveRunningNumber(RunningNumber number){
		return runningNumberRepository.save(number);
	}


	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext(unitName = "etanahTutorialSpringHibernatePU")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
