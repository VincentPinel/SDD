package groupeur.model;

import java.util.Set;

public class GroupeDeParticipants {

	private final int tailleMax;
	private Set<Participant> participants;

	public GroupeDeParticipants(int tailleMax) {
		this.tailleMax = tailleMax;
	}

	public void ajoute(Participant unParticipant) {
		this.participants.add(unParticipant);
	}
	
	public boolean isPlein() {
		return this.participants.size() >= tailleMax;
	}

}
