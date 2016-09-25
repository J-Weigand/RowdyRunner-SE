package main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Responsible for interpreting key presses and releases.
 * 
 * @author Team 2
 *
 */
public class KeyController extends KeyAdapter implements KeyListener {

	// Variable Declaration(s)
	Model model;
	View view;

	/**
	 * <<Constructor>>
	 * 
	 * @param model
	 */
	public KeyController(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	/**
	 * Key Bindings (Start) + Identifies when arrow keys are PRESSED
	 */
	@SuppressWarnings("static-access")
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (model.getState() == 1 || model.getState() == 2 || model.getState() == 3) {
			if (key == KeyEvent.VK_RIGHT) {
				model.p.setVelX(5);
			} else if (key == KeyEvent.VK_LEFT) {
				model.p.setVelX(-5);
			} else if (key == KeyEvent.VK_DOWN) {
				model.p.setVelY(5);
			} else if (key == KeyEvent.VK_UP) {
				model.p.setVelY(-5);
			} else if (key == KeyEvent.VK_ESCAPE) {
				// click escape while playing will pause
				if (model.pause == false) {
					model.pause = true;
				}
				// if game over will stay "paused" *bug fix*
				else if (model.State == model.State.pMenu || model.pause == true && model.over == true) {
					model.pause = true;
				}
				// if paused will resume
				else {
					model.pause = false;
				}
			}
		}
		
		if(model.getState() == 4 || model.getState() == 5)
			if (key == KeyEvent.VK_X) {
				// Activates Easter Egg
				if (model.easter == false) {
					System.out.println("Easter = TRUE");
					model.easter = true;
				} else {
					System.out.println("Easter = FALSE");
					model.easter = false;
					view.genericMenu = view.menu_d;
					view.genericStart = view.startmenu_d;
					view.genericLevel = view.levelmenu_d;
				}
			}
	}

	/**
	 * Key Bindings (Stop) + Identifies when arrow keys are RELEASED
	 */
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (model.getState() == 1 || model.getState() == 2 || model.getState() == 3) {
			if (key == KeyEvent.VK_RIGHT) {
				model.p.setVelX(0);
			} else if (key == KeyEvent.VK_LEFT) {
				model.p.setVelX(0);
			} else if (key == KeyEvent.VK_DOWN) {
				model.p.setVelY(0);
			} else if (key == KeyEvent.VK_UP) {
				model.p.setVelY(0);
			}
		}
	}
}
