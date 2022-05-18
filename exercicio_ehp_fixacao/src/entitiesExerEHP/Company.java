package entitiesExerEHP;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployee;
	
	public Company(Integer numberOfEmployee) {
		super();
		this.numberOfEmployee = numberOfEmployee;
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public double tax() {
	double taxBase = (numberOfEmployee > 10) ? getAnualIncome() * 0.14 : getAnualIncome() * 0.16;
			
		return taxBase ;
	}

}
