package applicationProduct;

import java.util.Locale;
import java.util.Scanner;

import entities.produto.CadastroProduto;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CadastroProduto cadastroproduto = new CadastroProduto();

		// Neste exercicio irei colocar os valores direto, sem interação com usuário.

		System.out.println("Valores no Set: ");
		cadastroproduto.imprimirProduct();
		System.out.println();

		cadastroproduto.adicionarProduto(1, "Iphone-X", 3000.0, 100);
		cadastroproduto.adicionarProduto(2, "Galaxy", 4800.0, 200);
		cadastroproduto.adicionarProduto(3, "Inspirion-15", 2987.0, 50);

		System.out.println("Valores atualizados: ");
		cadastroproduto.imprimirProduct();
		System.out.println();

		System.out.println("Exibir valores ordenador por nome: ");
		System.out.println(cadastroproduto.exibirProdutosPorNome());
		System.out.println();

		System.out.println("Exibir valores ordenador por preco: ");
		System.out.println(cadastroproduto.exibirPorPreco());

		sc.close();
	}

}
