package br.adriel;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class CalcFactory {

	@Produces 
	@Criado
	@RequestScoped
	public Calc criarNovoCalc(){
		
		System.out.println("criado");
		Calc c = new Calc();
		c.setValor(10);
		
		return c;
	}
	
	public void theTerminator(@Disposes @Criado  Calc calc){
		System.out.println("finalizando calc");
		calc.setValor(0);
	}
}
