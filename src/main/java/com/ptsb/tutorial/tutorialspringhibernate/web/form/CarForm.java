/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.context.ApplicationContext;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Car;
import com.ptsb.tutorial.tutorialspringhibernate.infrastructure.ApplicationContextProvider;
import com.ptsb.tutorial.tutorialspringhibernate.service.ICarService;

/**
 * @author Nicholas
 */
@ManagedBean
@ViewScoped
public class CarForm extends BaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void save() {
		ApplicationContext applicationContext = ApplicationContextProvider
				.getApplicationContext();
		ICarService bean = applicationContext.getBean(ICarService.class);

		Car car = new Car();
		car.setManufacturer("proton");
		car.setModel("saga");
		car.setDateManufactured(new Date());
		car.setColor("red");
		car.setOwner("nick");

		bean.save(car);

	}

}
