package org.agoy.invertedlistdatabase4j.core;

import java.util.Set;

public class Database {
	
	public static int MAX_FILES = 255;
	
	private Set<File> files;
	
	public Set<File> files() {
		return this.files;
	}
	
	
	
}
