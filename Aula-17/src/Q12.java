import java.util.*;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: ");
		int n = sc.nextInt();
		
		System.out.println("Tabuada de "+n+":");
		for(int i=1; i<=10; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}

	}

}
