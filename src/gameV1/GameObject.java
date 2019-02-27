package gameV1;

import java.awt.Graphics;

public abstract class GameObject {
	protected int x, y;
	protected ID id;
	protected int volX, volY;
	public GameObject(int x, int y, ID id)
	{
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int newX)
	{
		x = newX;
	}
	
	public void setY(int newY)
	{
		y = newY;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setID(ID newId)
	{
		id = newId;
	}
	
	public ID getId()
	{
		return id;
	}
	
	public void setVolX(int newX)
	{
		volX = newX;
	}
	
	public void setVolY(int newY)
	{
		volY = newY;
	}
	
	public int getVolX()
	{
		return volX;
	}
	
	public int getVolY()
	{
		return volY;
	}

}
