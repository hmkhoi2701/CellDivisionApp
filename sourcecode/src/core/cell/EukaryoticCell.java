package core.cell;

import core.division.GrowMethod;
import core.division.Meiosis;
import core.division.Mitosis;
import core.division.ReproduceMethod;

public class EukaryoticCell extends Cell{

	public EukaryoticCell(String name) {
		super(name);
		this.growMethod = new Mitosis();
		this.reproduceMethod = new Meiosis();
		this.imgDir = super.imgDir + "/Eukaryotes/" + name;
	}
}