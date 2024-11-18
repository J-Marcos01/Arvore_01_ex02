package view;

import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {

		char [] vet= {'M','F','S','D','J','P','U','A','E','H','Q','T','W','K'};
		
		ArvoreController cont = new ArvoreController();
		
		cont.execucao(vet);
	}

}
