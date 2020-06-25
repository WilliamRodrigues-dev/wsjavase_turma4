package decisao;
import javax.swing.JOptionPane;
class Lista2Exercicio2{


public static void main(String args[]){

int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n<1> - Vista Dinheiro ou cheque\n<2> - Vista Cartão Crédito\n<3> 2x\n<4> 3x"));

float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto"));
if (codigo==1){
	System.out.println("Valor do produto é: " + (valor*0.9));
}else if (codigo==2){
	System.out.println("Valor do produto é: " + (valor*0.95));
}else if (codigo==3){
	System.out.println("Valor do produto (2x) de: " + (valor/2));
}else if (codigo==4){
	System.out.println("Valor do produto (3x) de: " + (valor/3));
}else{
	System.out.println("Digite um dos valores: 1, 2, 3 ou 4");
}



}

}