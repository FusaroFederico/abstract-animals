package org.lessons.java.abstactclass;

public class Delfino extends Animale {
	// instance variables
	private int age;
	private boolean hasOffspring;
	
	// constructor method
	public Delfino(String name, String species) {
		super(name);
		setSpecies(species);
		setFood("pesci");
	}
	public Delfino(String name, String species, int age, boolean hasOffspring) {
		super(name);
		setSpecies(species);
		setFood("pesci");
		this.age = age;
		this.hasOffspring = hasOffspring;
	}

	@Override
	public void whatEat() {
		System.out.println(getName() + " eat " + getFood());
	}

	@Override
	public void makeASound() {
		System.out.println(getName() + " is whistling");
	}
	// Getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHasOffspring() {
		return hasOffspring;
	}
	public void setHasOffspring(boolean hasOffspring) {
		this.hasOffspring = hasOffspring;
	}
	
}
