package LPA2;
import java.util.Scanner;
public class listadeexercicios3 {

	public static void main(String[] args) {
		
		    int contador = 0;
		    Scanner scanner = new Scanner(System.in);

		    for (int i = 0; i < 20; i++) {
		      System.out.print("Digite um número: ");
		      int numero = scanner.nextInt();
		      if (numero >= 0 && numero <= 100) {
		        contador++;
		      }
		    }

		    System.out.println("Quantidade de números entre 0 e 100: " + contador);
		  }
		}

	


