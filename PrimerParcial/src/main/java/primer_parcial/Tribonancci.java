package primer_parcial;

import java.util.Scanner;

public class Tribonancci {

	    public static int tribonacci(int n) {
	        if (n == 0) {
	            return 0;
	        }
	        if (n == 1 || n == 2) {
	            return 1;
	        }

	        int a = 0, b = 1, c = 1, d = 0, e = 1;

	        for (int i = 3; i <= n; i++) {
	            d = a + b + c;
	            a = b;
	            b = c;
	            c = d;
	            d = e; 
	        }

	        return c;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese un numero: ");
	        int n = sc.nextInt();

	        int resultado = tribonacci(n);

	        System.out.println("El numero Tribonacci en la posicion " + n + " es: " + resultado);

	        sc.close();
	    }
}


	
	

