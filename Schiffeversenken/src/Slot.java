import java.util.Random;

public class Slot {

	public Slot() {
		// TODO Auto-generated constructor stub
		int zahl;
		int ziehen = 100;
		int leute = 5000000;
		int konto = 400;
		int gewinn = 0;
		int allesweg = 0; 
		int gewinner = 0;
		int h�chstgewinn = 0;
		int hauptgewinn = 0;
		int ziehungen = 0;
		int g100 = 0;
		int g50 = 0;
		int g10 = 0;
		int g5 = 0;
		int g1 = 0;
		Random rand = new Random();
		for (int j = 0; j < leute; j++) {
			
		
		konto = 50;
		for (int i = 0; i <ziehen; i++) {
			
		konto-=2;
		gewinn+=2;
		
		zahl = rand.nextInt(650)+1 ;
		ziehungen++;
		
		if (zahl == 1 ) {
			//System.out.println("Hauptgewinn");
			konto+=500;
			gewinn-=500;
			hauptgewinn++;
		}else if (zahl == 2||zahl == 3) {
			//System.out.println("100�");
			konto+=100;
			gewinn-=100;
			g100++;
		}else if (zahl >= 4&&zahl <= 7) {
			//System.out.println("50�");
			konto+=50;
			gewinn-=50;
			g50++;
		}else if (zahl >= 8&&zahl <= 15) {
			//System.out.println("10�");
			konto+=10;
			gewinn-=10;
			g10++;
		}else if (zahl >= 16&&zahl <= 30) {
			//System.out.println("5�");
			konto+=5;
			gewinn-=5;
			g5++;
		}else if (zahl>183&&zahl<367) {
			//System.out.println("1�");
			konto+=1;
			gewinn-=1;
			g1++;
		}else {
			//System.out.println("Niete");
		}
		if (konto <= 0) {
			i = ziehen;
			allesweg++;
		}
		}
		if (konto>50) {
			gewinner++;
		}
		if (konto>h�chstgewinn) {
			h�chstgewinn = konto;
		}
		System.out.println("Konto: " + konto + "�");
		}
		System.out.println("500� " + hauptgewinn + "  "+(double)  (hauptgewinn*100)/ziehungen + "%" + "\n100� " + g100+  "  "+(double)  (g100*100)/ziehungen + "%" +"\n50� " + g50
				+  "  "+(double)  (g50*100)/ziehungen + "%" +"\n10� " + g10+ "  "+ (double) (g10*100)/ziehungen + "%" + "\n5� " + g5 +  "  "+(double)  (g5*100)/ziehungen + "%" + "\n1� "+g1 +  "  "+((double )g1*100)/ziehungen + "%" +"\n"+
				"Ziehungen: " + ziehungen + "\n" +
				"H�chstGewinn: " + h�chstgewinn + "\n" +
				"Gewinner: " + gewinner + "  "+ (gewinner*100)/leute + "%" +"\n"+
				"alles WEG: " + allesweg +  "  "+ (allesweg*100)/leute + "%" +"\n"+
				"Gewinn: " + gewinn + "�" + "\n" + "Durschnitt: " +(double )gewinner/leute);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Slot();
	}

}
