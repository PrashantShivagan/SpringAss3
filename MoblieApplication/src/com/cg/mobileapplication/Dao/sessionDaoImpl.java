package com.cg.mobileapplication.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.mobileapplication.Dto.Session;


@Repository("ordermobiledao")
public class sessionDaoImpl implements SessionDao {
@PersistenceContext
	EntityManager em;
	@Override
	public List<Session> showAllSession() {
		Query query = em.createQuery("From Session");
		List<Session> myall = query.getResultList();
		return myall;
	}

}
