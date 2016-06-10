public class Billing {
	private static double totalBill = 0;
	private Patient p;
	private Doctor dr;
	
	public Billing(String pName, String pId, String dName, String dSpec, double d) {
		p = new Patient(pName, pId);
		dr = new Doctor(dName, dSpec, d);
		}
	
	public void setPatient(String n, String i) {
		p.setName(n);
		p.setId(i);
		}
	public String getPatientName(Billing x) {
		return x.p.name;
		}
	public void setDoctor(String n, String p, double c) {
		dr.setName(n);
		dr.setSpec(p);
		dr.setFee(c);
		}
	public void charge() {
		totalBill += dr.getFee();
		}
	public boolean equals(Billing other) {
		boolean isEqual = false;
		if ((this.p.name == other.p.name)&&(this.p.id == other.p.id)&&(this.dr.name == other.dr.name)
		&&(this.dr.spec == other.dr.spec)&&(this.dr.fee == other.dr.fee)) {
			isEqual = true;
			}
		return isEqual;	
		}
	public static void main(String[] args) {
		Billing demo = new Billing("x", "x", "Doc x", "Saves babies", 3000.00);
		demo.charge();
		System.out.println(totalBill);
		Billing demo2 = new Billing("x", "x", "Doc x", "Saves babies", 3000.00);
		demo2.charge();
		System.out.println(totalBill);
		System.out.println(demo.equals(demo2));
		
		}					
	}
