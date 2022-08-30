import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: ");
		int num1 = sc.nextInt();
		System.out.println("Digite: ");
		int num2 = sc.nextInt();
		
		System.out.println("Os números que estão no intervalo: ");
		for(int i=num1+1; i<=num2-1; i++) {
			System.out.print(i+" ");
		}
		

	}

}
