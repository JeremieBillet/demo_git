
/**
 * 
 * @author Admin
 *
 */
public class Utilisateur {
	
	/*_________________props____________________*/
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	
	/*_________________ctors____________________*/
	public Utilisateur() {
	}
	

	public Utilisateur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}


	/*______________getters/setters________________*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	

}//end class
