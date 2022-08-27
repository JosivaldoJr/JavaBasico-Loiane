import java.util.*;

public class Q08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double menorPreco = Integer.MIN_VALUE;
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		if(n1 > menorPreco) {
			menorPreco = n1;
			if(n2 < menorPreco) {
				menorPreco = n2;
			} 
			
			if(n3 < menorPreco) {
				menorPreco = n3;
			}
		}
		
		System.out.println("O melhor preço é: "+menorPreco);
	}

}
