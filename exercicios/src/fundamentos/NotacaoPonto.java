package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		
		String s = "bom dia X";  // um Tipo que nao é um dos 8 primitivos ( Começa por letra maiuscula )
		
//		s = s.toUpperCase(); se deixar ele aqui em cima nao substituie para mauiscula o Senhora pq ela esta depois
		s = s.replace("X", "Senhora");
		s = s.toUpperCase(); // Retorna "BOM DIA SENHORA" td maiuscula
		s = s.concat("!!!"); // concatena outra string junto

		
		/*
		 * replace, toUpperCaso e concat. São exemplos de "MÉTODOS", e para acessar os MÉTODOS de um determinado
		 * dado a gente usa o "." (ponto)
		 * 
		 */
		
		System.out.println(s);
		
		System.out.println("Pedro".toUpperCase());
		
		/*
		 * Acima vemos que mesmo se colocar diretamente o "." em uma string sem estar armezanada em variavel
		 * mesmo assim temos acesso aos metodos funcional
		 * (pode colocar direto ou armazenar em uma variavel entao )
		 */
		
		//PODE USAR O . PARA QUEBRAR LINHAS 
		// EXEMPLO: 
		
		String y = "Bom Dia X"
				.replace("X", "Pedro") // Linha quebrada pós ponto ou antes do ponto é aceitavel
				.toUpperCase() // Linha quebrada pós ponto ou antes do ponto é aceitavel
				.concat(" !!!");  // Linha quebrada pós ponto ou antes do ponto é aceitavel
		System.out.println(y);
		
		//TIPOS PRIMITIVOS NAO TEM O OPERADOS "." !!!!!!! UNICAS EXEÇÕES QUE NAO TEM ATRIBUTOS E COMPORTAMENTOS
		//ATRIBUIDOS
	}
}
