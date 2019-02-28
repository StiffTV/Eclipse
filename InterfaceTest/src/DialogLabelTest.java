import javax.swing.*;
import java.util.*;

public class DialogLabelTest {
	private String test = "TestWort";

	public DialogLabelTest() {
		Scanner sc = new Scanner(System.in);

		// Erzeugen eines neuen Frames 1.
		JFrame hauptFrame = new JFrame("Rechner");
		//damit programm endet wenn man fenster schlie�st
		hauptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. gr��e festlegen
		hauptFrame.setSize(400, 400);
		// 3.Sichtbar machen
		hauptFrame.setVisible(true);
		// 4. Komponenten hinzuf�gen(In diesen fall JLabel)
		hauptFrame.add(new JLabel("Bitte geben Sie A ein"));
		test = sc.next();
		if (test.equals("A")) {
			// Dialog wird erzeugt Vorteil : verhindert das bedienen das unterliegenden
			// Fenstern
			// deshalb gut f�r ZB fehlermelungen
			JDialog dialogRichtig = new JDialog();
			dialogRichtig.setSize(200, 200);
			// Wir modal gesetzt dh. �berdeckt fenster(Frame)
			dialogRichtig.setModal(true);
			dialogRichtig.setVisible(true);
			dialogRichtig.add(new JLabel("Richig"));

		}
	}

	public static void main(String args[]) {
		new DialogLabelTest();
	}
}