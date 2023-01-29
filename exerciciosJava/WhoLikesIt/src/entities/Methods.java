package entities;

import java.util.ArrayList;
import java.util.List;

public class Methods {
	List<String> listNames = new ArrayList<String>();

	
	public String whoLikesIt(String names) {
    
		listNames.add(names);
		
		if(listNames.size() == 0) {
			return "no one likes this";
		}
		else if(listNames.size() == 1) {
			return listNames.get(0) + " likes this";
		}
		else if(listNames.size() == 2) {
			return listNames.get(0) + " and " + listNames.get(1) + " like this";
		}
		else if(listNames.size() == 3) {
			return listNames.get(0) + ", " + listNames.get(1) + " and " + listNames.get(2) + " like this";
		}
		else {
			return listNames.get(0) + ", " + listNames.get(1) + " and " + (listNames.size() - 2) + "  others like this";
		}
				 
  }
}
