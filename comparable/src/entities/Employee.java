package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee other) {
		
		return -name.compareTo(other.getName());
	}
	
	
	//Ordena pelo salário em ordem crescente, caso queira em ordem decrescente
	//acrescenta-se - antes de salary.
	/*@Override
	 *public int compareTo(Employee other) {
	 *return salary.compareTo(other.getSalary());
	 *}
	 */
}
