package br.com.polimorfismo.teste;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.tela.Magica;

public class Implementacao {

	public static void main(String[] args) {
		Formacao objeto = null;
		char opcao = Magica.s("Digite:\n<1> Medio\n<2> Tecnologo\n<3> Bacharelado").charAt(0);
		if (opcao=='1') {
			objeto = new Medio(
					Magica.s("Descricao"),
					Magica.i("Periodo"),
					0,
					0,
					Magica.s("Tipo")
					);
		}else if (opcao=='2') {
			objeto = new Tecnologo(
					Magica.s("Descricao"),
					Magica.i("Periodo"),
					0,
					0,
					Magica.b("É estendido?")
					);
		}else if (opcao=='3') {
			objeto = new Bacharelado(
					Magica.s("Descricao"),
					Magica.i("Periodo"),
					0,
					0,
					Magica.s("Projeto Conclusão"),
					Magica.i("Carga Horaria Estagio")
					);
		}else {
			System.out.println("Opção inválida!!!!");
		}
		objeto.definirDuracao();
		objeto.calcularMensalidade(Magica.f("Digite o Fator"));
		System.out.println(objeto.getAll());
		
	}

}
