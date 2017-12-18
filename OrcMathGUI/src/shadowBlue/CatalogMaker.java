package shadowBlue;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {
	
	private static ArrayList<VideoGames> catalog;
	private static Scanner in = new Scanner(System.in);
	private static String s1  = in.nextLine();
	  
	public CatalogMaker() {
		catalog = new ArrayList<VideoGames>();
		catalog.add(new VideoGames("Jotaro",17));
		catalog.add(new VideoGames("Kakyoin",17));
	}

	public static void main(String[] args) {
		CatalogMaker s = new CatalogMaker();
		//for(VideoGames t: catalog) {
		//	System.out.println(t);
		//}
		getUserInput(s);
		System.out.println(getContents());
	}

	public static String getContents() {
		String data = "";
		for(VideoGames t: catalog) {
			data+= t +"\n";
		}
		return data;
	}
	public static void getUserInput(CatalogMaker s) {
		String character = s.s1;
		boolean age = false;
		String s2 = "";
		System.out.println("What is the age of that video game character?");
		String ages = in.nextLine();
		while(!age) {
			for(int i = 0; i< ages.length()-1;i++) {
				if(ages.substring(i, i+1).compareTo("0") >=0 && ages.substring(i, i+1).compareTo("9") <=0) {
					s2 = s2 + ages.substring(i, i+1);
				}
			}
			if(s2.length() > 1) {
				int result = Integer.parseInt(s2);
				catalog.add(new VideoGames(character,result));
				age = true;
			}
		}
	}
}
