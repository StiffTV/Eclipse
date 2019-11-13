package w�rfel_Leiter;

import java.util.Random;
import java.util.Scanner;

public class Spieler {

	private String name;
	private int anzGewonneneSpiele;
	private W�rfel wuerfel[];
	private Leiterkarte leiterkarte;
	
	public Spieler(String n, W�rfel wuerfel[]) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.wuerfel = wuerfel;
		
		for (int i = 0; i < wuerfel.length; i++) {
			wuerfel[i] = new W�rfel();
		}
		leiterkarte = new Leiterkarte();
	}

	public boolean wuerfeln (){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		ausgabeLeiterkarte();
		
		for (int i = 0; i < wuerfel.length; i++) {
			wuerfel[i].setAugenzahl(rand.nextInt(6)+1);
		}
		
		System.out.println(name+ "("+ anzGewonneneSpiele +")" + " hat Gew�rfelt: ");
		ausgabeW�rfel();
		
		for (int i = 0; i < wuerfel.length; i++) {
			System.out.println("W�rfel " + (i+1) +" Nochmal ? j/n");
			if(sc.next().equals("j")){
				wuerfel[i].setAugenzahl(rand.nextInt(6)+1);
				System.out.print("Es wurde gew�rfelt: ");
				ausgabeW�rfel();
			}
		}
		for (int i = 0; i < wuerfel.length; i++) {
			

			for (int j = 0; j < wuerfel.length; j++) {
			if(wuerfel[j].getAugenzahl() == (sucheNechsteStufe()+1)){
				leiterkarte.setlK(true, sucheNechsteStufe());
			}
		}
			
				
		}
		ausgabeLeiterkarte();
		System.out.println("-------------------------");
		for (int i = 0; i < leiterkarte.getlK().length; i++) {
			if(leiterkarte.getlKW(i) == false){
				return false;
			}
		}
		return true;
	}
	public void zaehleGewinn(){
		
	}
	private int sucheNechsteStufe(){
		for (int i = 0; i < leiterkarte.getlK().length; i++) {
			if(leiterkarte.getlKW(i) == false){
				return i;
			}
			
		}
		return 0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnzGewonneneSpiele() {
		return anzGewonneneSpiele;
	}

	public void setAnzGewonneneSpiele(int anzGewonneneSpiele) {
		this.anzGewonneneSpiele = anzGewonneneSpiele;
	}

	public W�rfel[] getWuerfel() {
		return wuerfel;
	}

	public void setWuerfel(W�rfel[] wuerfel) {
		this.wuerfel = wuerfel;
	}

	public Leiterkarte getLeiterkarte() {
		return leiterkarte;
	}

	public void setLeiterkarte(Leiterkarte leiterkarte) {
		this.leiterkarte = leiterkarte;
	}

	private void ausgabeW�rfel(){
		for (int i = 0; i < 3; i++) {
			System.out.print(wuerfel[i].getAugenzahl() + " ");
		}
		System.out.println();
	}
	private void ausgabeLeiterkarte(){
		for (int i = 0; i < 6; i++) {
			System.out.println(i+1 + ": " + ((leiterkarte.getlKW(i) == true) ? "Erreicht": " "));;
		}
	}
}
