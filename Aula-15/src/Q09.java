import java.util.*;
public class Q09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int maior = Integer.MAX_VALUE;
		int menor = Integer.MIN_VALUE;
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 < maior) {
			maior = n1;
			if(n2 > maior) {
				maior = n2;
			} 
			
			if(n3 > maior) {
				maior = n3;
			}
		}
		
		if(n1 > menor) {
			menor = n1;
			if(n2 < menor) {
				menor = n2;
			} 
			
			if(n3 < menor) {
				menor = n3;
			}
		}
		
		System.out.println(maior+" � o maior");
		System.out.println(menor+" � o menor");

	}

}