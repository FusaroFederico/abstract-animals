package org.lessons.java.abstactclass;

public class Cane extends Animale implements Nuotante{
	// instance variables
	private String breed;
	
	// constructor
	public Cane(String name) {
		super(name);
		setSpecies("Canis lupus");
		setFood("carne");
	}
	public Cane(String name, String breed) {
		super(name);
		setSpecies("Canis lupus");
		setFood("carne");
		this.breed = breed;
	}
	public Cane(String name, String breed , String food) {
		super(name);
		setSpecies("Canis lupus");
		setFood(food);
		this.breed = breed;
	}
	
	// Override makeASound method
	@Override
	public void makeASound() {
		System.out.println(getName() + " says: Woof woof.");
	}
	
	// Override whatEat method
	@Override
	public void whatEat() {
		System.out.println(getName() + " eat " + getFood());
	}
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
	
	// Getters and Setters
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
