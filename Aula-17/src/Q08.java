import java.util.*;

public class Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma=0;
		
		System.out.println("Digite: ");
		for(int i=0; i<5; i++) {
			int n = sc.nextInt();
			
			soma+=n;		
		}
		
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+(soma/5));

	}

}
