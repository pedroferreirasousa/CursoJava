package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(1)); // printe a letra que esta no index 1 ( l )
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); //concatenando "!!!" à string 
		System.out.println(s + "!!!"); //concatenando "!!!" à string 
		System.out.println(s.startsWith("Boa")); //TRUE, Pois a string começa com "Boa"
		System.out.println(s.startsWith("boa")); //FALSE, pois a string nao começa com "boa" minusculo
		System.out.println(s.toLowerCase().startsWith("boa")); //TRUE, Pois transforma a string em letra minuscula
		//antes de dizer que começa com "boa" em minusculo.
		System.out.println(s.endsWith("tarde")); //TRUE, a string termina com "tarde"
		System.out.println(s.toUpperCase().endsWith("TARDE")); //TRUE, a string termina com "TARDE", pois fois transformada
		//em letras maiuscula com o toUpperCase antes de verificar se termina com..
		System.out.println(s.length()); //saber qual o tamanho em caracteres da string (9)
		System.out.println(s.equals("boa tarde")); //FALSE, string s nao é igual "boa tarde" em minusculo
		System.out.println(s.equalsIgnoreCase("boa tarde")); //TRUE, ignorando se e minusculo ou maiusculo (IgnoreCase)
		// ai sim pode ser igual com "boa tarde" em minusculo
		
		
		//variaveis que tem seus tipos inferidos automaticamente se e string, int etc..
		var nome = "Pedro";
		var sobrenome = "Ferreira";
		var idade = 24;
		var salario = 1234.56;
		
		System.out.println("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
		//OU 
		
		String maisUmaFrase = "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario;
		System.out.println(maisUmaFrase);
		// O " \n " serve para QUBERAR LINHA
		
		//ABAIXO OUTRA MANEIRA DE GERAR SEM TANTA CONCATENAÇAO DE MANEIRA MAIS PRATICA 
//		PRINTF
		
		// O QUE SERA SUBISTITUIDO COM AS %
		// %s = STRING 
		// %d = INTEIROS
		// %f = VALORES . FLUTUANTES ( AINDA PODE DEFINIR QUANDAS CASAS APOS O PONTO SERA EXIBIDO, como no exemplo abaixo)
		// 	
		 
		
		System.out.printf("\nO %s %s tem %d anos e ganha R$ %.2f de salário." , nome, sobrenome, idade, salario );
		
		//ABAIXO UTILIZANDO DA MESMA IDEIA POREM ARMAZENANDO DENTRO DE UMA VARIAVÉL
		//UTILIZANDO STRING.FORMAT
		String frase = String.format("\nO %s %s tem %d anos e ganha R$ %.2f de salário." , nome, sobrenome, idade, salario );
		System.out.println(frase);
		
		
		//IR TESTANDO QUAIS POSSIBILIDADES TEM COM A STRING APOS O "."
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
		//TESTAR MAIS POSSIBILIDADES.
	
	
	}
}
