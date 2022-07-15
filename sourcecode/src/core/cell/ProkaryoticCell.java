package core.cell;

import core.division.Amitosis;
import core.division.GrowMethod;
import core.division.GrowThenFuse;
import core.division.ReproduceMethod;

public class ProkaryoticCell extends Cell{

	public ProkaryoticCell(String name) {
		super(name);
		this.growMethod = new GrowThenFuse();
		this.reproduceMethod = new Amitosis();
		this.imgDir = super.imgDir + "Prokaryotes/" + name;
	}
}
