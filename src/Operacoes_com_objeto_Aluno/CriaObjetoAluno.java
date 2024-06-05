package Operacoes_com_objeto_Aluno;

import javax.swing.JOptionPane;

public class CriaObjetoAluno extends Aluno{
	
	CriaObjetoAluno(){
	 
		
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
	 
	}

	public static void main(String[] args) {
		
		CriaObjetoAluno aluno = new CriaObjetoAluno();
		JOptionPane.showMessageDialog(null,aluno.toString());
       
		
	}
}
