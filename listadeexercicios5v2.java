package LPA2;
import java.util.Scanner;
public class listadeexercicios5v2 {

	public static void main(String[] args) {

		    Scanner scanner = new Scanner(System.in);
		    int soma = 0;
		    int numero;

		    while (true) {
		      System.out.print("Digite um número (ou um número negativo para sair): ");
		      numero = scanner.nextInt();

		      if (numero < 0) {
		        break;
		      }

		      soma += numero;
		    }

		    System.out.println("A soma dos números é: " + soma);
		  }
		}

	


