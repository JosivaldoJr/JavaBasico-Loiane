import java.util.*;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite o numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o número: ");
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1+" é o maior número");
		}
		else if(n2 > n1){
			System.out.println(n2+" é o maior número");
		}
		else {
			System.out.println("Os números são iguais");
		}

	}

}
