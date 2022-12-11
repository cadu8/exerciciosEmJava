package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Menu;

public class Program {
	public static void main(String[] args) throws Throwable {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		
		menu.mostrarMenu();
		sc.close();
	}
}
