package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.print("bom");
        System.out.print(" dia !\n");  //.print sem o LN, fica na mesma linha e o \n quebra pra linha debaixo no final
        System.out.println("bom dia");
        System.out.println("bom dia"); //.print com o LN no final muda para linha debaixo

        //.printf = print formatado. exemplo abaixo
        System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 5, 7, 8, 17, 23);
        System.out.printf("Sálario: R$ %.2f \n", 1523.4623);
        System.out.printf("Nome: %s \n", "Pedro");

        //Scanner system.in scaneia a entrada (teclado)
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite seu  sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite o dia do seu nascimento ( em numeros ): ");
        int dia = entrada.nextInt();
        System.out.print("Digite o mes do seu nascimento ( em numeros ): ");
        int mes = entrada.nextInt();
        System.out.print("Digite o ano do seu nascimento ( em numeros ): ");
        int ano = entrada.nextInt();

        System.out.println("\n\nNome completo:" + nome + " " + sobrenome);

        //concatendando "+"
        System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
        //OUUUU substituindo "dinamico"
        System.out.printf("Data de nascimento %d/%d/%d", dia, mes, ano);

        entrada.close();  //FECHAR O SCANNER PARA NAO CONTINUAR RODANDO E ECONOMIZAR RECURSO E MEMORIA

    }
}