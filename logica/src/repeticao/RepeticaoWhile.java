package repeticao;
import javax.swing.JOptionPane;

class RepeticaoWhile{

public static void main(String args[]){


String nome="";

while (nome.indexOf(" ")==-1 || nome.length()<8){
	nome = JOptionPane.showInputDialog("Digite o seu nome completo");
}

System.out.println("Nome: " + nome);

}


}