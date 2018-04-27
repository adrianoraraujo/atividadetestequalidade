package br.ucsal.testequalidade.bes20181.atividade1.tui;

import br.ucsal.testequalidade.bes20181.atividade1.business.RegistroNotaBC;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.ConceitoInvalidoException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;

public class Atividade1Entry {

	public static void main(String[] args) throws NotaInvalidaException, PesoInvalidoException, ConceitoInvalidoException {
		
		RegistroNotaTui registroNotaTui = new RegistroNotaTui();
		
		
		registroNotaTui.registrarPesos();
		
		registroNotaTui.registrarNotas();
		
		registroNotaTui.mostrarConceito();
		
		
	}
	
}
