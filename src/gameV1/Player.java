package gameV1;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

	public Player(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		
	}

	public void tick() {
		// TODO Auto-generated method stub
		x += volX;
		y += volY;
	}

	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 32, 32);
	}
}
