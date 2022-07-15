package core.cell;

import java.util.ArrayList;

import core.component.Component;
import core.division.GrowMethod;
import core.division.ReproduceMethod;
import core.initializer.Initializer;

public abstract class Cell {
	private String name;
	private ArrayList<Component> components = new ArrayList<Component>();
	protected GrowMethod growMethod;
	protected ReproduceMethod reproduceMethod;
	protected String imgDir;
	
	public Cell(String name) {
		super();
		this.name = name;
		this.imgDir = "/guiImages/CellImages/";
		Initializer.getCellList().add(this);
	}
	
	public void addComponent(Component[] toAdd) {
		for (Component component: toAdd) {
			components.add(component);
		}
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Component> getComponents() {
		return components;
	}
	
}
