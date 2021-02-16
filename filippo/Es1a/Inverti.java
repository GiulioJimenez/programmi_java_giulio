import java.util.Scanner;

public class Inverti
{
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Quanti valori vuoi inserire?");
		int dimensione = tastiera.nextInt();
		int[] A = new int[dimensione];
		
		System.out.println("Inserire " + A.length + " il valore in posizione: ");
		
		for (int i = 0; i < A.length; i++) {
		    A[i] = tastiera.nextInt();
		}
		
		// inversione dei valori
		
		int i = 0;
		int j = dimensione-1;
		int temp;
		while (i < j) {
		    temp = A[i];
		    A[i] = A[j];
		    A[j] = temp;
		    i++;
		    j--;
		    System.out.println();
		}
		
		// stampo i valori
		
		for (i = 0; i < A.length; i++) {
		    System.out.print(" " + A[i]);
		}
	}
}
