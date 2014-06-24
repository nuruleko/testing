/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.context.ApplicationContext;

import com.ptsb.tutorial.tutorialspringhibernate.infrastructure.ApplicationContextProvider;
import com.ptsb.tutorial.tutorialspringhibernate.service.IDmsManager;

/**
 * @author Nicholas
 */
public abstract class BaseForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
	}
	
	public IDmsManager getDmsManager(){
		ApplicationContext applicationContext = ApplicationContextProvider
				.getApplicationContext();
		IDmsManager bean = applicationContext.getBean(IDmsManager.class);
		return bean;
	}
	

}
