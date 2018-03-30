package w12d5;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudyHall {

	public static void main (String [] args) {
		
		List<Double> chan = new ArrayList<Double>();
		chan.add(0.3);
		chan.add(0.6);
		chan.add(0.9);
		chan.add(1.2);
		chan.add(1.5);
	chan.add(1.8);
		chan.add(2.1);
		
		Collections.sort(chan);
		System.out.println("The sorted list is as follows:" + chan);
		
	}
	
}
