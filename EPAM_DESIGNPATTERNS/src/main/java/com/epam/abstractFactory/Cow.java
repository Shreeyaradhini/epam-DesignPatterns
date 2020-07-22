package com.epam.abstractFactory;

public class Cow implements Animals{
	private String name;
	public Cow(){
		this.name = "Cow";
		eats();
		makeSound();
		sleeps();
	}
	
	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Cow is an Domestic Animal Herbivor");
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cow makes sound mooo mooo... ");
	}
	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		System.out.println("Cow sleeps for 4hrs");
	}
}
