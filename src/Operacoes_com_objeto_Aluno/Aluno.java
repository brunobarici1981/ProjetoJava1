package Operacoes_com_objeto_Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.swing.JOptionPane;

public class Aluno {

	private String nome, registroGeral, numeroCpf, nomeMae, nomePai, dataNascimento, dataMatricula, nomeEscola,
			serieMatriculado;
	private int idade;
	private List notas;
	private List diciplina;

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
		this.serieMatriculado = serieMatriculado;
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

	public List getNotas() {
		return notas;
	}

	public void setNotas(List notas) {
		this.notas = notas;
	}

	public List getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(List diciplina) {
		this.diciplina = diciplina;
	}

	public void comparaAlunos(Aluno aluno1, Aluno aluno2) {

		if (aluno1.equals(aluno2)) {
			JOptionPane.showMessageDialog(null, "Iguais");
		} else {
			JOptionPane.showMessageDialog(null, "Diferentes");
		}

	}

	public String toString() {
		return "Aluno [nome=" + getNome() + ", RegistroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataNascimento=" + dataNascimento
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", idade=" + idade + "]";
	}

	public static void main(String[] args) {

		/*
		 * Aluno aluno1 = new Aluno(); aluno1.setNumeroCpf("311258");
		 * 
		 * Aluno aluno2 = new Aluno(); aluno2.setNumeroCpf("31125");
		 * 
		 * Aluno aluno3 = new Aluno(); aluno3.comparaAlunos(aluno1, aluno2);
		 */

	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(numeroCpf, other.numeroCpf);
	}
}
