package br.ucsal.testequalidade.bes20181.atividade1.business;

import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.persistence.RegistroNotaDAO;

public class RegistroNotaBC
{

	public RegistroNotaDAO registroNotaDAO = new RegistroNotaDAO();

	public void registrarPesos(Integer codigoPeso, Integer valorPeso)
	{
		registroNotaDAO.inserirPeso(codigoPeso, valorPeso);
	}

	public void registrarNotas(Integer codigoNota, Integer nota2)
	{
		registroNotaDAO.inserirNota(codigoNota, nota2);
	}

	public void validarPeso(Integer peso)
	{
		if (peso < 1)
		{

		}
	}

	public void validarNota(Integer nota) throws NotaInvalidaException
	{
		if (nota == null)
		{
			throw new NotaInvalidaException();
		}
	}

	public Integer calcularMedia(Integer nota1, Integer nota2)
	{
		return null;
	}

	public String calcularConceito(Integer media)
	{
		return null;
	}

}
