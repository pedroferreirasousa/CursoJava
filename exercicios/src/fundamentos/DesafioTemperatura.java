package fundamentos;

public class DesafioTemperatura {
	
	public static void main(String[] args) {
		//DESAFIO PROPOSTO DE TRANSFORMAR VALOR EM °F PARA °C
		//FORMULA ( F - 32 ) X 5/9 
		
		double valorF = 26.0;
		final double TRANSFORM = 5.0 / 9.0; //colocar .0 para nao devolver um numero inteiro
		
		double result = ( valorF - 32 ) * TRANSFORM;
		
		System.out.println("o resultado em graus °C é: " + result);
		
		valorF = 50;
		
		result = (valorF - 32) * TRANSFORM;
		
		System.out.println("o resultado em graus °C é: " + result);
		
	}
}
