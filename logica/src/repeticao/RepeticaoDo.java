package repeticao;
import javax.swing.JOptionPane;

class RepeticaoDo{

public static void main(String args[]){

int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser descoberto"));
int chute=0;
int tentativas=0;
do{
	chute = Integer.parseInt(JOptionPane.showInputDialog("Chute o número que foi digitado"));
	tentativas=tentativas+1;
	//tentativas+=1;
	//tentativas++;
}while(chute!=numero);

System.out.println("Parabéns você acertou com " + tentativas + " tentativas!!!!");

}

}