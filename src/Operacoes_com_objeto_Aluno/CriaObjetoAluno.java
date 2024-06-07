package Operacoes_com_objeto_Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import constantes.StatusAluno;

public class CriaObjetoAluno extends Aluno {
	
	List listaAluno = new ArrayList();
	Aluno aluno = new Aluno();
	
	CriaObjetoAluno() {
        
		
		aluno.setDataMatricula(JOptionPane.showInputDialog("digite a data da martricula do aluno"));
		aluno.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do aluno"));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno"));
		aluno.setIdade(idade);
		aluno.setNome(JOptionPane.showInputDialog("Nome do aluno"));
		aluno.setNomeEscola(JOptionPane.showInputDialog("Nome da escola"));
		aluno.setNomeMae(JOptionPane.showInputDialog("Nome da mae do aluno"));
		aluno.setNomePai(JOptionPane.showInputDialog("Nome do pai do aluno"));
		aluno.setNumeroCpf(JOptionPane.showInputDialog("Numero do cpf do aluno"));
		aluno.setRegistroGeral(JOptionPane.showInputDialog("Numero do rg do aluno"));
		aluno.setSerieMatriculado(JOptionPane.showInputDialog("Série em que o aluno será matriculado"));
		diciplinaENota();
		listaAluno.add(aluno);
      
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
		reprovadoAprovado(this.getNotas());
		}
		else {
			System.exit(0);
		}
        
		listaNotasEDiciplinas(nota,diciplina);
	}

	public boolean reprovadoAprovado(List nota) {
		double media = 0;
		JOptionPane.showMessageDialog(null, nota);
		for (int i = 0; i< nota.size(); i++) {
          
		    media = media + (Double)nota.get(i);
		 }
		
	    boolean status = (media/nota.size()+1> 7  ? true : false);
	    
		aprovadoReprovado(listaAluno,media,nota,status);
		
		 return status;  
	}
	
	
	
	public void  listaNotasEDiciplinas(List notas,List diciplinas) {
		
		notas.remove(0);
		System.out.println("Diciplinas \n "+ diciplinas +" \n notas" + notas + " aluno "+ aluno.toString());
	}
	
	public void aprovadoReprovado( List aluno, double media, List nota,boolean status) {
		
		for(int i = 0; i<aluno.size(); i++) {
			if(status) {
				
			}
				}
		JOptionPane.showMessageDialog(null,
				 (status ? StatusAluno.APROVADO : StatusAluno.REPROVADO));
		
		JOptionPane.showMessageDialog(null,  "sua media foi : "+ media/(nota.size()-1));
	}
public void separarAlunosAprovadosReprovados(Aluno aprovados,Aluno reprovados,Aluno recuperacao) {
		
		HashMap<String,List<Aluno>> maps = new HashMap<String, List <Aluno>>();
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.get(StatusAluno.APROVADO).add(aprovados);
		maps.put(StatusAluno.RECUPERACAO , new ArrayList<Aluno>());
		maps.get(StatusAluno.RECUPERACAO).add(recuperacao);
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.get(StatusAluno.REPROVADO).add(reprovados);
		
		JOptionPane.showMessageDialog(null,maps.get(aprovados));
		
		
		
		
	}
	

	

	public static void main(String[] args) {
    
		CriaObjetoAluno criarAluno = new CriaObjetoAluno();
	}
}
