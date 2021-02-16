import java.util.Scanner;

public class Esercizio3205
{
	public static void main(String[] args) {
	    Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserire un numero");
	    int a = tastiera.nextInt();
	    System.out.println("Inserire un altro numero");
	    int b = tastiera.nextInt();
	    
	    System.out.println( divisibile(a,b) );
	}
	
	public static boolean divisibile(int a, int b) {
	    return (a % b) == 0;
	}
}
