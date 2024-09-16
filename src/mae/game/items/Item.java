package mae.game.items;

import java.awt.image.BufferedImage;

import mae.game.Entity;
import mae.game.GamePanel;

public class Item extends Entity {

	public Item(GamePanel gp) {
		super(gp);
		this.gp = gp;
		description = "";
	}
	
	public void use() {}
	
	public BufferedImage getImage() {
		return image;
	}
}