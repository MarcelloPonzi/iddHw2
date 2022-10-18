package iddHw2;

import java.io.IOException;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indixer i = new Indixer();
		Reader r = new Reader();
		try {
			i.indicizza();
			r.ricercaPerTitolo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
