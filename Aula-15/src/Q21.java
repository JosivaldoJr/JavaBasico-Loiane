import java.util.*;

public class Q21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double gas = 2.50, alc = 1.90;
		double precoAlcool, precoGasolina;
		
		System.out.println("Digite a quantidade de litros: ");
		double qtd = sc.nextDouble();
		
		if(qtd <= 20) {
			precoAlcool = (qtd * alc) * 0.03;
			precoGasolina = (qtd * gas) * 0.05;
			System.out.println("Preco do alcool: "+qtd*alc);
			System.out.println("Preco do alcool com desconto: "+((qtd*alc)- precoAlcool));
			
			System.out.println("Preco do gasolina: "+qtd*gas);
			System.out.println("Preco do gasolina com desconto: "+((qtd*gas) - precoGasolina ));
		} 
		
		else {
			
			precoAlcool = (qtd * alc) * 0.04;
			precoGasolina = (qtd * gas) * 0.06;
			System.out.println("Preco do alcool: "+qtd*alc);
			System.out.println("Preco do alcool com desconto: "+((qtd*alc)- precoAlcool));
			
			System.out.println("Preco do gasolina: "+qtd*gas);
			System.out.println("Preco do gasolina com desconto: "+((qtd*gas) - precoGasolina));
			
		}
		
		
		
		
		

	}

}
