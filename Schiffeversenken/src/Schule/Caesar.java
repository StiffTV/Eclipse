package Schule;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Caesar {

	public Caesar() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verschl�sselung(1) Entschl�sselung(0)");
		int verschl�sselung = sc.nextInt();
		
		System.out.println("Wort");
		String eingabe = sc.next();
		char[] eingabech = eingabe.toCharArray();
		
		byte[] bytes = eingabe.getBytes(StandardCharsets.US_ASCII);
		
		System.out.println("zahl");
		int verschiebung = sc.nextInt();
		
		for (int i = 0; i < eingabech.length; i++) {
			if(verschl�sselung == 1) {
			bytes[i]+=verschiebung;	
			}else if(verschl�sselung == 0) {
				bytes[i]-=verschiebung;	
			}
			}
		
		    System.out.println(new String(bytes, StandardCharsets.US_ASCII));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Caesar();
	}

}
