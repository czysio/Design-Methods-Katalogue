package krzysiek.olejnik.katalogue.utilities;

public class TablesForSelectsInForms {
	
	private String[] numberOfParticipants = {"1", "2", "3-5", "6-12", "13+"};
	private String[] stages = { "empatyzacja i zrozumienie", "obserwacja", "definiowanie problemu",
			"generowanie pomysłów", "budowanie prototypów", "testowanie", "implementowanie/wdrażanie",
			"podsumowanie i feedback" };
	
	public String[] getNumberOfParticipants() {
		return numberOfParticipants;
	}
	public String[] getStages() {
		return stages;
	}
	
	
	

}
