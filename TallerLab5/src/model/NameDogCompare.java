package model;

import java.util.Comparator;

public class NameDogCompare implements Comparator<Dogs>{

	public NameDogCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Dogs o1, Dogs o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

	
}
