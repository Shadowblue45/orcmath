package shadowBlue;

import java.util.ArrayList;

public class CatalogMaker {
	
	private static ArrayList<VideoGames> catalog;
	
	public CatalogMaker() {
		catalog = new ArrayList<VideoGames>();
		catalog.add(new VideoGames("Jotaro",17));
		catalog.add(new VideoGames("Kakyoin",17));
	}

	public static void main(String[] args) {
		CatalogMaker s = new CatalogMaker();
		for(VideoGames t: catalog) {
			System.out.println(t);
		}
	}

	public String getContents() {
		String data = "";
		for(VideoGames t: catalog) {
			data+= t +"/n";
		}
		return data;
	}
}
