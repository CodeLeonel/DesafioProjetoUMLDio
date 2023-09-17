package produtos;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public abstract class SmartPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	protected float tamanho;
	
	protected String processador;
	
	protected String bateria;
	
}
