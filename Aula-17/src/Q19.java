import java.util.*;

public class Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite a quantidade de notas: ");
		int qtd = sc.nextInt();
		
		System.out.println("Digite as "+qtd+" notas: ");
		
		for(int i=0; i<qtd; i++) {
			int notas = sc.nextInt();
			soma+=notas;
		}
		
		System.out.println("Média: "+soma/qtd);

	}

}
