 package br.com.cod3r.cm.visao;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.*;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador {
	
	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(184, 66, 68);
	private final Color BG_VERDE = new Color(0, 100, 0);
	
	private Campo campo;
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		
		campo.registraObservador(this);
	}
	
	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloEsplodir();
			break;
		default: 
			aplicarEstiloPadrao();
		}
	}

	private void aplicarEstiloPadrao() {
		
	}

	private void aplicarEstiloEsplodir() {
		
	}

	private void aplicarEstiloMarcar() {
		
	}

	private void aplicarEstiloAbrir() {
		
	}
}
