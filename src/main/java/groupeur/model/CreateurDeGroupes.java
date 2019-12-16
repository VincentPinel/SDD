package groupeur.model;

import static java.lang.Math.ceil;

public class CreateurDeGroupes {

	private final int nombreDeParticipants;
	private final int tailleDesGroupes;

	public CreateurDeGroupes(int nombreDeParticipants, int tailleDesGroupes) {
		this.nombreDeParticipants = nombreDeParticipants;
		this.tailleDesGroupes = tailleDesGroupes;
	}

	public int determineNombreGroupes() {
		return (int) ceil((double) nombreDeParticipants / tailleDesGroupes);
	}

	
	
}
