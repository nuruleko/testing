package com.ptsb.tutorial.tutorialspringhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
