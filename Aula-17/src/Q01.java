import java.util.*;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Digite uma nota entre 0 a 10:");
			int nota = sc.nextInt();
			
			if((nota>=0)&&(nota<=10)) {
				System.out.println("Nota v�lida");
				notaValida = true;
			}else {
				System.out.println("Digite novamente");
			}

		}while(!notaValida); 

	}

}
