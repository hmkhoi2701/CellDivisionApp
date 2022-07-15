package core.initializer;

import java.util.ArrayList;

import core.cell.Cell;
import core.cell.EukaryoticCell;
import core.cell.ProkaryoticCell;
import core.component.Component;

public class Initializer {
	private static ArrayList<Cell> cellList = new ArrayList<Cell>();
	private static ArrayList<Component> componentList = new ArrayList<Component>();
	public void mainInitializer() {
		Component capsule = new Component("Capsule",
				"keep the cell from drying out and to protect it from phagocytosis (engulfing) by larger microorganisms");
		Component pili = new Component("Pili",
				"assist the body in attaching to other cells and surfaces, such as teeth, intestines, and rocks");
		Component nucleoid = new Component("Nucleoid",
				"responsible for replication");
		Component cytoplasm = new Component("Cytoplasm",
				"where the functions for cell growth, metabolism, and replication are carried out");
		Component flagellum = new Component("Flagellum",
				"help the cell move toward nutrients; away from toxic chemicals; or toward the light");
		Component plasmid = new Component("Plasmid",
				"give cell a selective advantage");
		Component cellWall = new Component("Cell Wall",
				"gives the cell its shape and surrounds the cytoplasmic membrane, protecting it from the environment");
		Component plasmaMembrane = new Component("Plasma Membrane",
				"encloses the interior of the bacterium, regulating the flow of materials in and out of the cell");
		Component mesosome = new Component("Mesosome",
				"increase the surface area of the cell, thus helping in aerobic respiration");
		Component ribosomes = new Component("Ribosomes",
				"translate the genetic code from the molecular language of nucleic acid to that of amino acids—the building blocks of proteins");
		
		Component[] addtoBacteria = new Component[]
				{capsule,pili,nucleoid,cytoplasm,flagellum,plasmid,cellWall,plasmaMembrane,mesosome,ribosomes};
		Component[] addtoArchaea = new Component[]
				{pili,nucleoid,cytoplasm,flagellum,plasmid,cellWall,plasmaMembrane,mesosome,ribosomes};
		
		ProkaryoticCell bacteria = new ProkaryoticCell("Bacteria");
		bacteria.addComponent(addtoBacteria);
		ProkaryoticCell archaea = new ProkaryoticCell("Archaea");
		archaea.addComponent(addtoArchaea);
		
		Component cilia = new Component("Cilia",
				"help the cell move toward nutrients; away from toxic chemicals; or toward the light");
		Component pellicle = new Component("Pellicle",
				"elastic in nature which supports the cell membrane");
		Component micronucleus = new Component("Micronucleus",
				"control reproduction of the cell");
		Component macronucleus = new Component("Macronucleus",
				"controls all the vegetative functions");
		Component foodVacuole = new Component("Food Vacuole",
				"associated with the digestive granules that aid in food digestion");
		Component anteriorContractileVacuole = new Component("Anterior Contractile Vacuole", 
				"osmoregulation, excretion, and respiration");
		Component postteriorContractileVacuole = new Component ("Posterior Contractile Vacuole",
				"osmoregulation, excretion, and respiration");
		Component analPore = new Component ("Anal Pore",
				"expels all waste material into the environment");
		Component cytosome = new Component ("Cytosome",
				"push food into Food vacuoles");
		Component oralGroove = new Component ("Oral Groove", 
				"extends into the cytostome");
		Component[] addtoProtist = new Component[] {cilia,pellicle,micronucleus,macronucleus,foodVacuole,
				anteriorContractileVacuole, postteriorContractileVacuole, analPore,cytosome, oralGroove};
		
		EukaryoticCell protist = new EukaryoticCell("Protist");
		protist.addComponent(addtoProtist);
		
		Component microtubules = new Component("Microtubules",
				"transport materials across the cytoplasm into and out of the nucleus");
		Component granules = new Component("Granules",
				"container of starch in plant cell");
		Component amyloplast = new Component("Amyloplast",
				"store and synthesize starch for the plant through the polymerization of glucose");
		Component peroxisome = new Component("Peroxisome",
				"perform the oxidation mechanisms");
		Component endoplasmicReticulum = new Component ("Endoplasmic Reticulum",
				"transportation, protein holding");
		Component chloroplast = new Component ("Chloroplast",
				"conducts photosynthesis");
		Component vacuole = new Component("Vacuole",
				"storing important chemicals");
		Component vacouleMembrane = new Component("Vacuole Membrane",
				"protect the vacuole");
		Component intermediateFilaments = new Component("Intermediate Filaments",
				"maintain cell shape by bearing tension");
		Component mitochondria = new Component("Mitochondria",
				"generate most of the cell's supply of adenosine triphosphate (ATP)");
		Component lysosome = new Component("Lysosome",
				"break down outer molecules");
		Component golgi = new Component("Golgi",
				"packages proteins into membrane-bound vesicles inside the cell");
		Component nucleus = new Component("Nucleus",
				"contains all of the cell's genome");
		Component nucleolus = new Component("Nucleolus",
				"site of ribosome biogenesis");
		Component chromatin = new Component("Chromatin",
				"package long DNA molecules into more compact, denser structures");
		
		Component[]addtoAnimal = new Component[] {ribosomes,plasmaMembrane,cytoplasm,microtubules,
				peroxisome,vacuole,endoplasmicReticulum,mitochondria,lysosome,golgi,nucleus,nucleolus,chromatin};
		Component[]addtoPlant = new Component[] {ribosomes,plasmaMembrane,cytoplasm,microtubules,cellWall,
				peroxisome,vacuole,endoplasmicReticulum,mitochondria,lysosome,golgi,nucleus,nucleolus,
				granules,amyloplast,chloroplast,vacouleMembrane,intermediateFilaments};
		
		Component budScar = new Component("Bud Scar","help in reproduction");
		Component septum = new Component("Septum","allows fungal grow and cell division");
		Component vesicles = new Component("Vesicles", 
				"transport proteins, nucleic acids, lipids, and other biologically active molecules");
		Component[]addtoFungi = new Component[] {budScar,vacuole,lysosome,cytoplasm,peroxisome,nucleus,nucleolus,
				mitochondria,endoplasmicReticulum,cellWall,plasmaMembrane,golgi,ribosomes,septum,vesicles};
		
		EukaryoticCell animal = new EukaryoticCell("Animal");
		animal.addComponent(addtoAnimal);
		EukaryoticCell plant = new EukaryoticCell("Plant");
		animal.addComponent(addtoPlant);
		EukaryoticCell fungi = new EukaryoticCell("Fungi");
		animal.addComponent(addtoAnimal);
	}
	public static ArrayList<Cell> getCellList() {
		return cellList;
	}
	public static ArrayList<Component> getComponentList() {
		return componentList;
	}
}
