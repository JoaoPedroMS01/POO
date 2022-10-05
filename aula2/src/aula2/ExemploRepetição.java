package aula2;

public class ExemploRepetição {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("---------------------");
		
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		System.out.println("---------------------");
		
		for (int j2 = 1; j2 <= 10; j2++) {
			if (j2 >= 5 && j2 <= 6) {
				continue;
			}
			System.out.println(j2);
		}
	}

}
