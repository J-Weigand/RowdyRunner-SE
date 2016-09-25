package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class xsMenu {

	// Generates Buttons on Menu
	public Rectangle playButton = new Rectangle((main.WIDTH * main.SCALE) / 9 + 100, 250, 100, 50);
	public Rectangle helpButton = new Rectangle((main.WIDTH * main.SCALE) / 9 + 100, 350, 100, 50);
	public Rectangle quitButton = new Rectangle((main.WIDTH * main.SCALE) / 9 + 100, 450, 100, 50);
	
	/**
	 * Renders locations, fonts, sizes, and dynamics of the texts stored inside
	 * the generated buttons.
	 * 
	 * @param g
	 */
	public void render(Graphics g) {
		// Declarations
		Graphics2D g2d = (Graphics2D) g;
		// Title
		Font f1 = new Font("arial", (Font.BOLD + Font.ITALIC), 60);
		g.setFont(f1);
		g.setColor(Color.RED);
		g.drawString("RowdierRunner", (main.WIDTH * main.SCALE) / 20, 150);
		Font f3 = new Font("arial", (Font.BOLD + Font.ITALIC), 30);
		g.setFont(f3);
		g.drawString("Special Edition", (main.WIDTH * main.SCALE) / 20 + 230, 180);
		// Buttons
		Font f2 = new Font("arial", Font.BOLD, 28);
		g.setFont(f2);
		// draws the Play Button
		g.drawString("Play", playButton.x + 19, playButton.y + 35);
		g2d.draw(playButton);
		// draws the Help Button
		g.drawString("Help", helpButton.x + 19, helpButton.y + 35);
		g2d.draw(helpButton);
		// draws the Theme Button
		g.drawString("Quit", quitButton.x + 19, quitButton.y + 35);
		g2d.draw(quitButton);

	}
}
