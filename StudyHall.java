package studyhall;

public class StudyHall {

	public static int data [] = {20,40,70,80,110,150,200,210,250};
	public static int counted (int b [], int h ) {
		int ndx = 0;
		while (ndx < b.length && b[ndx] < h) ndx++;
		if (ndx >= b.length) return -1;
		if (h == b [ndx]) return ndx;
		else return -1;

	}
	public static void main (String [] args) {
		int goal = 200; 
int result = counted( data, goal);
if(result <0)
	System.out.println ("The search could not find: " + goal);
else
	System.out.println("CHANPREET SINGH");
	System.out.println("The goal of " + goal + " was found at index: " + result);

	}

}