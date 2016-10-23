package br.adriel;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class ContadorSession implements Serializable {

	/**
	 * ++count -pre incremento  = 1
	 * count++ pos incremento   = 0
	 */
	private static final long serialVersionUID = -3358145959424530349L;
	private int count;

	public int getNumero() {
		return ++count;
	}
}
