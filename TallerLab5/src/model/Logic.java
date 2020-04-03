package model;

import java.util.*;

import processing.core.PApplet;

public class Logic {
	private PApplet app3;
	private String[] info1;
	private String[] info2;
	private LinkedList<Dogs> perritos;
	private NameDogCompare ndc;
	private RazaDogCompare rdc;
	private AgeDogCompare adc;
	private DateDogCompare ddc;
	private int  ordenado;

	public Logic(PApplet app) {
		this.app3 = app;
		info1 = app3.loadStrings("../data/imports/datosUno.txt");
		info2 = app3.loadStrings("../data/imports/datosDos.txt");

		

		ndc = new NameDogCompare();
		rdc = new RazaDogCompare();
		adc = new AgeDogCompare();
		ddc = new DateDogCompare();

		perritos = new LinkedList<Dogs>();
		cargar();
	}

	public void cargar() {
		
		for (int i = 0; i < info1.length; i++) {
			String[] inf1 = info1[i].split(",");
			
			for (int j = 0; j < info2.length; j++) {
				String[] inf2 = info2[j].split(",");
				
				if (inf2[0].equals(inf1[0])) {

					System.out.println("entro");

					String nombre = inf1[1];
					int edad = Integer.parseInt(inf1[2]);
					String raza = inf2[1];
					String fecha = inf2[2];
					int id = Integer.parseInt(inf1[0]);

					perritos.add(new Dogs(id, nombre, edad, raza, fecha, app3));
					System.out.println("entro");
				}

			}

		}
		System.out.println(perritos.size());
	}

	public LinkedList<Dogs> getPerritos() {
		return perritos;
	}

	public void setPerritos(LinkedList<Dogs> perritos) {
		this.perritos = perritos;
	}

	public void ordenar(int i) {
		switch (i) {
		case 0:
			Collections.sort(perritos);
			guardartext();
			ordenado=0;
			break;
		case 1:
			Collections.sort(perritos, ndc);
			ordenado=1;
			guardartext();
			break;
		case 2:
			Collections.sort(perritos, adc);
			ordenado=2;
			guardartext();
			break;
		case 3:
			Collections.sort(perritos, rdc);
			ordenado=3;
			guardartext();
			break;
		case 4:
			Collections.sort(perritos, ddc);
			ordenado=4;
			guardartext();
			break;
		}

	}
	
	public void guardartext() {
		String[] textico;
		textico = new String[perritos.size()];
		
		for (int t=0;t<perritos.size();t++) {
			String id= "Id: " + perritos.get(t).getId();
			String nombre= "Nombre: " + perritos.get(t).getNombre().toLowerCase();
			String edad="Edad: " + perritos.get(t).getEdad();
			String raza= "Raza: " + perritos.get(t).getRaza();
			String fecha= "Fecha " + perritos.get(t).getFecha();
			
			textico[t] = id+nombre+edad+raza+fecha;
			
			
		}
		
		switch (ordenado) {
		case 0:
			app3.saveStrings("./data/exports/id.txt", textico);
			break;
		case 1:
			app3.saveStrings("./data/exports/name.txt", textico);
			break;
		case 2:
			app3.saveStrings("./data/exports/edad.txt", textico);
			break;
		case 3:
			app3.saveStrings("./data/exports/raza.txt", textico);
			break;
		case 4:
			app3.saveStrings("./data/exports/fecha.txt", textico);
			break;

		}
		
	}
}
