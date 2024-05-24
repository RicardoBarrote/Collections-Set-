package entities.produto;

import java.util.Objects;

public class Product implements Comparable<Product>{

	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;

	public Product() {

	}

	public Product(int codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + " Preco: " + String.format("%.2f", preco) + " codigo: " + codigo + " quantidade: "
				+ quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return codigo == other.codigo;
	}

	@Override
	public int compareTo(Product p) {
		return nome.compareToIgnoreCase(p.getNome());
	}

}
