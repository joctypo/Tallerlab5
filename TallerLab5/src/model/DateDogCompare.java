package model;

import java.util.Comparator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;



public class DateDogCompare implements Comparator<Dogs> {

	public DateDogCompare() {
		
	}

	@Override
	public int compare(Dogs o1, Dogs o2) {
		DateFormat df= new SimpleDateFormat("dd-MM-yyyy");
		Date perro1 = null;
		Date perro2= null;
		try {
			perro1 = df.parse(o1.getFecha());
			perro2 =  df.parse(o2.getFecha());			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return perro1.compareTo(perro2);
	}

}
