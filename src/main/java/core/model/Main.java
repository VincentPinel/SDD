package core.model;

public class Main {

	private static final int TAILLE_MAX_DES_GROUPES = 2;

	public static void main(String[] args) {
		RepartitionParticipantsService service = new RepartitionParticipantsService();
		service.repartit(TAILLE_MAX_DES_GROUPES);
	}
	
}
