package iddHw2;

import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indixer i = new Indixer();
		Reader r = new Reader();
		try {
			i.indicizza();
			r.ricerca();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
