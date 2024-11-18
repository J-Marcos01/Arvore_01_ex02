package controller;

import br.edu.fatezl.arvore_char.Arvore;

public class ArvoreController {

	public ArvoreController() {
		super();
	}
	
	public void execucao(char[]vet) {
		
		Arvore arvore=new Arvore();
		
		for(char elemento:vet) {
			arvore.Insert(elemento);
			}
		
		System.out.println("Removendo F");
		arvore.remove('F');

		System.out.println("Removendo U");
		arvore.remove('U');
		
		try {
			System.out.println("Pré ordem :");
			arvore.prefixSearch();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("\nordem :");
			arvore.infixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("\nPós ordem :");
			arvore.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
