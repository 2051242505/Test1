package com.tedu.sp01.service;

import com.tedu.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}
