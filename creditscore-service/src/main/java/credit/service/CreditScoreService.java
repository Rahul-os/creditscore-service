package credit.service;

import java.util.List;
import java.util.Optional;

import credit.entity.CreditScore;

public interface CreditScoreService { 
	
	void addPanDetails(CreditScore score);
	
	List<CreditScore> findAll();
	
	//Optional<CreditScore> findById(String pancard);
	
	CreditScore getScoreByPan(String pancard);  //2
}
