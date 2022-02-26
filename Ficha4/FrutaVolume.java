package Ficha4;

public class FrutaVolume extends Fruta implements FrutaImplement {
	private double volume;

	
	
	
	
	
	public FrutaVolume(double volume, String Onome, double OprecoBase) {
		
		this.volume = volume;
		nome = Onome;
		precoBase = OprecoBase;
		
	}


public double pagar() {
		double valorPagar = volume * precoBase;
		return valorPagar;
	}


public double getVolume() {
	return volume;
}


public void setVolume(double volume) {
	this.volume = volume;
}


public double Descontavel(double percentagem) {
	double totalDesconto  = pagar() -(pagar() * (percentagem/100));
	
	return totalDesconto;

}
	


	
	
	
}
