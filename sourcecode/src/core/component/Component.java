package core.component;

import java.util.ArrayList;

import core.initializer.Initializer;

public class Component {
	private String cName;
	private String function;
	
	public Component(String cName, String function) {
		super();
		this.cName = cName;
		this.function = function;
		Initializer.getComponentList().add(this);
	}


	public String getcName() {
		return cName;
	}


	public String getFunction() {
		return function;
	}
}
