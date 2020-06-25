package decisao;
import javax.swing.JOptionPane;

class Lista2Exercicio1{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Digite seu nome:").toUpperCase();
int diarias = Integer.parseInt(JOptionPane.showInputDialog("Qtde de diárias:"));
float taxa = 0;

if (diarias==15){
	taxa = 6f;
}else if (diarias>15){
	taxa = 5.5f;
}else{
	taxa = 8f;
}

float total = 80 * diarias + taxa * diarias;
System.out.println(nome + " sua conta deu um total de: " + total);
}

}