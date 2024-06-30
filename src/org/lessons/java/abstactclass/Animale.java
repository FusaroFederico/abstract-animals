package org.lessons.java.abstactclass;

public abstract class Animale {
	// instance variables
	private String name;
	private String species;
	private String food;
	
	// constructor
	public Animale(String name) {
		this.name = name;
	}
	
	// goToSleep method
	public void goToSleep() {
		System.out.println(this.name + " sta dormendo, Zzz!");
	}
	
	// whatEat abstract method
	public abstract void whatEat();
	
	// makeASound abstract method
	public abstract void makeASound();
	
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
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
}
