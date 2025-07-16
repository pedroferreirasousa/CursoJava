package fundamentos;

public class Inferencia {
	
	
	
	public static void main(String[] args) {
		
		double a = 4.5;  // TIPO COLOCADO EXPLICITAMENTE
		System.out.println(a);
		
		var b = 4.5;  // TIPO NAO COLOCADO EXPLICITAMENTE MAS O JAVA INFERE O TIPO
		System.out.println(b); //Proprio java infere que a variavel é do tipo double
		
		var c = "texto"; //Proprio java infere que a variavel e do tipo string
		c = "outro texto"; // posso trocar o valor a variavel..
		System.out.println(c);
		
	 //	c = 4.5; // NAO PODE, A VARIAVEL SEMPRE VAI TER UM UNICO TIPO QUE NAO MUDA, ELE E STRING JA...
		
		//EXISTE UMA EXEÇÃO QUE É QUANDO COLOCADO VALOR DOUBLE INFERIDO E VOCE PASSAR UM VALOR INTEIRO
		// JAVA CONSEGUE LER POIS O VALOR INTEIRO DA PARA SER UM VALOR DOUBLE COM .0 NO FINAL...
		
		double d ; //VARIAVEL FOI DECLARADA ( E TIPADA )
		d = 123.65; // VARIAVEL FOI INICIALIZADA
		System.out.println(d); // USADA !
		
	 /*	 isso abaixo da erro pois o java so consegue inferir um tipo para a variavel se for
	  * declarada e inicializada de inicio, e abaixo esta declarando e so depois inicializando
	  * nesse caso o java nao consegue inferir um tipo automaticamente
	
	( var e;
		e = 123.45; )   ERRO!!!!!!!
		
		*/
	}
}
