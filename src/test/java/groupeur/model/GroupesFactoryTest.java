package groupeur.model;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class GroupesFactoryTest {

	private static final int UN_GROUPE = 1;
	private static final int TROIS_GROUPES = 3;

	@Test
	void quandDeclare_1Groupe_renvoieUnEnsembleDe1Groupe() {
		Set<GroupeDeParticipants> groupesDeclares = new GroupesFactory(UN_GROUPE, 0).declareGroupes();
		
		assertThat(groupesDeclares, contains(any(GroupeDeParticipants.class)));
		assertThat(groupesDeclares.size(), is(1));
	}
	
	@Test
	void quandDeclare_3Groupes_renvoieUnEnsembleDe3Groupes() {
		Set<GroupeDeParticipants> groupesDeclares = new GroupesFactory(TROIS_GROUPES, 0).declareGroupes();
		
		assertThat(groupesDeclares, contains(any(GroupeDeParticipants.class), any(GroupeDeParticipants.class), any(GroupeDeParticipants.class)));
		assertThat(groupesDeclares.size(), is(3));
	}
	
}
