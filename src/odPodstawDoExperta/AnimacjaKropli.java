package odPodstawDoExperta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimacjaKropli extends JFrame{
	
	public AnimacjaKropli() {
//		ustawianie parametrow okna w konstruktorze
		this.setTitle("Animacja Kropli");
		this.setBounds(300, 300, 300, 300);
//		tworzenie buttona z napisem
		JButton bStart = (JButton) panelButton.add(new JButton("Start"));
		
		bStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				startAnimation();
			}
		});
		panelAnimacji.setBackground(Color.GRAY);
		this.getContentPane().add(panelAnimacji);
		this.getContentPane().add(panelButton, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void startAnimation() {
		panelAnimacji.addKropelka();
	}
	
	private JPanel panelButton = new JPanel();
	private PanelAnimacji panelAnimacji = new PanelAnimacji();
	public static void main(String[] args) {
		new AnimacjaKropli().setVisible(true);
	}

	class PanelAnimacji extends JPanel{

		public void addKropelka() {
			listaKropelek.add(new Kropelka());
			for(int i = 0; i<1000;i++) {
				for (Kropelka kropelka : listaKropelek) {
					kropelka.ruszKropelka(this);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
					this.paint(getGraphics());
				}				
			}
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(Kropelka kropelka : listaKropelek) {
				g.drawImage(Kropelka.getImg(), kropelka.x, kropelka.y, null);
			}
		}
		ArrayList<Kropelka> listaKropelek = new ArrayList<>();
	}
	
}

class Kropelka{
	
	public static Image getImg() {
		return kropelka; 
	}
	public void ruszKropelka(JPanel panel) {
		Rectangle granicePanelu = panel.getBounds();
		x+=dx;
		y+=dy;
		if(y+yKropelki >= granicePanelu.getMaxY()) {
			y = (int) (granicePanelu.getMaxY()-yKropelki);
			dy = -dy;
		}
		if(x+xKropelki >= granicePanelu.getMaxX()) {
			x = (int) (granicePanelu.getMaxX()-xKropelki);
			dx = -dx;
		}
		if(y < granicePanelu.getMinY()) {
			y = (int) granicePanelu.getMinY();
			dy = -dy;
		}
		if(x < granicePanelu.getMinX()) {
			x = (int) granicePanelu.getMinX();
			dx = -dx;
		}
	}
	public static Image kropelka = new ImageIcon("kropelka.gif").getImage();
	int x = 0, y= 0;
	int dx = 1, dy = 1;
	double xKropelki = kropelka.getWidth(null);
	double yKropelki = kropelka.getHeight(null);

}