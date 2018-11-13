package com.cg.mobileapplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.mobileapplication.Dao.SessionDao;
import com.cg.mobileapplication.Dao.sessionDaoImpl;
import com.cg.mobileapplication.Dto.Session;

@Service("ordermobileservice")
@Transactional
public class OrderMobileServiceImpl implements OrderMobileService {
	@Autowired
	SessionDao dao ;
	public OrderMobileServiceImpl() {
		 dao = new sessionDaoImpl();
	}
	@Override
	public List<Session> showAllSession() {
		// TODO Auto-generated method stub
		return dao.showAllSession();
	}

}
