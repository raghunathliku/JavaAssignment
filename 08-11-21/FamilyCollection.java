package techno.java.collectin.asignA.Family;

import java.util.ArrayList;
import java.util.Collections;


public class FamilyCollection {
	public static void main(String[] args) {
		ArrayList<Family> ar=new ArrayList<Family>();
		ar.add(new Family( "Father", "Ranjan",45));
		ar.add(new Family("Mother", "Runu",40));
		ar.add(new Family("Brother", "Rajiv",27));
		ar.add(new Family("Sister", "Roza",21));
		Collections.sort(ar);
		System.out.println(ar);
		FamilyDec dec=new FamilyDec();
		Collections.sort(ar,dec);
		System.out.println(ar);
	}

}
