import java.util.*;

public class Q17 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite o n?mero: ");
		 int n = sc.nextInt();
		 int fat = 1;
		 
		 for(int i=n; i>=1; i--) {
			 fat*=i;
			 if(i==1) {
				 System.out.println(i);
			 } else {
				 System.out.print(i+" * ");
			 }
			 
		 }
		 
		 System.out.println("Resultado = "+fat);
	}

}
