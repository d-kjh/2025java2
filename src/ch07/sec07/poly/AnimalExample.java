package ch07.sec07.poly;

import javax.print.attribute.standard.PDLOverrideSupported;

public class AnimalExample {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		Cow cow = new Cow();
		Dog dog = new Dog();

		animalCrying(cat);
		animalCrying(tiger);
		animalCrying(cow);
		animalCrying(dog);
	}
	public static void animalCrying(Animal animal){
		animal.crying();
	}
}
