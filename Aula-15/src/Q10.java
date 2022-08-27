import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite: M-matutino V-verpertino N-notuno");
		String turno = sc.next();
		
		switch(turno) {
		
		case "M":
			System.out.println("Matutino");
			break;
		case "m":
			System.out.println("Matutino");
			break;
		case "V":
			System.out.println("Vespertino");
			break;
		case "v":
			System.out.println("Vespertino");
			break;
		case "N":
			System.out.println("Noturno");
			break;
		case "n":
			System.out.println("Noturno");
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
		
	}

}
