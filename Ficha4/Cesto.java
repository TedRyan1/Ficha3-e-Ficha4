package Ficha4;

import java.util.ArrayList;
import java.util.List;

import ExercioInvent.Trabalhador;

public class Cesto extends Fruta {
private int totalItem;
private final double capacidadeMaxima = 100;
private List <Fruta> conjuntoFruta;





public Cesto(int totalItem, List<Fruta> conjuntoFruta) {
	
	this.totalItem = totalItem;
	
	this.conjuntoFruta = new ArrayList <Fruta>();
	 
}

public void insereFruta(Fruta fruta1){
	
	conjuntoFruta.add(fruta1);
	totalItem++;
	// if para verificar capacidade maxima
	
}

//public int numFrutos(){
	//for(int i = 0; i<conjuntoFruta.size(); i++ ){
		//conjuntoFruta.get(i).
	//}

public int contFrutaUnidade(String x){
	int numFrutaUnidade = 0;
	for (Fruta aux : conjuntoFruta){
		if(x.equals(aux.getClass().getSimpleName())){
			numFrutaUnidade++;}
	}
	return numFrutaUnidade;
}

public int contFrutaPeso(String y){
	int numFrutaPeso = 0;
	for (Fruta aux : conjuntoFruta){
		if(y.equals(aux.getClass().getSimpleName())){
			numFrutaPeso++;}
	}
	return numFrutaPeso;
}


public int contFrutaVolume (String z){
	int numFrutaVolume = 0;
	for (Fruta aux : conjuntoFruta){
		if(z.equals(aux.getClass().getSimpleName())){
			numFrutaVolume++;}
	}
	return numFrutaVolume;
}

public double valorFrutaUnidade(String a){
	double total = 0;
for(Fruta aux2 : conjuntoFruta){
	if(a.equals(aux2.getClass().getSimpleName()))
	
	total += aux2.pagar(); 
}

return total;
}




public int numeroFruta(){
	return totalItem;
}




public int getTotalItem() {
	return totalItem;
}

public void setTotalItem(int totalItem) {
	this.totalItem = totalItem;
}

public double getCapacidadeMaxima() {
	return capacidadeMaxima;
}



public List<Fruta> getConjuntoFruta() {
	return conjuntoFruta;
}

public void setConjuntoFruta(List<Fruta> conjuntoFruta) {
	this.conjuntoFruta = conjuntoFruta;
}

public double pagar() {
	return 0;
}











}

