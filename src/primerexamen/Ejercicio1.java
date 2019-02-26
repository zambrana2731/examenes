package primerexamen;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int altura = 3;
		
		for(int fila = 1; fila <= altura; fila++)
		{
			for(int columna= fila; columna <= altura; columna++)
			{
				System.out.print('p');
			}
			System.out.println();
		}

	}

}