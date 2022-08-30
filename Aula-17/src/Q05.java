import java.util.*;

public class Q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double popA, popB;
		double taxA, taxB;
		int anos = 0;
		
		boolean val = false;
		
		do {
			System.out.println("População A: ");
			popA = sc.nextDouble();
			
			if(popA>0) {
				val = true;
			} else {
				System.out.println("População precisa ser maior que 0. Digite novamente!");
			}
		}while(!val); val = false;
		
		do {
			System.out.println("População B: ");
			popB = sc.nextDouble();
			
			if(popB>0) {
				val = true;
			} else {
				System.out.println("População precisa ser maior que 0. Digite novamente!");
			}
		}while(!val); val = false;
		
		do {
			System.out.println("Taxa A: ");
			taxA = sc.nextDouble();
			
			if(taxA>0) {
				val = true;
			} else {
				System.out.println("Taxa precisa ser maior que 0. Digite novamente!");
			}
		}while(!val); val = false;
		
		do {
			System.out.println("Taxa A: ");
			taxB = sc.nextDouble();
			
			if(taxB>0) {
				val = true;
			} else {
				System.out.println("Taxa precisa ser maior que 0. Digite novamente!");
			}
		}while(!val); val = false;
		
		while(popA < popB) {
			popA += (popA/100)*3;
			popB += (popB/100)*1.5;
			
			anos++;
		}
		
		System.out.println("População A: "+popA);
		System.out.println("Taxa A: "+taxA);
		System.out.println("População B: "+popB);
		System.out.println("Taxa B: "+taxB);
		System.out.println("Quantidade de anos: "+anos);

	}

}
