package groupeur.model;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Set;

import org.junit.jupiter.api.Test;



public class CreateurDeGroupesTest {
	
	@Test
	public void quandCreeGroupes_pour1ParticipantEtTailleMax1_renvoieUnGroupe() {
		CreateurDeGroupes createur = new CreateurDeGroupes(1, 1);
		
		int nombreGroupes = createur.determineNombreGroupes();
		
		assertThat(nombreGroupes, is(1));
	}
	
	@Test
	public void quandCreeGroupes_pour2ParticipantEtTailleMax1_renvoieDeuxGroupes() {
		CreateurDeGroupes createur = new CreateurDeGroupes(2, 1);
		
		int nombreGroupes = createur.determineNombreGroupes();
		
		assertThat(nombreGroupes, is(2));
	}
	
	@Test
	public void quandCreeGroupes_pour2ParticipantEtTailleMax2_renvoieUnGroupe() {
		CreateurDeGroupes createur = new CreateurDeGroupes(2, 2);
		
		int nombreGroupes = createur.determineNombreGroupes();
		
		assertThat(nombreGroupes, is(1));	
	}
	
	@Test
	public void quandCreeGroupes_pour5ParticipantEtTailleMax2_renvoie3Groupes() {
		CreateurDeGroupes createur = new CreateurDeGroupes(5, 2);
		
		int nombreGroupes = createur.determineNombreGroupes();
		
		assertThat(nombreGroupes, is(3));	
	}
	
}
