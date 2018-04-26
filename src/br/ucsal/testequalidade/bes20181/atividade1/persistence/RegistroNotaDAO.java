package br.ucsal.testequalidade.bes20181.atividade1.persistence;

import java.util.HashMap;

public class RegistroNotaDAO
{

	HashMap<Integer, Integer> pesos;
	HashMap<Integer, Integer> notas;

	public void inserirPeso(Integer codigoPeso, Integer peso)
	{
		pesos.put(codigoPeso, peso);
	}

	public Integer recuperarPeso(Integer codigoPeso)
	{
		return pesos.get(codigoPeso);
	}

	public void inserirNota(Integer codigoNota, Integer nota)
	{
		notas.put(codigoNota, nota);
	}

}
