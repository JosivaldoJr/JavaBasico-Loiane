import java.util.*;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite o numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o n�mero: ");
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1+" � o maior n�mero");
		}
		else if(n2 > n1){
			System.out.println(n2+" � o maior n�mero");
		}
		else {
			System.out.println("Os n�meros s�o iguais");
		}

	}

}
