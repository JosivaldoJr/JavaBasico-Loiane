import java.util.*;

public class Q14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if((media>=9)&&(media<=10)) {
			System.out.println("Aluno conceito A");
			System.out.println("Aprovado");
			System.out.println("Media: "+media);
		}
		else if((media<9)&&(media>7.5)) {
			System.out.println("Aluno conceito B");
			System.out.println("Aprovado");
			System.out.println("Media: "+media);
		}
		else if((media>=6)&&(media<7.5)) {
			System.out.println("Aluno conceito C");
			System.out.println("Aprovado");
			System.out.println("Media: "+media);
		}
		else if((media>=4)&&(media<6)) {
			System.out.println("Aluno conceito D");
			System.out.println("Reprovado");
			System.out.println("Media: "+media);
		}
		else if((media>=0)&&(media<4)) {
			System.out.println("Aluno conceito E");
			System.out.println("Reprovado");
			System.out.println("Media: "+media);
		}
		else {
			System.out.println("Media fora do padr�o de consulta");
		}
	}

}
