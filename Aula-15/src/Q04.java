import java.util.*;

public class Q04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a letra: ");
		String let = sc.next();
		
		switch(let){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("vogal"); break;
			default: System.out.println("consoante");

		}

	}

}
