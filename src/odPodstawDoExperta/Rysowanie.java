package odPodstawDoExperta;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rysowanie extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelRysowiak panelDoRysowania = new PanelRysowiak();
	public Rysowanie() {
		this.setTitle("Rysowanie");
		this.setBounds(200, 300, 300, 250);
		
		this.getContentPane().add(panelDoRysowania);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Rysowanie().setVisible(true);
	}

}


class PanelRysowiak extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public PanelRysowiak() {
		super();
		this.add(new JButton("Test") {
			@Override 		// nadpisujemy metodê paintComponent, aby moc dodawac tam wlasna zawartosc
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				g.drawString("Napis", 0, 10); // Rysuje napis w danej pozycji na buttonie
			}
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Napis", 0, 10); // Rysuje napis w danej pozycji na buttonie
		g.drawLine(10, 20, 30, 10);
		System.out.println(i++);
	};
	public static int i = 0;
}