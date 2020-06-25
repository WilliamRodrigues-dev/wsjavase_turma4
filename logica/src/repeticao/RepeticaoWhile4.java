package repeticao;
import javax.swing.JOptionPane;

class RepeticaoWhile4{

public static void main(String args[]){

float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Valor 1"));
float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Valor 2"));
int resposta=0;

while (resposta==0){
	String operador = JOptionPane.showInputDialog("Digite:\n<+> Soma\n<-> Subtracao\n<*> 							Multiplicacao\n</> Divisão");
	if (operador.equals("*")){
		JOptionPane.showMessageDialog(null, "Resultado: " + (numero1*numero2));
	}else if (operador.equals("/")){
		System.out.println("Resultado: " + (numero1/numero2));
	}else if (operador.equals("+")){
		System.out.println("Resultado: " + (numero1+numero2));
	}else if (operador.equals("-")){
		System.out.println("Resultado: " + (numero1-numero2));
	}else{
		resposta=JOptionPane.showConfirmDialog(null,"Continuar?" ,"Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	}	
} // fecha o while
} // fecha o main
} // fecha a classe