import java.util.*;

public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		System.out.println("Digite: ");
		for(int i=0; i<5; i++) {			
			num = sc.nextInt();
			
			if(num > maior) {
				maior = num;
				
			}
		}
		
		System.out.println("Maior n�mero: "+maior);

	}

}
