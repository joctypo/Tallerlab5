package controller;

import java.util.LinkedList;

import model.Dogs;
import model.Logic;
import processing.core.PApplet;

public class Controller {
	private PApplet app2;
	private Logic logic;
	
	public Controller(PApplet app) {
		this.app2=app;
		logic =new Logic(app2);
	}



	public void ordenar(char value) {
		
		switch (value) {
		case 'i':
			logic.ordenar(0);
			
			
			break;
		case 'n':
			logic.ordenar(1);
			break;

		case 'e':
			logic.ordenar(2);
			break;

		case 'r':
			logic.ordenar(3);
			break;

		case 'f':
			logic.ordenar(4);
			break;


		}
		
		
	}
	
	public LinkedList<Dogs> LinkeList() {
		
		return logic.getPerritos();
		
	}

}
