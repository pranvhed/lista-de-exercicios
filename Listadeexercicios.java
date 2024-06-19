package LPA2;
import java.util.Scanner;
public class Listadeexercicios {

	public static void main(String[] args) {

		    int contador = 0;
		    Scanner scanner = new Scanner(System.in);

		    for (int i = 0; i < 20; i++) {
		      System.out.print("Digite um número: ");
		      int numero = scanner.nextInt();
		      if (numero > 8) {
		        contador++;
		      }
		    }

		    System.out.println("Quantidade de números maiores do que 8: " + contador);
		  }
		}

	


