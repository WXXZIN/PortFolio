package com.wp.pofo.service;

import com.wp.pofo.entity.Users;

public interface UsersDAO {
	Users getUsersById(int id);
	
	int updatePwUsers(Users users);
}
