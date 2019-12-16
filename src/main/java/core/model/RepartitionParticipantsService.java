package core.model;

import java.util.Set;

import afficheur.service.AfficheurService;
import groupeur.model.CreateurDeGroupes;
import groupeur.model.GroupeDeParticipants;
import groupeur.model.GroupesDeParticipants;
import groupeur.model.GroupesFactory;
import groupeur.model.Groupeur;
import groupeur.model.Participant;
import parser.service.FichierParticipantsParserService;

public class RepartitionParticipantsService {

	public void repartit(int tailleDesGroupes) {
		FichierParticipantsParserService parser = new FichierParticipantsParserService();
		Set<Participant> participants = parser.donneParticipants();
		int nombreGroupes = new CreateurDeGroupes(participants.size(), tailleDesGroupes).determineNombreGroupes();
		Set<GroupeDeParticipants> groupesDeclares = new GroupesFactory(nombreGroupes, tailleDesGroupes).declareGroupes();
		GroupesDeParticipants groupesARemplir = new GroupesDeParticipants(groupesDeclares);
		GroupesDeParticipants groupesFormes = new Groupeur(participants, groupesARemplir).groupe();
		new AfficheurService(groupesFormes).affiche();
	}

}
