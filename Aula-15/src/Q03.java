import java.util.*;

public class Q03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite F ou M: ");
		String sex = sc.next();
		
		if(sex.equalsIgnoreCase("F")) {
			System.out.println("Sexo feminino");
		}
		else if(sex.equalsIgnoreCase("M")) {
			System.out.println("Sexo Masculino");
		}
		else {
			System.out.println("Sexo inválido");
		}
	}

}
