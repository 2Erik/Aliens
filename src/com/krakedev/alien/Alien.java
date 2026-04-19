package com.krakedev.alien;

public class Alien {
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidades;
	private double precioOjo;
	private double precioCuerpo;
	
	//CONSTRUCTOR
	public Alien(int tamanio, String color) {
		if(tamanio < 5) {
			this.tamanio = 5;
		}else if (tamanio > 30) {
			this.tamanio = 30;
		}else {
			this.tamanio = tamanio;
		}
		
		this.precioCuerpo = 0.2 * this.tamanio;
		this.precioExtremidades = 0.1 * this.tamanio;
		this.precioOjo = 0.05 * this.tamanio;
		
		this.color = color;
	}
	
	//GETTERS
	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidades() {
		return precioExtremidades;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}
	
	//METODO IMPRIMIR
	public void imprimir() {
		String mensaje;
		mensaje = "Tamaño: "+tamanio
				+"\nColor: "+color
				+"\n# Ojos: "+numeroOjos
				+"\n# Brazos: "+numeroBrazos
				+"\n# Pies: "+numeroPies
				+"\nPrecio Extremidades: "+precioExtremidades
				+"\nPrecio Ojos: "+precioOjo
				+"\nPrecio Cuerpo: "+precioCuerpo;
		
		System.out.println(mensaje);
	}
	
}
