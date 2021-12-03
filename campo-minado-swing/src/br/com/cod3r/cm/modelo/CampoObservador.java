package br.com.cod3r.cm.modelo;

@FunctionalInterface
public interface CampoObservador {
	
	public void eventOcorreu(Campo campo, CampoEvento evento);
}
