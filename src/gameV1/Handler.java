package gameV1;


import java.awt.Graphics;
import java.util.LinkedList;
public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick()
	{
		for(int a = 0; a < object.size(); a++)
		{
			GameObject tempObject = object.get(a);
			tempObject.tick();
		}
	}
	
	public void render(Graphics g)
	{
		for(int a = 0; a < object.size(); a++)
		{
			GameObject tempObject = object.get(a);
			
			tempObject.render(g);
		}
	}
	
	
	public void addObject(GameObject object)
	{
		this.object.add(object);
	}
	
	public void removeObject(GameObject object)
	{
		this.object.remove(object);
	}
}
