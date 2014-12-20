package com.vv.dealingV.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.vv.dealingV.bean.SysUser;
@Repository
public interface SysUserDao {
	@Select("SELECT * FROM sys_user")
	public List<SysUser> getAllUsers();
}
