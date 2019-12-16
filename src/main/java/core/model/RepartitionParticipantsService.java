package core.model;

import java.util.Set;

import afficheur.service.AfficheurService;
import groupeur.model.GroupeDeParticipants;
import groupeur.model.Participant;
import groupeur.service.GroupeurService;
import parser.service.FichierParticipantsParserService;

public class RepartitionParticipantsService {

	public void repartit() {
		FichierParticipantsParserService parser = new FichierParticipantsParserService();
		Set<Participant> participants = parser.donneParticipants();
		Set<GroupeDeParticipants> groupes = new GroupeurService(participants).groupe();
		new AfficheurService(groupes).affiche();
	}

}
