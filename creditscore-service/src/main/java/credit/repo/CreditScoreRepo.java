package credit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import credit.entity.CreditScore;

@Repository
public interface CreditScoreRepo extends JpaRepository<CreditScore, String> { 
	
	@Query(value = "select score from CreditScore score where score.pancard=?1")
	CreditScore getScoreByPan(String pancard);   //1   userdefined
	

}
