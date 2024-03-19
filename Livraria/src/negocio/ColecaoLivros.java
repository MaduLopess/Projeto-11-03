package negocio;

import modelagem.Livro;

public class ColecaoLivros {

	public Livro[] listaLivros = new Livro[2];

	public void adicionarLivros(int posicao, Livro livro) {
		listaLivros[posicao] = livro;

	}
}
