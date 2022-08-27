package Q01;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		System.out.println("A lampada esta: "+ lampada.ligada);
		
		lampada.desligar();
		
		System.out.println("A lamapda esta: "+ lampada.ligada);
		
		
	}

}
