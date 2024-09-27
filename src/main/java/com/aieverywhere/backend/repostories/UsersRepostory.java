package com.aieverywhere.backend.repostories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aieverywhere.backend.models.UsersModel;

public interface UsersRepostory extends JpaRepository<UsersModel, Integer>{

	UsersModel findAllByID(String userID);
	UsersModel findAllByEmailOrPhone(String email, String phone);
	List<UsersModel> findAllByName(String name);
	List<UsersModel> findAllByRole(String role);
	List<UsersModel> findByPersonality(String personality);
	List<UsersModel> findByEmo_level(int emoLevel);
	List<UsersModel> findByCreated_atBetween(Date start, Date end);
	List<UsersModel> findByUpdate_atBetween(Date start, Date end);
}
