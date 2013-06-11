/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.service.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Car;
import com.ptsb.tutorial.tutorialspringhibernate.service.ICarService;

/**
 * @author Nicholas
 */
@Service
@Transactional
public class CarService implements ICarService {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Car findById(Long id) {
		// TODO Auto-generated method stub
		Criteria criteria = this.getSession().createCriteria(Car.class);
		criteria.setFetchMode("wheels", FetchMode.JOIN);
		criteria.add(Restrictions.eq("id", id));
		return (Car)criteria.list().get(0);
	}

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		Criteria criteria = this.getSession().createCriteria(Car.class);
		return criteria.list();
	}

	@Override
	public void save(Car car) {
		this.getSession().saveOrUpdate(car);
	}
	
	@Override
	public void delete(Car car) {
		this.getSession().delete(car);
	}

	@Override
	public List<Car> findByExample(Car car,Date dateFrom,Date dateTo) {
		Criteria criteria = this.getSession().createCriteria(Car.class);
		
		if(car.getOwner()!=null && !car.getOwner().isEmpty()){
			criteria.add(Restrictions.like("owner","%"+car.getOwner()+"%").ignoreCase());
		}
		if(car.getModel()!=null && !car.getModel().isEmpty()){
			criteria.add(Restrictions.like("model","%"+car.getModel()+"%").ignoreCase());
		}
		if(car.getDescription()!=null && !car.getDescription().isEmpty()){
			criteria.add(Restrictions.like("description","%"+car.getDescription()+"%").ignoreCase());
		}
		if(car.getColor()!=null && !car.getColor().isEmpty()){
			criteria.add(Restrictions.eq("color",car.getColor()));
		}
		if(car.getManufacturer()!=null && !car.getManufacturer().isEmpty()){
			criteria.add(Restrictions.eq("manufacturer",car.getManufacturer()));
		}
		if(dateFrom!=null){
			criteria.add(Restrictions.ge("dateManufactured",dateFrom));
		}
		if(dateTo!=null){
			criteria.add(Restrictions.le("dateManufactured",dateTo));
		}
		
		return criteria.list();
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
