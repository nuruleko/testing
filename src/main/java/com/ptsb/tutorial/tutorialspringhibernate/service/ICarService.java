/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.service;

import java.util.Date;
import java.util.List;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Car;

/**
 * @author Nicholas
 */
public interface ICarService {

	Car findById(Long id);

	List<Car> findAll();

	void save(Car car);
	
	void delete(Car car);

	List<Car> findByExample(Car car,Date dateFrom,Date dateTo);
}
