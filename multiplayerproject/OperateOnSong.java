package com.technoelevate.multiplayerproject;

import java.util.ArrayList;
import java.util.Scanner;

public class OperateOnSong {
	ArrayList<String>s;
	
	public void addSong() {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the song name");
		String add=scanner.nextLine();
		list.add(add);
		this.s=list;
		
		System.out.println(list+" song added sucessfully");
		
		
	}
	
	public void removeSong() {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("jay jagannath song ");
		list.add("ganesh bandna");
		list.add("shiv shakti song");
		list.add("hello");
		s=list;
		System.out.println("Enter the song name to remove from the list");
		for(String s:list) {
		System.out.println(s);
		}
		String remove=scanner.nextLine();
		
		while(s.contains(remove)) {
			//s.remove(remove);
			
			System.out.println(remove+" song deleted sucessfuly");
			break;
		}
		
	}
	
	public void collectSong() {
ArrayList<String> list=new ArrayList<String>();
OperateOnSong song=new OperateOnSong();
		list.add("jay jagannath song ");
		list.add("ganesh bandna");
		list.add("shiv shakti song");
		list.add("hello");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
	
 
	public static void main(String[] args) {
		
		
		
		
		
		
		

	}

}
