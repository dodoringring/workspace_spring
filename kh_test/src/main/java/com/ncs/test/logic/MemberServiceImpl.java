package com.ncs.test.logic;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ncs.test.dao.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{
    Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
        @Autowired
        private MemberDao memberDao;
        @Override
        public String memberLogin(Map<String, Object> pMap) {
            logger.info("memberLogin");
            String name=memberDao.memberLogin(pMap);
            return null;
        }
        @Override
        public String memberLogin() {
            // TODO Auto-generated method stub
            return null;
        }
}