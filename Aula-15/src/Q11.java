import java.util.*;

public class Q11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario: ");
		double salario = sc.nextDouble();
		double salarioAumento, per;
		
		if(salario <= 280) {
			per = 20;
			salarioAumento = salario * (per/100);
		}
		
		else if((salario > 280 ) && (salario <=700)) {
			per = 15;
			salarioAumento = salario * (per/100);
		}
		
		else if((salario > 700 ) && (salario <=1500)) {
			per = 10;
			salarioAumento = salario * (per/100);
		}
		
		else {
			per = 5;
			salarioAumento = salario * (per/100);
		}
		
		System.out.println("Salario sem reajuste: "+salario);
		System.out.println("Percentual do ajuste: "+per+"%");
		System.out.println("Valor do aumento: "+salarioAumento);
		System.out.println("Novo sal�rio: "+(salarioAumento+salario));
	}
	
	

}
