
public class Person {
	
	private String lastName;
	private String firstName;
	private Boolean alive = null;
	private Dates birthDate = new Dates();
	private Dates deathDate = new Dates();
	
	public Person(){
		//Constructor
	}
	public Person(String first,String last,Boolean status,Dates birth){
		this.lastName = last;
		this.firstName = first;
		this.alive = status;
		this.birthDate = birth;
	}
	public Person(String first,String last,Boolean status,Dates birth,Dates death){
		this.lastName = last;
		this.firstName = first;
		this.alive = status;
		this.birthDate = birth;
		this.deathDate = death;
	}
	public String getLastName(){
		return lastName;
	}
	public String getFirstName(){
		return firstName;
	}
	public Boolean isAlive(){
		return alive;
	}
	public String getBirthMonth(){
		return birthDate.getMonthName();
	}
	public int getBirthDay(){
		return birthDate.getDay();
	}
	public int getBirthYear(){
		return birthDate.getYear();
	}
	public String getBirthDate(){
		return getBirthMonth() + " " + getBirthDay() + ", " + getBirthYear();
	}
	public String getDeathMonth(){
		return deathDate.getMonthName();
	}
	public int getDeathDay(){
		return deathDate.getDay();
	}
	public int getDeathYear(){
		return deathDate.getYear();
	}
	public String getDeathDate(){
		if(!alive) {
			return getDeathMonth() + " " + getDeathDay() + ", " + getDeathYear();
		}
		return " - Still Alive -";
	}
	
}
