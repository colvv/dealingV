package com.vv.dealingV.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vv.dealingV.bean.SysUser;
import com.vv.dealingV.dao.SysUserDao;
import com.vv.dealingV.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {
	private SysUserDao tSysUserDao;

	public SysUserDao gettSysUserDao() {
		return tSysUserDao;
	}

	public void settSysUserDao(SysUserDao tSysUserDao) {
		this.tSysUserDao = tSysUserDao;
	}

	@Override
	public List<SysUser> getAllUsers() {
		return tSysUserDao.getAllUsers();
	}
	
}
