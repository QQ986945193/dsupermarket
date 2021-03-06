package com.david.dsupermarket.service;

import java.util.List;
import java.util.Map;

import com.david.dsupermarket.model.Employer;
import com.david.dsupermarket.model.PageBean;

/**
 * 员工信息接口
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
public interface EmployerService {

	List<Employer> findAll();

	void addEmployer(Employer employer);

	void deleteEmployer(Integer eid);

	Employer findEmployerByEid(Integer eid);

	void updateEmployerByEid(Employer employer);


	List<Employer> findfindByPage(Map<String,Object> map);

	Integer count();

	Integer countMapSize(Map<String, Object> map);

}
