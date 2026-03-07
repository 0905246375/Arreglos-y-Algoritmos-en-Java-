package primer_parcial;

public class Puntaje_de_Arreglo {
	
	 public static void main(String[] args) {
	        
	        int[] ej1 = {1, 2, 3, 4, 5};
	        int[] ej2 = {17, 19, 21};
	        int[] ej3 = {5, 5, 5};

	        System.out.println("Puntaje [1, 2, 3, 4, 5]: " + score(ej1)); 
	        System.out.println("Puntaje [17, 19, 21]: " + score(ej2));    
	        System.out.println("Puntaje [5, 5, 5]: " + score(ej3));       
	    }

	    
	    public static int score(int[] numbers) {
	        int total = 0;

	        for (int num : numbers) {
	            if (num == 5) {
	                total += 5;
	            } else if (num % 2 == 0) {
	                total += 1;
	            } else {
	                
	                total += 3;
	            }
	        }
	        return total;
	    }
	}		
