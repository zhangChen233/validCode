package com.chen.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chen.mapper.UsersMapper;
import com.chen.pojo.Users;
import com.chen.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Resource
	private UsersMapper usersMapper;

	@Override
	public List<Users> show() {
		// TODO Auto-generated method stub
		return usersMapper.selAll();
	}

}
