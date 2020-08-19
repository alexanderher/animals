package udem.edu.co.animals.abstrat;

/**
 * @autor Alexander Hernandez
 * @since 08-08-2020
 * @version 1.0
 * Clase abstracta que clasifica al animal como carnivoro
*/
public abstract class Carnivoro {
	
	//atributos globales
	public String comida;
	
	/**
	 *
	 * Constructor de la clase  Herbivoro sin Carnivoro
	*/
	public Carnivoro() {
		comida= "Carne";
	}
}
