package credit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import credit.entity.CreditScore;
import credit.repo.CreditScoreRepo;

@Service
public class CreditScoreServiceImpl implements CreditScoreService{ 
	
	@Autowired 
	CreditScoreRepo repo;
	
	@Override
	public void addPanDetails(CreditScore score) {
		// TODO Auto-generated method stub 
		repo.save(score);
		
	}

	@Override
	public List<CreditScore> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

	@Override
	public CreditScore getScoreByPan(String pancard) {
		
		CreditScore score = repo.getScoreByPan(pancard);
		return score;
	}

}
