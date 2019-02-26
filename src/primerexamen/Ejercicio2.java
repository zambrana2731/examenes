package primerexamen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int pin = 1213;
		int introducido;
		boolean salir = false;
		Scanner teclado = new Scanner(System.in);

		int intentos = 0;
		
		do
		{
			System.out.print("Introduce el codigo pin : ");
			introducido = teclado.nextInt();
			if (introducido != pin)
			{
				System.out.println("Pin incorrecto.");
				intentos++;
			} else 
				salir = true;
			
		} while (!salir && intentos <= 2);
		if (salir)
			System.out.println("Pin correcto.");
		 else 
			System.out.println("Has superado el limite de intentos.");
	}
}

