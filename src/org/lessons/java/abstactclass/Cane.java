package org.lessons.java.abstactclass;

public class Cane extends Animale {
	// instance variables
	private String breed;
	private final String food = "meat";
	
	// constructor
	public Cane(String name, String species, String breed) {
		super(name, species);
		this.breed = breed;
	}
	
	// Override makeASound method
	@Override
	public String makeASound() {
		return getName() + " says: Woof woof.";
	}
	
	// Getters and Setters
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
