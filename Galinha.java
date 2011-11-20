package br.com.xti.poo;

public class Galinha {

	public static int ovosDaGranja;//vari�vel global
								// ser� criada s� uma vez, pertence � classe, n�o ao objeto
	
	public int ovos;//total de ovos do objeto 
					//haver�o v�rias vari�veis ovos, pois ela � uma vari�vel de um objeto.
					//podem haver v�rios objetos, e cada um deles ter� uma quantidade de ovos diferente.
	
	public Galinha botar(){
		this.ovos++;//this. chama o objeto em quest�o
		Galinha.ovosDaGranja++;//a classe Galinha chama sua var�vel
		return this;
	}
	
	public static double mediaDeOvos(int galinhas){
		double mediaOvos = (double)Galinha.ovosDaGranja / galinhas;	//preciso do cast, pois, mesmo a var�vel sendo double, a divis�o � de n�meros inteiros, portanto o retorno seria um inteiro, caso n�o eu fizesse o cast
		return mediaOvos;
	}
}
