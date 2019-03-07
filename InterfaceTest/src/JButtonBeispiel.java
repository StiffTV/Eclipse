import javax.swing.*;
 
public class JButtonBeispiel
{
    public static void main(String[] args)
    {
        JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("JButton Beispiel");
        JPanel panel = new JPanel();
 
        // JButton mit Text "Dr�ck mich" wird erstellt
        JButton button = new JButton("Dr�ck mich");
 
        // JButton wird dem Panel hinzugef�gt
        panel.add(button);
 
        meinJFrame.add(panel);
 
        // Fenstergr��e wird so angepasst, dass 
        // der Inhalt reinpasst    
        meinJFrame.pack();
 
        meinJFrame.setVisible(true);
    }
}