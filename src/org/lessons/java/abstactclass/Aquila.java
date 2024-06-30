package org.lessons.java.abstactclass;

public class Aquila extends Animale implements Volante{
	// instance variables
	private String habitat;
	private int age;
	
	// constructor method
	public Aquila(String name, String species) {
		super(name);
		setSpecies(species);
		setFood("altri animali");
	}
	public Aquila(String name, String species, String habitat, int age) {
		super(name);
		setSpecies(species);
		setFood("altri animali");
		this.age = age;
		this.habitat = habitat;
	}

	@Override
	public void whatEat() {
		System.out.println(getName() + " eat " + getFood());
	}
	
	@Override
	public void makeASound() {
		System.out.println(getName() + " is screeching.");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
	
	//Getters and Setters
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
