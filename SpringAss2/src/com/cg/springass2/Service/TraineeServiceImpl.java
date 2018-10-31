package com.cg.springass2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springass2.Dao.TraineeDao;
import com.cg.springass2.Dao.TraineeDaoImpl;
import com.cg.springass2.Dto.Trainee;

@Service("traineeservice")
@Transactional
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	TraineeDao traineedao;
	public TraineeServiceImpl() {

		traineedao = new TraineeDaoImpl();
	}
	@Override
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		traineedao.addTrainee(trainee);
		
	}
	@Override
	public List<Trainee> showData() {
		// TODO Auto-generated method stub
		return traineedao.showData();
	}
	@Override
	public Trainee showSingle(int traid) {
		// TODO Auto-generated method stub
		return traineedao.showSingle(traid);
	}
}
