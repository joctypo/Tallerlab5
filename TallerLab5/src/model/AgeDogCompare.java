package model;

import java.util.Comparator;

public class AgeDogCompare implements Comparator<Dogs> {

	public AgeDogCompare() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public int compare(Dogs o1, Dogs o2) {
		// TODO Auto-generated method stub
		return o1.getEdad()-o2.getEdad();
	}

}
