package com.ptsb.tutorial.tutorialspringhibernate.service;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Pengguna;

public interface IDmsManager {

	void initData();

	Pengguna findPenggunaByEmail(String email);

}
