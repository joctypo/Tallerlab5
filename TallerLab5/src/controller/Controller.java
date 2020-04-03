package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	private PApplet app2;
	private Logic logic;
	
	public Controller(PApplet app) {
		this.app2=app;
		logic =new Logic(app2);
	}

	public void draw() {
		logic.draw();
	}

	public void ordenar(char value) {
		
		
		
	}

}
