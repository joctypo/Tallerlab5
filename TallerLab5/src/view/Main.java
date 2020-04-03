package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private Controller controlle;
	char value;
	

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
		

	}

	
	public void settings() {
		size (500,500);
		
	}
	
	public void setup() {
		controlle = new Controller(this);
	}
	
	public void draw() {
		controlle.draw();
		
	}
	
	public void keyPressed() {
		
		
		controlle.ordenar(value);
	}
	
	
	
	
}
