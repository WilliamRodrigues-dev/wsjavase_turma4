package variaveis;
import java.util.Scanner;

class Lista1Exercicio4{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);
System.out.println("Digite o dia do seu aniversário");
int diaNascimento = teclado.nextInt();
System.out.println("Digite o mês do seu aniversário");
int mesNascimento = teclado.nextInt();
System.out.println("Digite o ano do seu aniversário");
int anoNascimento = teclado.nextInt();
System.out.println("Digite o dia de hoje");
int diaHoje = teclado.nextInt();
System.out.println("Digite o mês de hoje");
int mesHoje = teclado.nextInt();
System.out.println("Digite o ano de hoje");
int anoHoje = teclado.nextInt();
int anos = anoHoje - anoNascimento;
int meses = mesHoje - mesNascimento;
int dias = diaHoje - diaNascimento;
System.out.println("Anos: " + anos);
System.out.println("Meses: " + meses);
System.out.println("Dias: " + dias);
//%d => inteiros (byte, short, int, long)
//%f => decimais (float ou double)
//%s => string´s (char ou String)
System.out.printf("Você tem %d anos e %d meses e %d dias", anos, meses, dias);

}
}






