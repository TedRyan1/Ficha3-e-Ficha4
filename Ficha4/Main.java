package Ficha4;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		FrutaUnidade frutaAmarela = new FrutaUnidade(3, "pera", 2);
		FrutaUnidade frutaAmarela1 = new FrutaUnidade(3, "maca", 2);
		FrutaUnidade frutaAmarela2 = new FrutaUnidade(3, "pera2", 2);
		
		ArrayList <Fruta> ListaTeste = new ArrayList<Fruta>();
		ListaTeste.add(frutaAmarela);
		ListaTeste.add(frutaAmarela1);
		ListaTeste.add(frutaAmarela2);
		
		for (int i = 0; i <ListaTeste.size(); i++){
			System.out.println(i);
		}
		
		for (Fruta aux : ListaTeste){
			System.out.println(aux);
			aux.pagar();
		}
		
	
		
		System.out.println(frutaAmarela.pagar());
		
		
		
		FrutaPeso frutaVermelha = new FrutaPeso(4, "maca", 5);
		
		System.out.println(frutaVermelha.pagar());
		
		
		
		
		
		FrutaVolume frutaRoxa = new FrutaVolume (2, "amora", 8);
		System.out.println(frutaRoxa.pagar());
		
		
	System.out.println(frutaRoxa.Descontavel(20));
		
		
	}

}
