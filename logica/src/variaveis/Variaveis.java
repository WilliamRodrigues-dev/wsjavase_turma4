package variaveis;
import java.util.Scanner;

class Variaveis{

public static void main(String args[]){

//<tipo> <identificador/nome> = <valor>;
// <tipo de dado>
// * Alfanumérico: não vou utilizar em expressões matemáticas, e também não é o dado // mais utilizado(sensivel) para busca.
// * Numérico: podemos ou não, utilizar para expressões matemáticas ou se for o dado
// mais utilizado para busca.

// Exemplo: cep (alfanumérico) => 00010-009 => 00010-009
// Exemplo: cep (numérico)     => 00010-009 => 1

// Exemplo: número da casa de alguém => alfanumérico
// Exemplo: número do telefone => alfanumérico (dentro de um contexto onde ele não 
// seja o mais utilizado para busca).
// Exemplo: altura de uma pessoa => numérico

// No Java: 
// String  => alfanumérico
// int => numérico inteiro Exemplo: quantidade de pessoas, idade
// float => numérico com casas decimais Exemplo: altura, peso, salario, nota

//<identificador/nome>
// Regras:
// - não começarás com numeros. Exemplo: 1berto, 123nome => inválidos
// - não utilizarás palavras reservadas. Exemplo: class, main, public => inválidos
// - não utilizarás caracteres especiais, exceção ao "_" (underline). nom#, valor$ => // inválidos

// Padrões:
// - letras minusculas, exceção para palavras compostas. nomeDoCliente (válido)
// - nomes significativos

Scanner teclado = new Scanner(System.in);

System.out.print("Digite o seu nome: ");
String nome = teclado.next() + teclado.nextLine();

System.out.print("Digite o seu sobrenome: ");
String sobreNome = teclado.next() + teclado.nextLine();

System.out.print("Nome Completo: " + nome);
System.out.println(" " + sobreNome); 

System.out.print("Digite sua idade: ");
int idade = teclado.nextInt();
System.out.println("Idade: " + idade);

System.out.print("Digite a altura: ");
float altura = teclado.nextFloat();

System.out.print("Digite o peso: ");
float peso = teclado.nextFloat();

System.out.println("Altura: " + altura);
System.out.println("Peso: " + peso);
float imc = peso / (altura * altura);
System.out.println("IMC = " + imc);
}
}






