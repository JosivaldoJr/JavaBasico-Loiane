import java.util.*;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantPar=0, quantImpar=0;
		
		System.out.println("Digite: ");
		for(int i=0; i<10; i++) {
			int n=sc.nextInt();
			
			if(n%2==0) {
				quantPar++;
			} else {
				quantImpar++;
			}
		}
		
		System.out.println("Qauntidade de números Par: "+quantPar);
		System.out.println("Qauntidade de números Impar: "+quantImpar);

	}

}
