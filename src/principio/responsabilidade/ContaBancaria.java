package principio.responsabilidade;

import javax.swing.JOptionPane;

public class ContaBancaria {

	String descricao;
	double saldo = 8000.00;

	public void sacarDinherio(double valorSolicitado) {

		if (getSaldo() >=valorSolicitado) {
			subtrairDinheiro(valorSolicitado);
			JOptionPane.showMessageDialog(null, "Valor de : " + valorSolicitado + " autorizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Não há saldo suficiente para esta transação");
		}
	}

	public void depositarDinheiro(double valorDeposito) {
		setSaldo(valorDeposito+this.saldo);
		JOptionPane.showMessageDialog(null, "Deposito Realizado com sucesso");
	}

	public void escolherTransacao() {
		int opcao = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada 1 - sacar ou 2 - depositar?"));
		switch (opcao) {
		case 1:
			double valorSacar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor solicitado!"));
			sacarDinherio(valorSacar);
            break;
		case 2:
			double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
			depositarDinheiro(valorDeposito);
			JOptionPane.showMessageDialog(null," valor de : "+valorDeposito+" realizado com sucesso!");
			break;
			
			default : 
				JOptionPane.showInternalMessageDialog(null, "Selecione uma das opções válidas 1 para sacar ou 2 para depositar !");
				escolherTransacao();
		}

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void somarDinheiro(double saldo) {
		setSaldo(this.saldo = this.saldo+saldo);
	}

	public void subtrairDinheiro(double saldo) {
		setSaldo(this.saldo = this.saldo-saldo);
	}

}
