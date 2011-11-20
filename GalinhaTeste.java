package br.com.xti.poo;

public class GalinhaTeste {

	public static void main(String[] args){
		Galinha marilu = new Galinha();		
		marilu.botar().botar().botar();
		
		Galinha sarali = new Galinha();
		sarali.botar().botar();
		
		System.out.println("Total de ovos da galinha Marilu: "+marilu.ovos);
		System.out.println("Total de ovos da galinha Sarali: "+sarali.ovos);
		System.out.println("Total de ovos da granja: "+Galinha.ovosDaGranja);
		System.out.println("Média de ovos da granja: "+Galinha.mediaDeOvos(2));
		
	}
}
