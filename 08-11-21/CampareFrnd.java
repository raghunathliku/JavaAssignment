package techno.java.collectin;

import java.util.ArrayList;
import java.util.Collections;

import techno.java.collectin.Campare;

public class CampareFrnd {
public static void main(String[] args) {
	ArrayList<Friendship> list1=new ArrayList<Friendship>();
	list1.add(new Friendship("A", 100, "BestFriend"));
	list1.add(new Friendship("G", 10, "BestFriend"));
	list1.add(new Friendship("V", 1, "BestFriend"));
	list1.add(new Friendship("M", 90, "BestFriend"));
	list1.add(new Friendship("Gu", 8, "Friend"));
 
	CmapareFrndD cmapare=new CmapareFrndD();
	Collections.sort(list1,cmapare);
	System.out.println(list1);
}
}
