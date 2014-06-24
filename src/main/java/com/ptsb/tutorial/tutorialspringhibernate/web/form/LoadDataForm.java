package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.context.ApplicationContext;

import com.ptsb.tutorial.tutorialspringhibernate.infrastructure.ApplicationContextProvider;
import com.ptsb.tutorial.tutorialspringhibernate.service.IDmsManager;

@ManagedBean
@ViewScoped
public class LoadDataForm extends BaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void initForm(){
		
	}
	
	public void onLoad(){
		ApplicationContext applicationContext = ApplicationContextProvider
				.getApplicationContext();
		IDmsManager bean = applicationContext.getBean(IDmsManager.class);
		bean.initData();

		
	}
}
