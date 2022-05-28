package services;

public class UsaInterestService implements InterestService {
	private double interestRate;

	public UsaInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public UsaInterestService() {
		super();
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
}
