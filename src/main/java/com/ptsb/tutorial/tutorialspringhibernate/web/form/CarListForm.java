/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Car;
import com.ptsb.tutorial.tutorialspringhibernate.domain.Wheel;

/**
 * @author Nicholas
 */
@ManagedBean(name = "carListBean")
@ViewScoped
public class CarListForm extends BaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Car> carList = new ArrayList<Car>();
	private List<String> manufacturerList = new ArrayList<String>();
	private List<String> colorList = new ArrayList<String>();
	private Car carSearch = new Car();
	private Car carEdit = new Car();
	private Date dateFrom;
	private Date dateTo;
	private String maxDate;
	private String carId;
	private TimeZone timeZone;
	
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
	public Car getCarSearch() {
		return carSearch;
	}
	public void setCarSearch(Car carSearch) {
		this.carSearch = carSearch;
	}
	public Car getCarEdit() {
		return carEdit;
	}
	public void setCarEdit(Car carEdit) {
		this.carEdit = carEdit;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public String getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public TimeZone getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}
	
	@PostConstruct
	public void init()
	{   
		timeZone = timeZone.getDefault();
		Car carTemp = (Car) super.getSessionMap().get("carSearch");
		if(carTemp!=null){
			carSearch = carTemp;
			carList = super.getCarService().findByExample(carSearch, dateFrom, dateTo);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		maxDate = sdf.format(new Date()).toString();
		manufacturerList.addAll(super.getManufacturers());
		colorList.addAll(super.getColors());
	}
	
	public void search(){
		carList = super.getCarService().findByExample(carSearch, dateFrom, dateTo);
	}
	
	public void delete(){ 
		if(carEdit!=null){
			Car carDelete = super.getCarService().findById(carEdit.getId());
			super.getCarService().delete(carDelete);
			carList = super.getCarService().findByExample(carSearch, dateFrom, dateTo);
		}
	}
	
	public String edit(){
		super.getSessionMap().put("carSearch", carSearch);
		super.getSessionMap().put("carEdit", carEdit);
		return "CarForm";
	}
	
	public String back(){
		super.getSessionMap().remove("carSearch");
		super.getSessionMap().remove("carEdit");
		return "index";
	}

}
