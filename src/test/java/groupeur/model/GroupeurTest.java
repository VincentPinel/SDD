package groupeur.model;

import static com.google.common.collect.Sets.newHashSet;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
	void quandGroupe_unParticipant_verifieAssigneLeParticipantAuxGroupes() {
		Participant unParticipant = mock(Participant.class);
		
		GroupesDeParticipants groupes = new Groupeur(newHashSet(unParticipant), mock(GroupesDeParticipants.class)).groupe();
		
		verify(groupes).assigne(unParticipant);
	}
	
	@Test
	void quandGroupe_deuxParticipants_verifieAssigneLesParticipantsAuxGroupes() {
		Participant unParticipant = mock(Participant.class);
		Participant unAutreParticipant = mock(Participant.class);
		
		GroupesDeParticipants groupes = new Groupeur(newHashSet(unParticipant, unAutreParticipant), mock(GroupesDeParticipants.class)).groupe();
		
		verify(groupes).assigne(unParticipant);
	}
	
	
	

}