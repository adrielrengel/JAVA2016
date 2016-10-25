package br.adriel;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class Calc implements Serializable {

	/**
	 * sessao tem um ciclo de vida
	 * coloca o beam no estado de pasivação - dormir - para economizar recursos
	 * sem anotação @requestedscoped
	 * esse exemplo é de Scope Dependent, que garante um beam para cada usuario
	 * 
	 * com a anotaçao e um requested scoped
	 * lembrar dos 3 primeiros para a prova
	 * 
	 * javaee tutorial scoped
	 * 
	 * WELD instancia os paranaues para eles funcionarem
	 */
	private static final long serialVersionUID = 8594594220205053390L;
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public void inc(){
		this.valor++;
	}
}
