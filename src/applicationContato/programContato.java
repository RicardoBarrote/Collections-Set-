package applicationContato;

import java.util.Locale;
import java.util.Scanner;

import entities.contato.AgendaContato;

public class programContato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AgendaContato agendacontato = new AgendaContato();

		System.out.println("Contatos atuais: ");
		agendacontato.imprimirContato();
		System.out.println();

		System.out.print("Adicionar contato [1], sair [2]: ");
		int escolha = sc.nextInt();

		while (escolha != 2) {
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeContato = sc.nextLine();
			System.out.print("Numero: ");
			String numeroContato = sc.next();
			System.out.println();
			agendacontato.adicionarContato(nomeContato, numeroContato);

			System.out.print("Adicionar contato [1], sair [2]: ");
			escolha = sc.nextInt();
		}
		System.out.print("Informe o nome do contato: ");
		sc.nextLine();
		String contatoNome = sc.nextLine();
		System.out.println(agendacontato.pesquisarPorNome(contatoNome));
		
		System.out.println();

		System.out.println("Atualizar numero.");
		
		System.out.print("Nome do contato que deseja alterar o numero: ");
		String nomeAlterarNumero = sc.nextLine();
		System.out.print("Informe o novo numero: ");
		String novoNumero = sc.next();
		agendacontato.atualizarNumeroContato(nomeAlterarNumero, novoNumero);

		System.out.println();
		System.out.println("Contatos atualizados: ");
		agendacontato.imprimirContato();

		sc.close();
	}

}
