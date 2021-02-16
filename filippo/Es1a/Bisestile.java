import java.util.Scanner;

public class Bisestile
{
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserire l'anno");
		int anno = tastiera.nextInt();
		
		if ( ( (anno % 4 == 0) && (anno % 100 != 0) ) || (anno % 400 == 0) ) {
		    System.out.println("L'anno " + anno + " è bisestile.");
		}else {
		    System.out.println("L'anno " + anno + " non è bisestile.");
		}
	}
}