package LPA2;
import java.util.Scanner;
public class listadeexercicios5 {

	public static void main(String[] args) {
	
		    Scanner scanner = new Scanner(System.in);
		    int soma = 0;

		    while (true) {
		      System.out.print("Digite um número (ou um número negativo para sair): ");
		      int numero = scanner.nextInt();

		      if (numero < 0) {
		        break;
		      }

		      soma += numero;
		    }

		    System.out.println("A soma dos números é: " + soma);
		  }
		}

	


