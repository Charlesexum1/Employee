public class Doctor extends Person {
	public String spec;
	public double fee;
	
	public Doctor() {}
	public Doctor(String n, String s, double f) {
		super.name = n;
		spec = s;
		fee = f;
		}
	
	public void setName(String newName) {
		super.name = newName;
		}	
	public String getName() {
		return this.name;
		}
	public void setSpec(String newSpec) {
		spec = newSpec;
		}
	public String getSpec() {
		return spec;
		}
	public void setFee(double newFee) {
		fee = newFee;
		}
	public double getFee() {
		return fee;
		}
	
	public boolean equals(Object other) {
		boolean isEqual = false;
		if ((other != null)&&(other instanceof Doctor)) {
			Doctor otherDoctor = (Doctor)other;
			isEqual = this.hasSameName(otherDoctor) && (this.spec.equalsIgnoreCase(otherDoctor.spec))
			&&(this.fee == otherDoctor.fee);
			}
		return isEqual;	
		}	
	public static void main(String[] args) {
		Doctor demo1 = new Doctor("Joe", "Good-Doctor", 2000.00);
		Doctor demo2 = new Doctor("Joe", "Good-Doctor", 2000.00);
		System.out.println(demo1.equals(demo2));
		}
	}
