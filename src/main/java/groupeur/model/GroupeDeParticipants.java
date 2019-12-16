package groupeur.model;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

public class GroupeDeParticipants {

	private final Set<Participant> participants;
	
	public GroupeDeParticipants() {
		this.participants = newHashSet();
	}

	public void ajoute(Participant unParticipant) {
		this.participants.add(unParticipant);
	}

}
