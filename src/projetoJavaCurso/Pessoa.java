package projetoJavaCurso;

import Operacoes_com_objeto_Aluno.Aluno;

import java.util.Date;

public class Pessoa extends Aluno {

	private String nome, sobrenome, endereco, cpf;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private int idade;
	private String dataNascimento;

	public String getDataNascimento() {
		return  dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Bruno", "43899030", "3112245", "sonia", "alvaro", "09/10/1981", "06/06/2024",
				"Mario Reis", "3°", 1);
		System.out.println(aluno.toString());
	}

}
