package WorldEngine;
import java.awt.*;
public class ComponentTest extends Panel {
	TextField text;
	List list;
	public ComponentTest()
	{
		text = new TextField();
		list = new List();
		list.setMultipleSelections(false);
		setLayout(new BorderLayout());
		add("North", text);
		add("Center" , list);
	}
}
