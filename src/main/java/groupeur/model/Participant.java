package groupeur.model;

import org.apache.poi.ss.usermodel.Row;

public class Participant {
	String nom;
	String prenom;
	String sexe;
	String ville;
	String squad;
	String role;

	public Participant(String nom, String prenom, String sexe, String ville,
			String squad, String role) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.ville = ville;
		this.squad = squad;
		this.role = role;
	}

	public Participant(Row row) {
		this.nom = row.getCell(0).toString();
		this.prenom = row.getCell(1).toString();
		this.sexe = row.getCell(2).toString();
		this.ville = row.getCell(3).toString();
		this.squad = row.getCell(5).toString();
		this.role = row.getCell(6).toString();
	}
	
}