package ejercicio41.Peaje;

import java.util.Scanner;

public class Peaje {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int tipo;
		double km, peso;
		System.out.println( "Menu");
		System.out.println( "1- Motos");
		System.out.println( "2- Coches");
		System.out.println( "3- Camiones");
		System.out.println( "4- Autobuces");
		System.out.println( "Introduzca una opcion del 1-4");
		Scanner teclado = new Scanner(System.in);
        tipo = teclado.nextInt();
       
        switch (tipo)
		{
		case 1:
			System.out.println("Ha elegido Moto");
			System.out.println("Las motos pagan 3,20 €");
			break;
		case 2:
			System.out.println("Ha elegido coche");
			System.out.println("introduzca los kilometros recorridos");
			km = teclado.nextDouble();
			System.out.println("Su coche paga "+(0.1*km)+" €");
			break;
		case 3:
			System.out.println("Ha elegido Caminon");
			System.out.println("introduzca los kilometros recorridos");
			km = teclado.nextDouble();
			System.out.println("introduzca las toneladas transportadas");
			peso = teclado.nextDouble();
			System.out.println("Su camion paga "+((0.1*km)+(0.1*peso))+" €");
			break;
		case 4:
			System.out.println("Ha elegido Autobus");
			System.out.println("introduzca los kilometros recorridos");
			km = teclado.nextDouble();
			System.out.println("Su Autobus paga "+(0.1*km)+" €");
			break;
		default:
			System.out.println("La opcion elejida no es correcta");
		}
        teclado.close();
	}
}
