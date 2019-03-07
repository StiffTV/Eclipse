// Import-Anweisungen
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
 
public class JMenuItemBeispiel
{
    // main-Methode
    public static void main(String[] args)
    {
        /* Erzeugung eines neuen Frames */
        JFrame meinJDialog = new JFrame("JMenuBar f�r unser Java Tutorial Beispiel.");
        
        
        // Wir setzen die Breite auf 450 und die H�he auf 300 Pixel
        meinJDialog.setSize(450,300);
        // Zur Veranschaulichung erstellen wir hier eine Border
        Border bo = new LineBorder(Color.yellow);
        // Erstellung einer Men�leiste
        JMenuBar bar = new JMenuBar();
        // Wir setzen unsere Umrandung f�r unsere JMenuBar
        bar.setBorder(bo);
        // Erzeugung eines Objektes der Klasse JMenu
        JMenu menu = new JMenu("Ich bin ein JMenu");
        // Erzeugung eines Objektes der Klasse JMenuItem
        JMenuItem item = new JMenuItem("Ich bin das JMenuItem");
        // Wir f�gen das JMenuItem unserem JMenu hinzu
        menu.add(item);
        // Men� wird der Men�leiste hinzugef�gt
        bar.add(menu);
        // Men�leiste wird f�r den Dialog gesetzt
        meinJDialog.setJMenuBar(bar);
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);
    }
}