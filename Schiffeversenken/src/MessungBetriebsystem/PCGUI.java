package MessungBetriebsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingUtilities;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class PCGUI {
	private JFrame frame;
	JLabel lblNewLabel_1;
	private BS bs = new BS("Windows", 1, 0, new Prozess("Java", true, true, 3), "Intenso", 1000.0);
	private List<JLabel> panel = new ArrayList<JLabel>();
	private PC pc = new PC(bs, this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PCGUI window = new PCGUI();
					window.getFrame().setVisible(true);
					window.addLabel();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */

	public PCGUI() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("HDDs:");
		lblNewLabel.setBounds(10, 39, 46, 14);
		getFrame().getContentPane().add(lblNewLabel);
		panel.add(lblNewLabel);

		JLabel lblGesamtSpeicherplatz = new JLabel("Gesamt Speicherplatz:");
		lblGesamtSpeicherplatz.setBounds(283, 178, 141, 14);
		frame.getContentPane().add(lblGesamtSpeicherplatz);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(327, 203, 97, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblGb = new JLabel("GB");
		lblGb.setBounds(390, 203, 46, 14);
		frame.getContentPane().add(lblGb);
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Add New");
		menuBar.add(mnNewMenu);

		JMenuItem mntmAddHdd = new JMenuItem("Add HDD");
		mntmAddHdd.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				AddHDD addhdd = new AddHDD(pc);
			}
		});
		mnNewMenu.add(mntmAddHdd);
	}

	public void addLabel() {

		JLabel jl = new JLabel("");
		panel.add(jl);
		JLabel lastobject;

		lastobject = panel.get(panel.size() - 2);
		jl.setText(bs.toStringHDDs(panel.size() - 2));
		jl.setBounds(10, lastobject.getY() + lastobject.getHeight() + 5, 1000, 14);
		getFrame().getContentPane().add(jl);
		panel.set(panel.size()-2, jl);
		
		SwingUtilities.updateComponentTreeUI(frame);
		
		lblNewLabel_1.setText("FFFFFFFF");
		lblNewLabel_1.setText(Double.toString(bs.brerechneGesamtkazitaet()));
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
