package iddHw2;

import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;

public class hw2 {

	public static void main(String[] args) {
		
		Indixer i = new Indixer();
		Reader r = new Reader();
		try {
			long startTime = System.currentTimeMillis();
			i.indicizza();
			long endTime = System.currentTimeMillis();
			System.out.println("Ho impiegato "+(endTime - startTime) +" ms");
			r.ricerca();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

	}
	
	
}



//code

