package fundamentos;

// Utilizo import para pegar dados de outros lugares, classes etc

import java.util.Date; //import para usar date

public class Import {

	public static void main(String[] args) {
		
		
		java.lang.String b = "Boa Tarde";
		//TUDO Q ESTA DENTRO DE JAVA.LANG É PADRAO ENTAO NAO PRECISA IMPORTAR
		// E ESSE EXEMPLO ACIMA PODERIA SER APENAS ( String b = ... )
		System.out.println(b);
		
		Date d = new Date();
		System.out.println(d);
		
	}
}
