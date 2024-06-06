package Operacoes_com_objeto_Aluno;

import java.util.ArrayList;
import java.util.List;

public class Diciplina {
	
	
	public List notasEDiciplinas(List nomeDisciplina, List notaDisciplina) {
		
		List diciplinasENotas = new ArrayList();
		diciplinasENotas.add(nomeDisciplina);
		diciplinasENotas.add(notaDisciplina);
		
		return diciplinasENotas;
	}

}
