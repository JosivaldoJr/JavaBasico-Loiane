package Q01;

public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar() {
		ligada =  true;
	}
	
	void desligar() {
		ligada = false;
	}
}
