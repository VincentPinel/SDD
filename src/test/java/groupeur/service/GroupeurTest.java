package groupeur.service;

import static com.google.common.collect.Sets.newHashSet;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

import java.util.HashSet;
import java.util.Set;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.google.common.collect.Sets;

import groupeur.model.GroupeDeParticipants;
import groupeur.model.Participant;

class GroupeurTest {

	@Test
	void quandGroupe_unParticipant_dansUnGroupe_verifieAjouteLeParticipantAuGroupe() {
		Participant unParticipant = mock(Participant.class);
		GroupeDeParticipants groupe = mock(GroupeDeParticipants.class);
		
		Set<GroupeDeParticipants> listeDesGroupes = new Groupeur().groupe(newHashSet(unParticipant), newHashSet(groupe));
		
		Mockito.verify(groupe).ajoute(unParticipant);
	}
	
//	@Test
//	void quandGroupe_DeuxParticipants_avecUneTailleDeGroupesDeUn_retourneUnEnsembleDeDeuxGroupes() {
//		Participant unParticipant = mock(Participant.class);
//		Participant unAutreParticipant = mock(Participant.class);
//		GroupeDeParticipants groupe = mock(GroupeDeParticipants.class);
//		Groupeur service = new Groupeur();
//		
//		Set<GroupeDeParticipants> listeDesGroupes = service.groupe(newHashSet(unParticipant), newHashSet(groupe));
//		
//		assertThat(listeDesGroupes, contains(any(GroupeDeParticipants.class), any(GroupeDeParticipants.class)));
//	}

}
