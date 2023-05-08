package com.ncs.test.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	Logger logger=LoggerFactory.getLogger(MemberDao.class);
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;
	
	public String memberLogin(Map<String, Object> pMap) {
		String name=null;
		name=sqlSessionTemplate.selectOne("memberLogin", pMap);
				logger.info(name);
				return name;
	}
	
}