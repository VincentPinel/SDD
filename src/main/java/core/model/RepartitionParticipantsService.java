package core.model;

import java.util.Set;

import afficheur.service.AfficheurService;
import groupeur.model.CreateurDeGroupes;
import groupeur.model.GroupeDeParticipants;
import groupeur.model.Participant;
import groupeur.service.Groupeur;
import parser.service.FichierParticipantsParserService;

public class RepartitionParticipantsService {

	public void repartit(int tailleDesGroupes) {
		FichierParticipantsParserService parser = new FichierParticipantsParserService();
		Set<Participant> participants = parser.donneParticipants();
		Set<GroupeDeParticipants> groupesVides = new CreateurDeGroupes(participants.size(), tailleDesGroupes).creeGroupes();
		Set<GroupeDeParticipants> groupesFormes = new Groupeur().groupe(participants, groupesVides);
		new AfficheurService(groupesFormes).affiche();
	}

}
