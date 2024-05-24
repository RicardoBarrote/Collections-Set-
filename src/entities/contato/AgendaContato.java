package entities.contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

	private Set<Contato> setContato = new HashSet<>();

	public void adicionarContato(String nome, String numero) {
		setContato.add(new Contato(nome, numero));
	}

	public void imprimirContato() {
		System.out.println(setContato);
	}

	public Set<Contato> pesquisarPorNome(String nome) {

		Set<Contato> contatosPorNome = new HashSet<>();

		for (Contato c : setContato) {
			if (c.getNome().startsWith(nome)) { // .startWith() método verifica se uma string começa com os caracteres
												// especificados.
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato (String nome, String novoNumero) {
		Contato contatoAtualizado = null;
		
		for (Contato c : setContato) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
}
