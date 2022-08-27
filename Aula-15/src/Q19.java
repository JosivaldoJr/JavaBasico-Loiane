import java.util.*;

public class Q19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int res;
		System.out.println("Digite os numeros:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Digite a operação:");
		String op = sc.next();
		
		switch(op) {
		case "+":
			res = num1 + num2;
			System.out.println("Resultado: "+res);
			if(res%2==0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
			
			if(res>=0) {
				System.out.println("positivo");
			} else {
				System.out.println("Negativo");
			}
			break;
		case "-":
			res = num1 - num2;
			System.out.println("Resultado: "+res);
			if(res%2==0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
			
			if(res>=0) {
				System.out.println("positivo");
			} else {
				System.out.println("Negativo");
			}
			break;
		case "*":
			res = num1 * num2;
			System.out.println("Resultado: "+res);
			if(res%2==0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
			
			if(res>=0) {
				System.out.println("positivo");
			} else {
				System.out.println("Negativo");
			}
			break;
		case "/":
			res = num1 / num2;
			System.out.println("Resultado: "+res);
			if(res%2==0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
			
			if(res>=0) {
				System.out.println("positivo");
			} else {
				System.out.println("Negativo");
			}
			break;
			
			
		}
		
		

	}

}
