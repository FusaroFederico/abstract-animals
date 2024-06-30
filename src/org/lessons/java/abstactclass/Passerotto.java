package org.lessons.java.abstactclass;

public class Passerotto extends Animale implements Volante{
	// instance variables
	private String habitat;
	
	// constructor method
	public Passerotto(String name, String habitat) {
		super(name);
		this.habitat = habitat;
		setSpecies("Passer domesticus");
		setFood("cereali e piccoli insetti");
	}
	public Passerotto(String name,String habitat, String food) {
		super(name);
		this.habitat = habitat;
		setSpecies("Passer domesticus");
		setFood(food);
	}
	
	@Override
	public void whatEat() {
		System.out.println(getName() + " eat " + getFood());
	}

	@Override
	public void makeASound() {
		System.out.println(getName() + " says: Cip cip.");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
	
	// Getters and Setters
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}
