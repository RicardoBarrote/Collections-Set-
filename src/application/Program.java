package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConjuntoConvidado;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ConjuntoConvidado conjuntoconvidado = new ConjuntoConvidado();

		System.out.println("Total de convidados no momento: " + conjuntoconvidado.contarConvidado());
		System.out.println();

		System.out.print("Informe quantos convidados será adicionado: ");
		int quantidadeConvidados = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= quantidadeConvidados; i++) {
			System.out.print("Nome convidado: ");
			String nomeConvidado = sc.nextLine();
			System.out.println("Código do convite " + i);

			conjuntoconvidado.adicionarConvidado(nomeConvidado, i);
		}
		System.out.println();
		System.out.println("Total de convidados no momento: " + conjuntoconvidado.contarConvidado());
		System.out.println("--------------------------------");
		conjuntoconvidado.exibirConvidados();

		System.out.println();
		System.out.print("Remover convidado: ");
		int removerConvidado = sc.nextInt();
		
		conjuntoconvidado.removerConvidadoPorCodigo(removerConvidado);
		System.out.println();
		System.out.println("Convidados: ");
		conjuntoconvidado.exibirConvidados();
		System.out.println("Código terminado. ");
		sc.close();
	}

}
