package groupeur.model;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

public class GroupesFactory {

	private final int nombreGroupes;
	private final int tailleMax;

	public GroupesFactory(int nombreGroupes, int tailleMax) {
		this.nombreGroupes = nombreGroupes;
		this.tailleMax = tailleMax;
	}

	public Set<GroupeDeParticipants> declareGroupes() {
		Set<GroupeDeParticipants> groupes = newHashSet();
		for (int i = 0; i < nombreGroupes; i++) {
			groupes.add(new GroupeDeParticipants(tailleMax));
		}
		return groupes;
	}
	
}
