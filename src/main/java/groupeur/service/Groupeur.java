package groupeur.service;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import groupeur.model.GroupeDeParticipants;
import groupeur.model.Participant;

public class Groupeur {

	public Set<GroupeDeParticipants> groupe(Set<Participant> participants, Set<GroupeDeParticipants> groupesVides) {
		return newHashSet(new GroupeDeParticipants());
	}

}
