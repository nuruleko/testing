package com.ptsb.tutorial.tutorialspringhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptsb.tutorial.tutorialspringhibernate.domain.RunningNumber;

public interface RunningNumberRepository extends
		JpaRepository<RunningNumber, Long> {

	RunningNumber findByCode(String code);

}
