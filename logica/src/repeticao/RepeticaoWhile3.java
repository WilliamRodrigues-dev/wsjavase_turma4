package repeticao;
import javax.swing.JOptionPane;

class RepeticaoWhile3{

public static void main(String args[]){

float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Valor 1"));
float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Valor 2"));
char resposta='S';

while (resposta=='S'){
	String operador = JOptionPane.showInputDialog("Digite:\n<+> Soma\n<-> Subtracao\n<*> 							Multiplicacao\n</> Divisão");
	if (operador.equals("*")){
		System.out.println("Resultado: " + (numero1*numero2));
	}else if (operador.equals("/")){
		System.out.println("Resultado: " + (numero1/numero2));
	}else if (operador.equals("+")){
		System.out.println("Resultado: " + (numero1+numero2));
	}else if (operador.equals("-")){
		System.out.println("Resultado: " + (numero1-numero2));
	}else{
		resposta='N';
	}	
} // fecha o while
} // fecha o main
} // fecha a classe