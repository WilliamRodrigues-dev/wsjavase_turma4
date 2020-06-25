package repeticao;
import javax.swing.JOptionPane;
class Slide77Exercicio1{

public static void main(String args[]){

int dia=0;
int mes=0;
int ano=0;

while(dia<1 || dia>31){
	dia = Integer.parseInt(JOptionPane.showInputDialog("Dia:"));
}

while(mes<1 || mes>12){
	mes = Integer.parseInt(JOptionPane.showInputDialog("Mês:"));
	while(mes==2 && dia>29){
		dia = Integer.parseInt(JOptionPane.showInputDialog("O dia deve 								ser menor que 30"));	
	}
	if((mes==4 || mes==6 || mes==9 || mes==11) && dia>30){
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("O dia deve 								ser menor que 31"));			
	}
}

do{
	ano= Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
	while(ano%4!=0 && mes==2 && dia>28){
		dia = Integer.parseInt(JOptionPane.showInputDialog(" O dia deve ser 								menor que 29"));
	} 
}while(ano>2020);

System.out.println("Data validada: " + dia + "/" + mes + "/" + ano);

}

}




