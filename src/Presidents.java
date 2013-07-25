import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Presidents {

	private Person presidents[] = new Person[50];

	public Presidents(){
		//Constructor
		getInfo();
	}

	public void getInfo() {
		BufferedReader br = null;
		try 
		{
			br = new BufferedReader(new FileReader("/Users/dmcquill/dev/Workspace/Presidents/src/Presidents.txt"));
			String sCurrentLine;
			
			Collection<String> arrPresidents = new ArrayList<String>();
			while ((sCurrentLine = br.readLine()) != null) {
				arrPresidents.add(sCurrentLine);
			}
			
			parseCollection(arrPresidents);

		} catch (IOException e) {
			//e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}

	}

	@Override
	public String toString() {
		String output = "";
		for (Person pres : presidents) {
			output += pres.getFirstName() + " " + pres.getLastName() + " " + pres.getBirthDate() + " " + pres.getDeathDate();
		}
		return output;
	}
	
	public void printIt(){
		for (Person pres : presidents) {
			System.out.println(pres.getFirstName() + " " + pres.getLastName() + " " + pres.getBirthDate() + " " + pres.getDeathDate());
		}
	}
	
	public void parseCollection(Collection<String> arrPresidents) {
		
		int i = 0;
		for ( String line : arrPresidents) {
			
			String trimmedLine = line.trim();
			if(line != null && !"".equals(line)) {
				Person person = null;
				String[] lineParts = trimmedLine.split("\\s+");
				
				
				Dates bday = new Dates();
				bday.setMonth(Integer.parseInt(lineParts[3]));
				bday.setDay(Integer.parseInt(lineParts[4]));
				bday.setYear(Integer.parseInt(lineParts[5]));
				
				Boolean alive = lineParts[0].toLowerCase().equals("a");
				String firstName = lineParts[2],
					   lastName = lineParts[1];
				
				if(lineParts[0].toLowerCase().equals("a")) {
					// people be alive
					person = new Person(
								firstName,
								lastName,
								alive,
								bday
							);
				} else {
					// people be dead
					Dates dday = new Dates();
					dday.setMonth(Integer.parseInt(lineParts[6]));
					dday.setDay(Integer.parseInt(lineParts[7]));
					dday.setYear(Integer.parseInt(lineParts[8]));
					
					person = new Person(
							firstName,
							lastName,
							alive,
							bday,
							dday
						);
				}
				
				presidents[i] = person;
				i++;
			}
		}
	}
	
	/*
	public averageAge(){

	}
	public youngestToDie(){

	}
	public sortIt(){

	}*/

}
