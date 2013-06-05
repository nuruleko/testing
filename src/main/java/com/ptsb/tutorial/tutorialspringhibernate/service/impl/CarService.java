/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		return null;
	}

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Car car) {
	}

	@Override
	public List<Car> findByExample(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
