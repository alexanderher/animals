package udem.edu.co;

import java.util.List;
import java.util.ArrayList;

import udem.edu.co.animals.Conejo;
import udem.edu.co.animals.Gato;
import udem.edu.co.animals.Perro;
import udem.edu.co.animals.interfaces.Animal;

public class Principal {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Perro());
		animals.add(new Gato());
		animals.add(new Conejo());
		for(Animal animal:animals) {
			System.out.println(animal.toString());
		}
		
	}

}
