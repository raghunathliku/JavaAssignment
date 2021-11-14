package com.technoelevate.multiplayerproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class PlayASong extends OperateOnSong {
	public void playAll() {
		PlayASong aSong=new PlayASong();
		System.out.println("your all songs are playing ...");
		System.out.println();
		System.out.println("current lists are --");
		aSong.collectSong();
		
	}
	
	
		public void playRandomSong() {
			List<String> list=new ArrayList<String>();
			list.add("jay jagannath song ");
			list.add("ganesh bandna");
			list.add("shiv shakti song");
			list.add("hello");
			System.out.println("songs are playing randomly...");
			
			System.out.println(list.get((int)(Math.random()*4)));
		}
		
	
			public void playCurSong() {
				System.out.println("Enter your favourite song to play");
				Scanner scanner=new Scanner(System.in);
				String sn=scanner.nextLine();
				System.out.println();
				System.out.println();
				System.out.println("your "+sn+" is playing here..... , enjoy");
				
			}
	

	public static void main(String[] args) {
		PlayASong aSong=new PlayASong();

	}

}
