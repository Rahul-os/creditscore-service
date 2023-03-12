package credit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import credit.entity.CreditScore;
import credit.service.CreditScoreService;

@RestController
@RequestMapping("/creditscore")
public class CreditScoreController { 
	@Autowired 
	CreditScoreService service;
	
	@PostMapping
	public ResponseEntity<String> addPanDetails(@RequestBody  CreditScore score)
	{
		service.addPanDetails(score);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<CreditScore>> getAllScores(){
		List<CreditScore> scoreList = service.findAll();
		return new ResponseEntity<List<CreditScore>>(scoreList,HttpStatus.OK);
	}
	
	/*@GetMapping("/{pan}")
	public ResponseEntity<Optional<CreditScore>> getScoreByPan(@PathVariable("pan") String pan){
		Optional<CreditScore> score = service.findById(pan);
		return new ResponseEntity<Optional<CreditScore>>(score,HttpStatus.OK);
	}
	*/
	
	@GetMapping("score/{pancard}")
	public ResponseEntity<CreditScore> getScoreByPan(@PathVariable("pancard") String pancard){
		CreditScore score = service.getScoreByPan(pancard);
		return new ResponseEntity<CreditScore>(score,HttpStatus.OK);
	}

}
