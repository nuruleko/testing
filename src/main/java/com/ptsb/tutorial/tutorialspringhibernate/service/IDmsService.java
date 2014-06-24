package com.ptsb.tutorial.tutorialspringhibernate.service;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Pengguna;
import com.ptsb.tutorial.tutorialspringhibernate.domain.RunningNumber;

public interface IDmsService {

	void savePengguna(Pengguna pengguna);

	Pengguna findPenggunaByEmail(String email);

	RunningNumber findRunningNumberByCode(String code);

	RunningNumber saveRunningNumber(RunningNumber number);

}
