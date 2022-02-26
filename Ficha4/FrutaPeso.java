package Ficha4;

public class FrutaPeso extends Fruta implements FrutaImplement {
	private double peso;

	
	//Construtor
	
	public FrutaPeso(double peso, String Onome, double OprecoBase) {
		
		this.peso = peso;
		nome = Onome;
		precoBase = OprecoBase;
	}
	
	
	
	
	public double pagar() {
		double valorPagar = peso * precoBase;
		return valorPagar;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}




	public double Descontavel(double percentagem) {
		double totalDesconto  = pagar() -(pagar() * (percentagem/100));
		
		return totalDesconto;

	}


	
}
