package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public BrazilInterestService() {
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
