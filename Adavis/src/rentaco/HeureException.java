/**
 * 
 */
package rentaco;

/**
 * @author eleve
 *
 */

public class HeureException extends Exception{
	
	private Heure source;
	
	/**
	 * constructeur
	 */
	

	public HeureException() {
		super();
	}

	/**
	 * @param message
	 */
	public HeureException(String message) {
		super(message);
	}

	
	/**
	 * @param message
	 * @param source
	 */
	public HeureException(String message, Heure source) {
		super(message);
		this.source = source;
	}

	/**retourne source
	 * @param args
	 */
	public Heure getSource(){
		return source;

	}

}
