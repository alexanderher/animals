package udem.edu.co.animals;

import udem.edu.co.animals.abstrat.Herbivoro;
import udem.edu.co.animals.interfaces.Animal;

/**
 * @autor Alexander Hernandez
 * @since 08-08-2020
 * @version 1.0
 * Clase que describe un gato y su comportamiento
*/
public class Conejo extends Herbivoro implements Animal {

	//atributos globales
	private int legs;
	private String color;
	
	/**
	 *
	 * Constructor de la clase 
	*/
	public Conejo() {
		this(4,"sin definir");
	}

	/**
	 * Constructor de la clase
	 * @param legs
	 *       cantidad de patas del Conejo
	 * @param color
	 *       color del Conejo
	 */
	public Conejo(int legs, String color) {
		super();
		this.comida="plantas";
		this.legs = legs;
		this.color = color;
	}

	/**
	 * Metodo obligado por la interfaz para diferenciar al animal
	 */
	@Override
	public void desplazar() {
		// TODO Auto-generated method stub
		
	}

	//getters and setters
	
	/**
	 * @return the legs
	 */
	public int getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "yo tengo un conejo que tiene "+ this.getLegs()+" patas, es de color "+this.getColor()+" le gusta comer "+super.comida+" y es mi favorito en todo el mundo";
	}

}
