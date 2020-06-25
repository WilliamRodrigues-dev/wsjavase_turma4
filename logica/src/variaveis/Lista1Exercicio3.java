package variaveis;
import java.util.Scanner;

class Lista1Exercicio3{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o capital:");
float capital = teclado.nextFloat();

System.out.println("Taxa de Juros:");
float juros = teclado.nextFloat();

System.out.println("Digite o periodo (em meses):");
int periodo = teclado.nextInt();

float montante = capital * (float) (Math.pow((1+ juros/100), periodo));

System.out.println("Montante: " + montante);
}

}




