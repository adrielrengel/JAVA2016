package br.adriel;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ContadorRequest implements Serializable {
	/**
	 * adicionar o serailVersionUID
	 * ++count -pre incremento  = 1
	 * count++ pos incremento   = 0
	 */
	private static final long serialVersionUID = -7590050187471583744L;
	private int count;

	public int getNumero() {
		return ++count;
	}	
}
