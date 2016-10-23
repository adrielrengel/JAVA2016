package br.adriel;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ContadorApp {
	private int count;

	public int getNumero() {
		return ++count;
	}


	
}
