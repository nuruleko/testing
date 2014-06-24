package com.ptsb.tutorial.tutorialspringhibernate.service.impl;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Pengguna;
import com.ptsb.tutorial.tutorialspringhibernate.service.IDmsManager;
import com.ptsb.tutorial.tutorialspringhibernate.service.IDmsService;

@Service
@Transactional
public class DmsManager implements IDmsManager {

	@Autowired
	private IDmsService dmsService;
	
	@Override
	public void initData(){

		Pengguna pengguna=new Pengguna();
		pengguna.setEmail("ryan@gmail.com");
		pengguna.setPassword("1234");
		dmsService.savePengguna(pengguna);
		
		pengguna=new Pengguna();
		pengguna.setEmail("domu@gmail.com");
		pengguna.setPassword("1234");
		dmsService.savePengguna(pengguna);
		
		
	}
	
	@Override
	@Transactional(readOnly=true)
	public Pengguna findPenggunaByEmail(String email){
		return dmsService.findPenggunaByEmail(email);
	}
}
