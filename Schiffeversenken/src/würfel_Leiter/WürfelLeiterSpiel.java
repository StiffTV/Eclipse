package w�rfel_Leiter;


public class W�rfelLeiterSpiel {
	private Spieler sp1;
	private Spieler sp2;
	private W�rfel wuerfel[];

	public W�rfelLeiterSpiel() {
		// TODO Auto-generated constructor stub
		wuerfel = new W�rfel[3];
	}
	public void anmeldenSpieler(){
		
	}
	public void registrierenSpieler(){
		
	}
	public void spielen(){
		sp1 = new Spieler();
		sp2 = new Spieler();
		
		int test = 0;
		
		while (test == 0) {
			
			if(sp1.wuerfeln() == true){
				System.out.println(sp1.getName() + "hat Gewonnen!!");
				test= 1;
			}
			if(sp1.wuerfeln() == true){
				System.out.println(sp2.getName() + "hat Gewonnen!!");
				test = 1;
			}
		}
		
	}
	private void ermittleGewinner(){
		
	}
}
