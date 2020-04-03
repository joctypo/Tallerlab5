package model;

import java.util.Comparator;

public class RazaDogCompare implements Comparator<Dogs>{

	public RazaDogCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Dogs o1, Dogs o2) {
		// TODO Auto-generated method stub
		return o1.getRaza().compareTo(o2.getRaza());
	}

}
