import java.util.*;
import java.math.*;

public class Q16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores de a, b e c:");
		double a = sc.nextDouble();
		if(a==0) {
			System.out.println("A equa��o n�o � de 2� grau");
			System.exit(0);
		}
		
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = (b*b) - 4 * a * c;
		
		if(delta<0) {
			System.out.println("A equa��o n�o possui ra�zes reais");
			System.exit(0);
		}
		else if(delta==0) {
			System.out.println("A equa��o possui apenas um raiz real");
			double x = -b/(2*a);
			System.out.println("Ra�z: "+x);
			
		}
		else if(delta>0) {
			System.out.println("A equa��o possui duas ra�zes reais");
			double x1 = (-b+Math.sqrt(delta))/(2*a);
			double x2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("Ra�zes: "+x1);
			System.out.println("Ra�zes: "+x2);
		}
		
	}

}
