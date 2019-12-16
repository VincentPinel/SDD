package groupeur.model;

import static com.google.common.collect.Sets.newHashSet;
import static java.lang.Math.ceil;

import java.util.Set;

public class CreateurDeGroupes {

	private final int nombreDeParticipants;
	private final int tailleDesGroupes;

	public CreateurDeGroupes(int nombreDeParticipants, int tailleDesGroupes) {
		this.nombreDeParticipants = nombreDeParticipants;
		this.tailleDesGroupes = tailleDesGroupes;
	}

	public Set<GroupeDeParticipants> creeGroupes() {
		Set<GroupeDeParticipants> groupesCrees = newHashSet();
		int nombreDeGroupesACreer = (int) ceil((double) nombreDeParticipants / tailleDesGroupes);
		for(int i = 0; i < nombreDeGroupesACreer; i++) {
			groupesCrees.add(new GroupeDeParticipants());
		}
		return groupesCrees;
	}

	
	
}
