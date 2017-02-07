package core;

import json.JsonManager;
import utils.Configuration;

public class Main {
		
	public static void main(String[] args) {
		JsonManager.getInstance().readFromFile("conf.prog", "/", Configuration.class);
		
	}
}
