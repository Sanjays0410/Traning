package com.cruds.demo;

public class Testanimal {
	public static void main(String[] args) {
		Animal a=Animalprovider.getAnimal("javalub");
		a.talk();
	}

}
