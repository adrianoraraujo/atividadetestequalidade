package br.ucsal.testequalidade.bes20181.atividade1.tui;

import java.util.Scanner;

import br.ucsal.testequalidade.bes20181.atividade1.business.RegistroNotaBC;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.ConceitoInvalidoException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;

public class RegistroNotaTui {
	Scanner sc = new Scanner(System.in);

	public RegistroNotaBC bc = new RegistroNotaBC();
private Integer nota1, nota2;
	public void registrarPesos() throws PesoInvalidoException {

		System.out.println("Insira o código do peso");
		Integer codPeso = sc.nextInt();
		System.out.println("Insira o peso");
		Integer peso = sc.nextInt();
		bc.registrarPesos(codPeso, peso);

	}

	public void registrarNotas() throws NotaInvalidaException {

		System.out.println("Insira a nota 1");
		Integer nota1 = sc.nextInt();

		System.out.println("Insira a nota 2");
		Integer nota2 = sc.nextInt();

		bc.registrarNotas(nota1, nota2);

	}

	public void mostrarConceito() throws ConceitoInvalidoException {
		System.out.println("Digite o cod do peso referente a nota 1:");
		Integer codPeso1=sc.nextInt();
		System.out.println("Digite o cod do peso referente a nota 2:");
		Integer codPeso2=sc.nextInt();
		String conceito = bc.calcularConceito(bc.calcularMedia(bc.getPeso(codPeso1), bc.getPeso(codPeso2), nota1, nota2));
		System.out.println(conceito);
	}

}
