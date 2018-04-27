package br.ucsal.testequalidade.bes20181.atividade1.business;

import br.ucsal.testequalidade.bes20181.atividade1.exceptions.ConceitoInvalidoException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;
import br.ucsal.testequalidade.bes20181.atividade1.persistence.RegistroNotaDAO;

public class RegistroNotaBC {

	public RegistroNotaDAO registroNotaDAO = new RegistroNotaDAO();

	public void registrarPesos(Integer codigoPeso, Integer valorPeso) throws PesoInvalidoException {
		validarPeso(valorPeso);
		registroNotaDAO.inserirPeso(codigoPeso, valorPeso);
	}

	public void registrarNotas(Integer nota1, Integer nota2) throws NotaInvalidaException {
		validarNota(nota1);
		validarNota(nota2);
		registroNotaDAO.inserirNota(nota1, nota2);
	}

	public void validarPeso(Integer peso) throws PesoInvalidoException {
		if (peso < 1 || peso > 10) {
			throw new PesoInvalidoException();
		}
	}

	public void validarNota(Integer nota) throws NotaInvalidaException {
		if (nota < 0 || nota > 100 || nota == null) {
			throw new NotaInvalidaException();
		}
	}

	public Integer getPeso(Integer codigoPeso) {
		Integer peso = registroNotaDAO.recuperarPeso(codigoPeso);
		return peso;
	}

	public Integer calcularMedia(Integer peso1, Integer peso2, Integer nota1, Integer nota2) {

		Integer media = ((peso1 * nota1) + (peso2 * nota2)) / (peso1 + peso2);
		return media;
	}

	public String calcularConceito(Integer media) throws ConceitoInvalidoException {
		String conceito;
		if (media >= 0 && media < 25) {
			conceito = "Insuficiente";
		} else if (media < 50) {
			conceito = "Regular";
		} else if (media < 75) {
			conceito = "Bom";
		} else if (media <= 100) {
			conceito = "Ótimo";
		} else {
			throw new ConceitoInvalidoException();
		}
		return conceito;
	}

}
