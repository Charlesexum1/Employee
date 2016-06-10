public class Employee extends Person {
	public double salary;
	public int hireYear;
	public String id;
	
	public Employee() {}
	public Employee(double s, int h, String i) {
		salary = s;
		hireYear = h;
		id = i;
		}
	public double getSalary() {
		return salary;
		}
	public int getHireYear() {
		return hireYear;
		}
	public String getId() {
		return id;
		}	
	public boolean equals(Object other) {
		boolean isEqual = false;
		if ((other != null)&&(other instanceof Employee)) {
			Employee otherEmployee = (Employee)other;
			isEqual = this.hasSameName(otherEmployee) && (this.salary == otherEmployee.salary)
			&&(this.hireYear == otherEmployee.hireYear)&&(this.id == otherEmployee.id);
			}
		return isEqual;	
		}
	public static void main(String[] args) {
		Employee demo1 = new Employee(1, 1, "1");
		demo1.setName("Joe");
		Employee demo2 = new Employee(1, 1, "1");
		demo2.setName("Joe");
		System.out.println(demo1.equals(demo2));
		}						
	}
