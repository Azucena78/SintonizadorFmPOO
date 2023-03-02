package com.cursoceat.SintonizadorFmPOO;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		Scanner scn = new Scanner(System.in);
		SintonizadorFM sintonizarFM = new SintonizadorFM();
		do {
			System.out.println(" *** RADIO FM *** ");
			System.out.println("1. Subir");
			System.out.println("2. Bajar");
			System.out.println("3. Indicar un favorito");
			System.out.println("4. Apagar la radio");
			System.out.println("Indique su opción >> ");
		opcion = scn.nextInt();
		
		switch (opcion) {
		case 1-> {
			sintonizarFM.up();
		    sintonizarFM.display();
		}
		case 2-> {
			sintonizarFM.down();
			sintonizarFM.display();
		}
		case 3-> {
		    System.out.println("Indica la frecuencia Favorita >> ");
		    sintonizarFM.setFrecuencia(scn.nextDouble());
		    sintonizarFM.display();
		}
		case 4-> System.out.println("----Apagado----");
		default->
		System.out.println("Opcion no valida");
		}
	}while(opcion!=4);
	}
}


