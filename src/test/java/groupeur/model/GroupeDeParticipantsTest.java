package groupeur.model;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GroupeDeParticipantsTest {

	@Test
	public void quandAjoute1Participant_dansUnGroupeDeTailleMax1_groupeEstPlein() {
		GroupeDeParticipants groupe = new GroupeDeParticipants(1);
		
		Participant unParticipant = mock(Participant.class);
		groupe.ajoute(unParticipant);
		
		assertThat(groupe.isPlein(), is(true));
	}
	
}
