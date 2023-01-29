package priority;

import entities.Methods;

public class Main {

	public static void main(String[] args) {
		Methods metodo = new Methods();
		metodo.whoLikesIt("cadu");
		metodo.whoLikesIt("quezia");
		metodo.whoLikesIt("davi");
		System.out.println(metodo.whoLikesIt(" ")); 
		
	}

}
