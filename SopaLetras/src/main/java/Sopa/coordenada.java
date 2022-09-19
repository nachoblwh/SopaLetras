package Sopa;

import Coordenada.TableroException;

public class coordenada 
{
	
	private final int fila;
	private final int columna;
	private final Sentido sentido;
	
	public coordenada(int fila, int columna, Sentido sentido) throws TableroException {
		this.fila = fila;
		this.columna = columna;
		this.sentido = sentido;
		
		if(fila<0)
		{
			throw new TableroException("El numero de la fila es menor que 0");
		}
		else if(columna<0) {
			throw new TableroException("El numero de la columna es menor que 0");
		}
		else if(sentido == null) {
			throw new TableroException("El sentido del sentido no es valido");
		}
	}

	protected int getFila() {
		return this.fila;
	}

	protected int getColumna() {
		return this.columna;
	}

	protected Sentido getSentido() {
		return this.sentido;
	}
	
	
	
	
	
}
