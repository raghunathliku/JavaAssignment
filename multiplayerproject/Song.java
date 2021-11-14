package com.technoelevate.multiplayerproject;
import java.util.ArrayList;
import java.util.Scanner;
public class Song {

	public static void main(String[] args) {
		System.out.println("press 1 to play a song : ");
		System.out.println("press 2 to search for song : ");
		System.out.println("press 3 to edit the song : ");
		Scanner scanner=new Scanner(System.in);
		OperateOnSong onSong=new OperateOnSong();
		int p =scanner.nextInt();
		switch(p) {
		case 1:
			System.out.println( "press 1 to play all song");
			System.out.println("press 2 to play random song");
			System.out.println("press 3 to play current song");
			int s=scanner.nextInt();
			switch(s) {
			case 1:
				PlayASong aSong=new PlayASong();
				aSong.playAll();
				break;
				
			case 2:
				PlayASong aSong1=new PlayASong();
				aSong1. playRandomSong();
				break;
				
			case 3:
				PlayASong aSong2=new PlayASong();
				aSong2.playCurSong();
				break;
			}
		break;
		
		case 2:
			SearchSong song=new SearchSong();
			song.searchSong();
			
		break;
		
		case 3:
			System.out.println("press 1 to add song");
			System.out.println("press 2 to delete song");
			int a =scanner.nextInt();
			if(a==1) {
				
				onSong.addSong();
			}
			else {
				onSong.removeSong();
				
			}
			
			
			
		break;
		
		}
		
		

	}

}
