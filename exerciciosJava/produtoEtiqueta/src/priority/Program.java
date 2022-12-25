package priority;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Menu;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		Menu menu = new Menu();
		
		menu.menu();
	}

}
