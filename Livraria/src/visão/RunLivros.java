package visão;

import javax.swing.JOptionPane;

import modelagem.Livro;
import negocio.ColecaoLivros;

public class RunLivros {

	public static void main(String[] args) {

		ColecaoLivros colecaolivros = new ColecaoLivros();

		Livro livroUm = new Livro();
		Livro livroDois = new Livro();

		JOptionPane.showMessageDialog(null, "BEM-VINDOS AO REGISTRO DE LIVROS!");
		JOptionPane.showMessageDialog(null, "Clique em OK para prosseguir");

		livroUm.setTitulo(JOptionPane.showInputDialog("Insira o título do primeiro livro: "));
		livroUm.setAutor(JOptionPane.showInputDialog("Insira o nome do autor: "));
		livroUm.setCategoria(JOptionPane.showInputDialog("Insira a categoria do livro: "));

		livroDois.setTitulo(JOptionPane.showInputDialog("Insira o título do segundo livro: "));
		livroDois.setAutor(JOptionPane.showInputDialog("Insira o nome do autor: "));
		livroDois.setCategoria(JOptionPane.showInputDialog("Insira a categoria do livro: "));

		
		
		colecaolivros.adicionarLivros(0, livroUm);
		colecaolivros.adicionarLivros(1, livroDois);
		
		JOptionPane.showMessageDialog(null, "Confira os livros registrados");
		JOptionPane.showMessageDialog(null, "------ PRIMEIRO LIVRO ------" + 
		"\n Título: " +livroUm.getTitulo()+ 
		"\n Autor: " +livroUm.getAutor() +
		"\n Categoria: " + livroUm.getCategoria());

		JOptionPane.showMessageDialog(null, "------ SEGUNDO LIVRO ------" + 
				"\n Título: " +livroDois.getTitulo()+ 
				"\n Autor: " +livroDois.getAutor() +
				"\n Categoria: " + livroDois.getCategoria());
		
		System.out.println("------PRIMEIRO LIVRO -------");
		System.out.println("Título: " + livroUm.getTitulo() + " Autor: " + livroUm.getAutor() + " Categoria: "
				+ livroUm.getCategoria());

		System.out.println(" ------SEGUNDO LIVRO ------");
		System.out.println("Título: " + livroDois.getTitulo() + " Autor: " + livroDois.getAutor() + " Categoria: "
				+ livroDois.getCategoria());

	}

}
