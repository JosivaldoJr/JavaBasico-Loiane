import java.util.*;

public class Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n = sc.nextInt();
		boolean primo = true;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println(n+" n�o � primo.");
				primo = false;
			}
		}
		
		if(primo) {
			System.out.println(n+" � primo. ");
		}
		

	}

}
