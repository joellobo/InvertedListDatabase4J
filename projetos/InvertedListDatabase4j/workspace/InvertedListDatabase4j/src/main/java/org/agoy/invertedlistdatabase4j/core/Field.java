package org.agoy.invertedlistdatabase4j.core;

import org.agoy.invertedlistdatabase4j.util.StringUtil;

public class Field {
	
	public static int MAX_SIZE_NAME = 2;
	
	private String name;
	
	public void name(String newName) {
		if (newName == null) {
			throw new IllegalArgumentException();
		}
		
		if (newName != null && newName.length() != MAX_SIZE_NAME) {
			throw new IllegalArgumentException();
		}
		
		if (newName != null && !StringUtil.isAlphabetic(newName.substring(0, 1))) {
			throw new IllegalArgumentException();
		}
		
		if (newName != null && !StringUtil.isAlphabetic(newName.substring(1, 1))) {
			throw new IllegalArgumentException();
		}

		this.name = newName;
	}
	
	public String name() {
		return this.name;
	}

}
