package Operacoes_com_objeto_Aluno;
import projetoJavaCurso.Pessoa;

public class Aluno{

	private String nome, registroGeral, numeroCpf, nomeMae, nomePai, dataNascimento, dataMatricula, nomeEscola,
			serieMatriculado;
	int idade;
	
	public Aluno() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		serieMatriculado = serieMatriculado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public Aluno(String nome, String registroGeral, String numeroCpf, String nomeMae, String nomePai,
			String dataNascimento, String dataMatricula, String nomeEscola, String serieMatriculado, int idade) {
		setNome(nome);
		setRegistroGeral(registroGeral);
		setNumeroCpf(numeroCpf);
		setNomeMae(nomeMae);
		setNomePai(nomePai);
		setDataNascimento(dataNascimento);
		setDataMatricula(dataMatricula);
		setNomeEscola(nomeEscola);
		setSerieMatriculado(serieMatriculado);
		setIdade(idade);
	}
	
@Override
	public String toString() {
		return "Aluno \nnome=" + nome + "\nregistroGeral=" + registroGeral + "\nnumeroCpf=" + numeroCpf + "\nnomeMae="
				+ nomeMae + "\nnomePai=" + nomePai + "\ndataNascimento=" + dataNascimento + "\ndataMatricula="
				+ dataMatricula + "\nnomeEscola=" + nomeEscola + "\nSerieMatriculado=" + serieMatriculado + "\nidade="
				+ idade;
	}


public static void main(String[] args) {
	  
		
	}



}
