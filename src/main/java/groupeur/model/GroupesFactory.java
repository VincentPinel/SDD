package groupeur.model;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

public class GroupesFactory {

	private final int nombreGroupes;

	public GroupesFactory(int nombreGroupes) {
		this.nombreGroupes = nombreGroupes;
	}

	public Set<GroupeDeParticipants> declareGroupes() {
		Set<GroupeDeParticipants> groupes = newHashSet();
		for (int i = 0; i < nombreGroupes; i++) {
			groupes.add(new GroupeDeParticipants());
		}
		return groupes;
	}
	
}
