package core;

import java.util.ArrayList;

import jdbc.ConfigurationJdbc;
import json.JsonManager;

public class Main {
		
	public static void main(String[] args) {
		ArrayList<ConfigurationJdbc> list = new ArrayList<ConfigurationJdbc>();
		list = JsonManager.getInstance().readFromFile("conf.prog", ConfigurationJdbc.class);
		
	}
}
