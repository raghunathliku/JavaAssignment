package com.technoelevate.multiplayerproject;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchSong extends OperateOnSong {
	public void searchSong() {
		OperateOnSong song=new OperateOnSong();
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("jay jagannath song ");
		list.add("ganesh bandna");
		list.add("shiv shakti song");
		list.add("hello");
		
		System.out.println("enter the song name from this file to serch :");
		System.out.println();
		System.out.println();
		for(String s:list) {
			System.out.println(s);
		}
		s=list;
		String sn=scanner.nextLine();
		
		while(super.s.contains(sn)) {
			
			System.out.println(" hey! your song is here "+sn);
			break;
		}
		
		
		
		
	}

	public static void main(String[] args) {
	SearchSong song=new SearchSong();
	


	}

}
