package entities.produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.compare.ComparatorPreco;

public class CadastroProduto {

	Set<Product> setProduct = new HashSet<>();

	public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
		setProduct.add(new Product(codigo, nome, preco, quantidade));
	}

	public Set<Product> exibirProdutosPorNome() {
		Set<Product> produtosPorNome = new TreeSet<Product>(setProduct); // TreeSet faz a ordenação dos elementos
		return produtosPorNome;
	}

	public Set<Product> exibirPorPreco() {
		Set<Product> produtosPorPreco = new TreeSet<>(new ComparatorPreco());
		produtosPorPreco.addAll(setProduct);
		return produtosPorPreco;
	}
	
	public void imprimirProduct() {
		System.out.println(setProduct);
	}
}
