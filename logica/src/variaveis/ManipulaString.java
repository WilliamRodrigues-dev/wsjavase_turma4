package variaveis;
import javax.swing.JOptionPane; 

class ManipulaString{

public static void main(String args[]){

String email = JOptionPane.showInputDialog("Seu email:");

System.out.println("Email Minusculo.......: " + email.toLowerCase());
System.out.println("Email Maiusculo.......: " + email.toUpperCase());
System.out.println("Email Qtde Caracteres.: " + email.length());
System.out.println("Parte do email........: " + email.substring(1,3));
System.out.println("Posicao do @..........: " + email.indexOf("@"));

// DESAFIO: EXIBA SOMENTE O LOGIN DO EMAIL (TUDO QUE ESTIVER ANTES DO @)
System.out.println("Login.................: " + email.substring(0, email.indexOf("@")));

// DESAFIO: EXIBA SOMENTE O SERVIDOR DO EMAIL (TUDO QUE ESTIVER DEPOIS DO @)
System.out.println("Servidor..............: " + email.substring(email.indexOf("@")+1));

}

}