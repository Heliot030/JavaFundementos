package Presentacion;

import java.io.IOException;

import logica.Lector;

public class Principal {
	public static void main(String[] args){
		Lector lc = new Lector();
		try {
			System.out.println("Nombre: ");
			String n = lc.readLine();
			
			System.out.println("edad : ");
			int edad = lc.readInt();
			
			System.out.println("Te llamas :"+ n +"Tienes años:"+ edad );
		   }
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
}
