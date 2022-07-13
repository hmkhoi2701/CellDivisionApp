package core.component;

import java.util.ArrayList;

import core.storage.Storage;

public class Component {
	private String cName;
	private String description;
	
	public Component(String cName, String description) {
		super();
		this.cName = cName;
		this.description = description;
		Storage.componentStorage.add(this);
	}


	public String getcName() {
		return cName;
	}


	public String getDescription() {
		return description;
	}
}
