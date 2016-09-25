package main;

import java.awt.Canvas;

/**
 * Model controls when and what things update in the game. This includes game
 * states, updating player/obstacle locations, and initializing the game frame
 * with its elements accordingly.
 */
@SuppressWarnings("serial")
public class Model extends Canvas {

	// Variable Declarations
	public STATE State = STATE.sMenu;
	public boolean easter = false;
	public boolean pause = false;
	public boolean over = false;
	public Textures tex;
	public Controller c;
	public Controller c2;
	public sMenu sMenu;
	public pMenu pMenu;
	public lvlMenu lvlMenu;
	public hMenu hMenu;
	public View view;
	public Gameover gameover;
	public Player p;
	public HitDetection h;
	public xhMenu xhMenu;
	public xpMenu xpMenu;
	public xsMenu xsMenu;
	public xlvlMenu xlvlMenu;
	public xGameover xGameover;
	public int tickcontrol = 0;
	boolean resetTimer = false;

	/**
	 * The following method creates different States of the game. Upon boot, the
	 * game state is set to MENU. Once the user selects to play the game, the
	 * game state is set to GAME and the game begins.
	 */
	public enum STATE {
		dGame, wGame, sGame, eGame, sMenu, pMenu, 
		lvlMenu, hMenu, gameover, gGame, uGame, mGame
	};

	/**
	 * Initializes the Frame and the graphics upon startup
	 * 
	 * @param view
	 */
	public void visualize(View view) {
		this.view = view;
		view.initPanel();
		view.initialize();
	}

	/**
	 * Updates movements of the objects + Includes Player and Block
	 * 
	 * [Notice] The game only begins once the state is identified in the
	 * "State.Game" mode.
	 */
	@SuppressWarnings("static-access")
	void tick() {
		if (State == State.dGame || State == State.wGame 
				|| State == State.sGame || State == State.eGame
				|| State == State.gGame || State == State.uGame
				|| State == State.mGame) {
			if (pause != true) {
				p.tick();
				c.tick();
				tickcontrol++;
				// wait 100 ticks before drawing next line of blocks to ensure
				// enough space for player to get
				if (tickcontrol > 100) {
					c2.tick();
				}
			}
		}
	}

	/**
	 * Identifies the State of the game and returns and integer to be referenced
	 * with the rest of the program.
	 */
	@SuppressWarnings("static-access")
	public int getState() {
		if (State == State.dGame) {
			return 1;
		}
		if (State == State.wGame) {
			return 2;
		}
		if (State == State.sGame) {
			return 3;
		} else if (State == State.sMenu) {
			return 4;
		} else if (State == State.pMenu) {
			return 5;
		} else if (State == State.lvlMenu) {
			return 6;
		} else if (State == State.hMenu) {
			return 7;
		} else {
			return 1;
		}
	}
}