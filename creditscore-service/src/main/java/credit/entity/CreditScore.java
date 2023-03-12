package credit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditscore")
public class CreditScore {
	@Id
	@Column(length = 12)
	private String pancard;
	@Column(length =30)
	private String personName;
	@Column
	private int creditScore;
	
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	@Override
	public String toString() {
		return "CreditScore [pancard=" + pancard + ", personName=" + personName + ", creditScore=" + creditScore + "]";
	}
	

}
