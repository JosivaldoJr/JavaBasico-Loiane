import java.util.*;

public class Q15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();
		
		if((lado1==lado2)&&(lado1==lado3)&&(lado2==lado3)) {
			System.out.println("Equilatero");
		}
		
		else if((lado1==lado2)||(lado1==lado3)||(lado2==lado3)) {
			System.out.println("Isósceles");
		}
		
		else if((lado1!=lado2)&&(lado1!=lado3)&&(lado2!=lado3)) {
			System.out.println("Escaleno");
		}
		
		
	}

}
