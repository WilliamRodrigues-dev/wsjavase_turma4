package decisao;
import java.util.Scanner;

class DecisaoEncadeada{

public static void main(String args[]){

	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite o nome do aluno:");
	String nome = teclado.next();
	System.out.println("Digite a nota 1:");
	float nota1 = teclado.nextFloat();
	System.out.println("Digite a nota 2:");
	float nota2 = teclado.nextFloat();
	System.out.println("Digite o total de faltas:");
	int faltas = teclado.nextInt();
	float media = (nota1+nota2)/2;
	if (faltas>20){
		System.out.println("Infelizmente " + nome + " você foi REPROVADO!");
	}else{
		if (media>=6){
			System.out.println("Parabéns " + nome + " você está APROVADO!");
		}else if (media<4){
			System.out.println("Infelizmente " + nome + " você foi REPROVADO!");
		}else{
			System.out.println("Ainda há esperança " + nome + " você está de EXAME!");
		}
	}	
	System.out.println("Até logo!!");	
}
}




