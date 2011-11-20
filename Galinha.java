package br.com.xti.poo;

public class Galinha {

	public static int ovosDaGranja;//variável global
								// será criada só uma vez, pertence à classe, não ao objeto
	
	public int ovos;//total de ovos do objeto 
					//haverão várias variáveis ovos, pois ela é uma variável de um objeto.
					//podem haver vários objetos, e cada um deles terá uma quantidade de ovos diferente.
	
	public Galinha botar(){
		this.ovos++;//this. chama o objeto em questão
		Galinha.ovosDaGranja++;//a classe Galinha chama sua varável
		return this;
	}
	
	public static double mediaDeOvos(int galinhas){
		double mediaOvos = (double)Galinha.ovosDaGranja / galinhas;	//preciso do cast, pois, mesmo a varável sendo double, a divisão é de números inteiros, portanto o retorno seria um inteiro, caso não eu fizesse o cast
		return mediaOvos;
	}
}
