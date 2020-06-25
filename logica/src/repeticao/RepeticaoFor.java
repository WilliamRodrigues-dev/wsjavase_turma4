package repeticao;
class RepeticaoFor{

public static void main(String args[]){

//Sintaxe: For
//1º- Variável que vai controlar o laço (contador)
//2º - Condição para que o laço seja encerrado
//3º - Como será a contagem (incremento)?

for (int contador=1;contador<10;contador++){
	System.out.println("7 x " + contador + " = " + (7*contador)); 
}

int contador = 1;
while (contador<11){
	System.out.println("7 x " + contador + " = " + (7*contador)); 
	contador++;
}

}

}