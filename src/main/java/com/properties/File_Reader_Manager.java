package com.properties;

public class File_Reader_Manager {
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	public Configuration_reader getinstanceCR() throws Throwable {
		Configuration_reader reader = new Configuration_reader();
		return reader;
		
	}

}
