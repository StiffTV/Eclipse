package w�rfel_Leiter;

public class Spieler {

	private String name;
	private int anzGewonneneSpiele;
	private W�rfel wuerfel[];
	private Leiterkarte leiterkarte;
	
	public Spieler(String n, W�rfel wuerfel[]) {
		// TODO Auto-generated constructor stub
		this.name = n;
		
		for (int i = 0; i < wuerfel.length; i++) {
			wuerfel[i] = null;
		}
	}

	public boolean wuerfeln (){
		
	}
}
