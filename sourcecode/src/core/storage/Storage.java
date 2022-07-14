package core.storage;

import java.util.ArrayList;

import core.cell.EukaryoticCell;
import core.cell.ProkaryoticCell;
import core.component.Component;

public class Storage {
	public static ArrayList<Component> componentStorage;
	
	
	
	public void mainInitializer() {
		EukaryoticCell animal = new EukaryoticCell("Animal", "10 to 100 microns");
		ProkaryoticCell bacteria = new ProkaryoticCell("Bacteria", "1 to 1.5 microns");
	}
}
