package Operacoes_com_objeto_Aluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CriaObjetoAluno extends Aluno {
	
	

	CriaObjetoAluno() {

		this.setDataMatricula(JOptionPane.showInputDialog("digite a data da martricula do aluno"));
		this.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do aluno"));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno"));
		this.setIdade(idade);
		this.setNome(JOptionPane.showInputDialog("Nome do aluno"));
		this.setNomeEscola(JOptionPane.showInputDialog("Nome da escola"));
		this.setNomeMae(JOptionPane.showInputDialog("Nome da mae do aluno"));
		this.setNomePai(JOptionPane.showInputDialog("Nome do pai do aluno"));
		this.setNumeroCpf(JOptionPane.showInputDialog("Numero do cpf do aluno"));
		this.setRegistroGeral(JOptionPane.showInputDialog("Numero do rg do aluno"));
		this.setSerieMatriculado(JOptionPane.showInputDialog("Série em que o aluno será matriculado"));
		diciplinaENota();
      
	}

	public void diciplinaENota() {
    
		String diciplinas="";
		
		List<Double> nota = new ArrayList();
		nota.add(0.0);
		List diciplina = new ArrayList();
		List notasEDiciplinas = new ArrayList();
		for (int i = 0; i <nota.size(); i++) {
    
			 diciplina.add(diciplinas);
			 diciplinas = JOptionPane.showInputDialog(" digite a Diciplina ou digite sair para sair ");

			if(diciplinas.equals("sair"))
				break;
			
			double notas = Integer.parseInt(JOptionPane.showInputDialog("nota ?"));
			 nota.add(notas);	
			
			
			
			
		}
		this.setDiciplina(diciplina);
		this.setNotas(nota);
		
		
		int somar = JOptionPane.showConfirmDialog(null,"deseja obter a media do aluno ");
		if(somar == 0) {
		reprovadoAprovado(nota);
		}
		else {
			System.exit(0);
		}

	}

	public void reprovadoAprovado(List nota) {
		double media = 0;
		JOptionPane.showMessageDialog(null, nota);
		for (int i = 0; i< nota.size(); i++) {
          
		    media = media + (Double)nota.get(i);
		    
		}
		/*
		 * if(mediaAluno(notas[0],notas[1],notas[2]) > 7) {
		 * System.out.println("Aluno aprovado"); }else {
		 * System.out.println("Aluno reprovado"); }
		 */

		JOptionPane.showMessageDialog(null,
				 (media/nota.size()+1> 7  ? "aprovado" : "reprovado"));
		JOptionPane.showMessageDialog(null,  "sua media foi : "+ media/(nota.size()-1));
	}

	

	public static void main(String[] args) {
    
		CriaObjetoAluno criarAluno = new CriaObjetoAluno();
	}
}
