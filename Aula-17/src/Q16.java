import java.util.*;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primeiro = 1, segundo = 1, proximo;
				
				System.out.println("Entre com n-�gimo termo: ");
				int n = sc.nextInt();
				
				System.out.print("S�rie de fibonacci: ");
				System.out.print(primeiro+" ");
				System.out.print(segundo+" ");
				
				for(int i=3; i<=500; i++) {
					
					proximo = primeiro + segundo;
					primeiro = segundo;
					segundo = proximo;
					System.out.print(proximo+" ");
				}


	}

}
