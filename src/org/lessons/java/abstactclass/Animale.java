package org.lessons.java.abstactclass;

public abstract class Animale {
	// instance variables
	private String name;
	private String species;
	
	// constructor
	public Animale(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	// goToSleep method
	public void goToSleep() {
		System.out.println(this.name + " sta dormendo, Zzz!");
	}
	
	// whatEat abstract method
	public abstract String whatEat();
	
	// makeASound abstract method
	public abstract String makeASound();
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
}
