/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;

import com.ptsb.tutorial.tutorialspringhibernate.infrastructure.ApplicationContextProvider;
import com.ptsb.tutorial.tutorialspringhibernate.service.ICarService;

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
	
	public ICarService getCarService(){
		ApplicationContext applicationContext = ApplicationContextProvider.getApplicationContext();
		ICarService carService = (ICarService) applicationContext.getBean("carService");
		return carService;
	}
	
	public Map<String, Object> getSessionMap() {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		return sessionMap;
	}
	
	public List<String> getManufacturers(){
		List<String> manufacturerList = new ArrayList<String>();
		manufacturerList.add("Honda");
		manufacturerList.add("Toyota");
		manufacturerList.add("Proton");
		manufacturerList.add("Perodua");
		return manufacturerList;
	}
	
	public List<String> getColors(){
		List<String> colorList = new ArrayList<String>();
		colorList.add("Blue");
		colorList.add("White");
		colorList.add("Black");
		return colorList;
	}
	
	public TimeZone getTimeZome() {
		return TimeZone.getDefault();
	}
	
}
