package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
//		System.out.println(2 + 3);
		//Definir variável em java... ( Define primeiro o Tipo, Nome, Valor )
		// Convençao, utilizar nome de constantes com nome maiuscula...
		
		// int raio = 3; // int é usado para numeros inteiros 
		double raio = 3.4; // Double é usado para numeros quebrados
		final double PI = 3.1415;   // final transforma variavel em constante ( nao muda) convencao Maiuscula
		
		double area = PI * raio * raio; 
		
//		System.out.println(pi * raio * raio);
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("A area é igual a = " + area + "m2.");
		
		
	}
}
