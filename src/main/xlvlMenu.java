package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class xlvlMenu {

	// Text Buttons For Each Level
	public Rectangle gothamButton = new Rectangle((main.WIDTH * main.SCALE) / 9 + 10, 525, 150, 50);
	public Rectangle utsaButton = new Rectangle((main.WIDTH * main.SCALE) / 9 + 325, 525, 150, 50);
	public Rectangle metroButton = new Rectangle((main.WIDTH * main.SCALE) / 9 + 640, 525, 150, 50);
	public Rectangle backButton = new Rectangle((main.WIDTH * main.SCALE) / 14, 650, 100, 50);

	// Image Buttons Of The Levels
	public Rectangle dImageButton = new Rectangle((main.WIDTH * main.SCALE) / 15 + 2, 256, 256, 256);
	public Rectangle wImageButton = new Rectangle((main.WIDTH * main.SCALE) / 8 + 256, 256, 256, 256);
	public Rectangle sImageButton = new Rectangle((main.WIDTH * main.SCALE) / 8 + 570, 256, 256, 256);

	/**
	 * Renders locations, fonts, sizes, and dynamics of the texts stored inside
	 * the generated buttons.
	 * 
	 * @param g
	 */
	public void render(Graphics g) {
		// Declarations
		Graphics2D g2d = (Graphics2D) g;
		Font f1 = new Font("arial", (Font.BOLD + Font.ITALIC), 60);
		Font f2 = new Font("arial", Font.BOLD, 30);

		// Title
		g.setFont(f1);
		g.setColor(Color.RED);
		g.drawString("CHOOSE A LEVEL", (main.WIDTH * main.SCALE) / 4, 150);

		// Button Text
		g.setFont(f2);
		// drawing Desert Level Button
		g.drawString("GOTHAM", gothamButton.x , gothamButton.y + 35);
		g2d.draw(dImageButton);
		// drawing Water Level Button
		g.drawString("UTSA", utsaButton.x + 30, utsaButton.y + 35);
		g2d.draw(wImageButton);
		// drawing Space Level Button
		g.drawString("METROPOLIS", metroButton.x - 20, metroButton.y + 35);
		g2d.draw(sImageButton);
		// drawing Back Level Button
		g.drawString("Back", backButton.x + 15, backButton.y + 35);
		g2d.draw(backButton);
	}
}
