/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Car;
import com.ptsb.tutorial.tutorialspringhibernate.domain.Wheel;

/**
 * @author Nicholas
 */
@ManagedBean(name = "carBean")
@ViewScoped
public class CarForm extends BaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Car car = new Car();
	private List<Car> carList = new ArrayList<Car>();
	private List<String> manufacturerList = new ArrayList<String>();
	private List<String> colorList = new ArrayList<String>();
	private String maxDate;
	private String outcome = "back";

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public List<String> getManufacturerList() {
		return manufacturerList;
	}

	public void setManufacturerList(List<String> manufacturerList) {
		this.manufacturerList = manufacturerList;
	}

	public List<String> getColorList() {
		return colorList;
	}

	public void setColorList(List<String> colorList) {
		this.colorList = colorList;
	}

	public String getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}
	
	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	

	@PostConstruct
	public void init() {
		Car carEdit = (Car) super.getSessionMap().get("carEdit");
		if(carEdit!=null){
			car = super.getCarService().findById(carEdit.getId());
			outcome = "backlist";
			super.getSessionMap().remove("carEdit");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		maxDate = sdf.format(new Date()).toString();
		manufacturerList.addAll(super.getManufacturers());
		colorList.addAll(super.getColors());
	}

	public void saveForm(ActionEvent actionEvent) {
		if(car.getId()==null){
			Wheel wheel1 = new Wheel();
			wheel1.setSequence(1);
			wheel1.setManufacturer("Michelin");
			wheel1.setCar(car);
			Wheel wheel2 = new Wheel();
			wheel2.setSequence(2);
			wheel2.setManufacturer("Michelin");
			wheel2.setCar(car);
			Wheel wheel3 = new Wheel();
			wheel3.setSequence(3);
			wheel3.setManufacturer("Michelin");
			wheel3.setCar(car);
			car.getWheels().add(wheel1);
			car.getWheels().add(wheel2);
			car.getWheels().add(wheel3);
		}
		super.getCarService().save(car);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Saved Successful", ""));
	}

}
