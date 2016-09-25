package main;

import java.awt.image.BufferedImage;

/**
 * Responsible for assigning the images pulled from the Sprite Sheet to
 * variables that the game can use.
 */
public class Textures {

	// Variable Declarations
	public SpriteSheet ss;
	public BufferedImage player, block;
	View view;
	Model model;

	/**
	 * <<Constructor>>
	 */
	public Textures(Model model, View view) {
		this.view = view;
		this.model = model;
		ss = new SpriteSheet(view.getSpriteSheet());
		getTextures();
	}

	/**
	 * Parsed images are assigned to variables ss.grabImage(Column, Row, Width,
	 * Height)
	 */
	public void getTextures() {
		player = ss.grabImage(1, 1, 64, 64);
		if(model.easter == true){
			block = ss.grabImage(6, 1, 32, 32);
		} else {
			block = ss.grabImage(4, 1, 32, 32);
		}
	}

	/**
	 * Getter: Returns Block Graphic/Image from SpriteSheet
	 */
	public BufferedImage getBlock() {
		return block;
	}

	/**
	 * Setter: Set Model block to Textures block
	 */
	public void setBlock(BufferedImage block) {
		this.block = block;
	}
}
