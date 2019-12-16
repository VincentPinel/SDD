package groupeur.model;

import java.util.Set;
import java.util.function.Consumer;

public class Groupeur {

	private final Set<Participant> participants;
	private final GroupesDeParticipants groupes;

	public Groupeur(Set<Participant> participants, GroupesDeParticipants groupes) {
		this.participants = participants;
		this.groupes = groupes;
	}

	public GroupesDeParticipants groupe() {
		participants.forEach(assigneAuMeilleurGroupeParmi(groupes));
		return groupes;
	}

	private Consumer<Participant> assigneAuMeilleurGroupeParmi(GroupesDeParticipants groupes) {
		return (participant) -> groupes.assigne(participant);
	}


}