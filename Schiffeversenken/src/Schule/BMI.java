package Schule;

public class BMI {
	private double gr��e;
	private double gewicht;
	private double BMi;
	
	public void gr��e(double i){
		this.gr��e = i;
	}
	public void gewicht(double i){
		this.gewicht = i;
	}
	public double BMIBer(){
		this.gr��e*=this.gr��e;
		 this.gr��e = this.gewicht/ this.gr��e;
		this.BMi=Math.rint(this.gr��e*100)/100; 
		return this.BMi;
	}
	public void auswertung(String MoW){
		System.out.println("Ihr BMI: " + BMi);
		System.out.println("Ihr Gewicht ist: ");
		if(MoW.equals("w")){
			if(BMi<19){
				System.out.println("Untergewicht");
			}else if(BMi>19&&BMi<24){
				System.out.println("Normalgewicht");
			}else if(BMi>24&&BMi<30){
				System.out.println("�bergewicht");
			}else if(BMi>30&&BMi<40){
				System.out.println("Adipositas(Fettleibigkeit)");
			}else if(BMi>40){
				System.out.println("massive Adipositas");
			}
		}else if(MoW.equals("m")){
			if(BMi<20){
				System.out.println("Untergewicht");
			}else if(BMi>20&&BMi<25){
				System.out.println("Normalgewicht");
			}else if(BMi>25&&BMi<30){
				System.out.println("�bergewicht");
			}else if(BMi>30&&BMi<40){
				System.out.println("Adipositas(Fettleibigkeit)");
			}else if(BMi>40){
				System.out.println("massive Adipositas");
			}
		}
	}
}
