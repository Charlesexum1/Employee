public class Patient extends Person {
	public String id;
	
	public Patient() {}
	public Patient(String n, String i) {
		super.name = n;
		id = i;
		}
	public void setId(String newID) {
		id = newID;
		}
	public String getId() {
		return id;
		}		
	public boolean equals(Object other) {
		boolean isEqual = false;
		if ((other != null)&&(other instanceof Patient)) {
			Patient otherPatient = (Patient)other;
			isEqual = this.hasSameName(otherPatient) && (this.id == otherPatient.id);
			}
		return isEqual;	
		}
	public static void main(String[] args) {
		Patient demo1 = new Patient("Joe", "1");
		Patient demo2 = new Patient("Joe", "1");
		System.out.println(demo1.equals(demo2));
		}		
	}
