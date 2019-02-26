package primerexamen;

public class Ejercicio1Version2 {

	public static void main(String[] args) {
		int altura = 3;
		int base = 3;
		
		for(int cont = 1; cont <= altura; cont++) {
			for(int cont2 = 1; cont2 <= base; cont2++) {
				System.out.print("p");
			}
			base = base - 1;
			System.out.println();
		}
	}
}
