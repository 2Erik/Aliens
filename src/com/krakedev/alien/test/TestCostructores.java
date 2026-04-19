package com.krakedev.alien.test;

import com.krakedev.alien.Alien;

public class TestCostructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien alien1 = new Alien(50, "Rojo");
		Alien alien2 = new Alien(15, "Azul");
		
		alien1.imprimir();
		System.out.println("--------------------------------");
		alien2.imprimir();
	}

}
