package entities;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

	private Set<Convidado> setConvidado = new HashSet<>();

	
	// Adicionando convidados no meu Set, fazendo a chamada do construtor da classe Convidado.
	public void adicionarConvidado(String nome, int codigo) {
		setConvidado.add(new Convidado(nome, codigo));
	}

	
	public void removerConvidadoPorCodigo(int codigoConvite) {
		Convidado convidadoParaRemover = null; 				// Váriavel auxiliar que vai receber o código que será removida do Set.

		for (Convidado c : setConvidado) { 				  // For each para pecorrer todo o setConvidado.
			if (c.getCodigoConvite() == codigoConvite) { // Condição, caso c tenha o mesmo código do convidado que será removido ->
				convidadoParaRemover = c; 				// -> Então minha váriavel auxiliar que era null vai passar a ter o valor de C, que será o codigo para remover
				break; // Break para parar a execução.
			}
		}
		setConvidado.remove(convidadoParaRemover); // Removemos do Set o valor do elemento que estará na váriavel auxiliar convidadoParaRemover.
	}

	
	public int contarConvidado() {
		return setConvidado.size(); // Retorna o tamanho do Set.
	}

	
	public void exibirConvidados() {
		System.out.println(setConvidado); // Imprimindo os valores de convidado
	}
}
