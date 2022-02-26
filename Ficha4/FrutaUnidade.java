package Ficha4;

public class FrutaUnidade extends Fruta {
	private int unidades;

	
	
	
	//Construtor
	
	public FrutaUnidade(int unidades, String Onome, double OprecoBase) {
		
		this.unidades = unidades;
		nome = Onome;
		precoBase = OprecoBase;
		
		
	
		
	}



public double pagar() {
	double valorPagar = unidades * precoBase;
		return valorPagar;
	}







public int getUnidades() {
	return unidades;
}




@Override
public String toString() {
	return "FrutaUnidade [unidades=" + unidades + ", Nome: " + super.getNome() + "]";
}



public void setUnidades(int unidades) {
	this.unidades = unidades;
}







	





}
