public class Person {
	public String name;
	
	public Person() {}
	
	public Person(String n) {
		name = n;
		}
	
	public void setName(String n) {
		name = n;
		}
	public String getName() {
		return name;
		}		
		
	public boolean hasSameName (Person someGuy) {
		return this.name.equalsIgnoreCase(someGuy.name);
		}		
	}
