package LPA2;
import java.util.Scanner;
public class listadeexercicios4v2 {

	public static void main(String[] args) {
		

		
		    Scanner scanner = new Scanner(System.in);
		    int cont0a100 = 0;
		    int cont101a200 = 0;
		    int contMaior200 = 0;
		    int i = 0;

		    while (i < 20) {
		      System.out.print("Digite um número: ");
		      int numero = scanner.nextInt();

		      if (numero >= 0 && numero <= 100) {
		        cont0a100++;
		      } else if (numero >= 101 && numero <= 200) {
		        cont101a200++;
		      } else if (numero > 200) {
		        contMaior200++;
		      }

		      i++;
		    }

		    System.out.println("Quantidade de números entre 0 e 100: " + cont0a100);
		    System.out.println("Quantidade de números entre 101 e 200: "
	}

}
