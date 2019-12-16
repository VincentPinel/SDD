package parser.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import groupeur.model.Participant;

import java.util.Set;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class FichierParticipantsParserServiceTest {
	@Test
	void recupereFichier() {
		
		FichierParticipantsParserService fichierParticipantsParserService = new FichierParticipantsParserService();
		
		Set<Participant> participants = fichierParticipantsParserService.donneParticipants();

		assertNotNull(participants);
		assertEquals(participants.size(), 73);
	}
}
