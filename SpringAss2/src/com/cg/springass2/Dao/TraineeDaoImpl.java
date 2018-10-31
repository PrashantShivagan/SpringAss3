package com.cg.springass2.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springass2.Dto.Trainee;


@Repository("traineedao")
public class TraineeDaoImpl implements TraineeDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
	em.persist(trainee);
	em.flush();
	}

	@Override
	public List<Trainee> showData() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Trainee");
		List<Trainee> tra = query.getResultList();
		return tra;
	}

	@Override
	public Trainee showSingle(int traid) {
		// TODO Auto-generated method stub
		Query querySearch = em.createQuery("From Trainee where traineeId=:tradata");
		querySearch.setParameter("tradata",traid);
		Trainee mob=(Trainee) querySearch.getResultList().get(0);
		return mob;
		
		
		/*Query query = em.createQuery("FROM Trainee where traineeId =:tradata");
				query.setParameter("tradata", id);
				List<Trainee> train = (List<Trainee>) query.getResultList().get(0);	
		return (Trainee) train;*/
	}
	
	
}
