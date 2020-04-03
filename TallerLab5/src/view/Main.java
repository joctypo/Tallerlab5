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
		background(0);
		fill(255);
		textSize(20);
		text("Boton i para ordenar natural",20,350);
		text("Boton n para ordenar parcial por nombre",20,370);
		text("Boton e para ordenar parcial por edad",20,390);
		text("Boton f para ordenar parcial por fecha",20,410);
		text("Boton r para ordenar parcial por raza",20,430);
		
		
		for (int i=0; i<controlle.LinkeList().size();i++) {
			int posx=20;
			int posy=20*(i+1);
			controlle.LinkeList().get(i).draw(posx,posy);
			
		}
		
		
	}
	
	public void keyPressed() {
		value = key;
		controlle.ordenar(value);
		System.out.println(value);
	}
	
	
	
	
}
