package es.maestredam;

public class DemoApp {
	public static void main(String [] args) {
		System.out.println("Proyecto Java para Demo");

		Object cosas[] = new Object[3];
		cosas[0] = new String("Spring");
		cosas[1] = 7;
		cosas[2] = 10.005;

		for (Object obj : cosas){
			System.out.println(obj);
			System.out.println("objeto1")
		}
	}



}  
