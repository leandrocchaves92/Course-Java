package unidade3;

import javax.swing.JOptionPane;

public class Locadora {

	public static void main(String[] args) {
		
		var titulo_filme = JOptionPane.showInputDialog("Digite o título do filme: ");
		int duracao_filme_horas = Integer.parseInt((JOptionPane.showInputDialog("informe o numero de horas do filme: ")));
		int duracao_filme_minutos = Integer.parseInt((JOptionPane.showInputDialog("informe o numero de minutos do filme: ")));
		int nova_duracao_filme = duracao_filme_horas * 60 + duracao_filme_minutos;
		
		JOptionPane.showMessageDialog(null, "A duraçõa do filme em minutos é: "+nova_duracao_filme);
		
		
	}

}
