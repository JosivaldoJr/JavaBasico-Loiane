import java.util.*;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double popA = 80000;
		double popB = 200000;
		int anos = 0;
		
		while(popA < popB) {
			popA += (popA/100)*3;
			//System.out.println("População A: "+popA);
			popB += (popB/100)*1.5;
			//System.out.println("População B: "+popB);
			
			anos++;
		}
		
		System.out.println("Quantidade de anos: "+anos);
		
		
		
	}

}
