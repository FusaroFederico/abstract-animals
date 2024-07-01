package org.lessons.java.abstactclass;

public class Main {

	public static void main(String[] args) {
		// instance new animals
		Cane billy = new Cane("billy", "boxer");
		Passerotto jonh = new Passerotto("john", "città");
		Aquila selma = new Aquila("selma", "aquila reale");
		Delfino willy = new Delfino("willy", "delfino azzurro");
		
		// test methods
		billy.goToSleep();
		jonh.goToSleep();
		selma.whatEat();
		willy.makeASound();
		
		// test interfaces
		AnimalStaticActions.faiVolare(selma);
		AnimalStaticActions.faiNuotare(willy);
	}

}
