package com.yh.quartz.mapper.quartz;

import com.yh.quartz.entity.User;

public interface UserDao {
	User findUserById(String id);
}
