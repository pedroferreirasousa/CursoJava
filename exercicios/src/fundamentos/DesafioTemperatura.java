package fundamentos;

public class DesafioTemperatura {
	
	public static void main(String[] args) {
		//DESAFIO PROPOSTO DE TRANSFORMAR VALOR EM °F PARA °C
		
		double valorF = 26.0;
		final double TRANSFORM = 5.0 / 9.0; //color .0 para nao devolver um numero inteiro
		
		double result = ( valorF - 32 ) * TRANSFORM;
		
		System.out.println("o resultado em graus °C é: " + result);
		
		valorF = 50;
		
		result = (valorF - 32) * TRANSFORM;
		
		System.out.println("o resultado em graus °C é: " + result);
		
	}
}
