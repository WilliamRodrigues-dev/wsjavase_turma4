package variaveis;
import java.util.Scanner;

class Lista1Exercicio8{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);
System.out.println("Digite o valor a ser sacado:");
int valor = teclado.nextInt();

//697

int nota100 = valor/100; //retorna um inteiro do resultado da divisao (6)
valor = valor % 100; // retorna o resto da divisão (97)
System.out.println("Restou: " + valor);

int nota50 = valor/50; // (1)
valor = valor%50; // (47)
if (nota50>0){
	System.out.println("Restou: " + valor);
}

int nota20 = valor/20; // (2)
valor = valor%20; // (7)
System.out.println("Restou: " + valor);

int nota10 = valor/10; // (0)
valor = valor%10; // (7)
System.out.println("Restou: " + valor);

int nota5 = valor/5; // (1)
valor = valor%5; // (2)
System.out.println("Restou: " + valor);

int nota2 = valor/2; // (1)
valor = valor%2; // (0)
System.out.println("Restou: " + valor);

int nota1 = valor; // (0)

System.out.println("Total de notas de 100: " + nota100);
System.out.println("Total de notas de 50: " + nota50);
System.out.println("Total de notas de 20: " + nota20);
System.out.println("Total de notas de 10: " + nota10);
System.out.println("Total de notas de 5: " + nota5);
System.out.println("Total de notas de 2: " + nota2);
System.out.println("Total de notas de 1: " + nota1);

}
}




