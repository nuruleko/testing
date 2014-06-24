package com.ptsb.tutorial.tutorialspringhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, Long> {

	Pengguna findByEmail(String email);

}
