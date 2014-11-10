/**
 * 
 */
package rentaco;

/**
 * @author eleve
 *
 */

public class Heure {
	
	private  int heures;
	private  int minutes;
	private  int secondes;
	

	/**
	 * @param heures
	 * @param minutes
	 * @param secondes
	 */
	public Heure(int heures, int minutes, int secondes)throws HeureException {
		super();
		
		if(heures > 23 || heures < 0){
			
			throw new HeureException();
			
		}
		
		else if(minutes > 59 || minutes < 0){
			
			throw new HeureException();
			
		}
		
		else if(secondes > 59){
			
			throw new HeureException();
		}
		else{
			this.heures = heures;
			this.minutes = minutes;
			this.secondes = secondes;
		}

	}
	
	
	
	/**
	 * @return heures
	 */
	public  int getHeures() {
		return heures;
	}

	/**
	 * @param heures
	 */
	public void setHeures(int heures) {
		this.heures = heures;
	}

	/**
	 * @return minutes
	 */
	public  int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * @return secondes
	 */
	public  int getSecondes() {
		return secondes;
	}

	/**
	 * @param secondes
	 */
	public void setSecondes(int secondes) {
		this.secondes = secondes;
	}

	@Override
	public String toString() {
		return heures + ":" + minutes + ":" + secondes;
	}

	public static void main(String [] args) throws HeureException{

			try{
				Heure heure1 = new Heure(9,8,11);
				System.out.println(heure1);
			}
			catch(HeureException h){

				System.out.println("Erreur"+" "+h.getMessage());
		
	}
}
}
