import java.util.*;

public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base: ");
		int base = sc.nextInt();
		System.out.println("Potencia: ");
		int poten = sc.nextInt();
		int res;
		
		res = base;
		
		for(int i=1; i<poten; i++) {
			res*=base;
		}
		
		System.out.println("Resultado: "+res);
		

	}

}
