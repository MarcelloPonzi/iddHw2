package iddHw2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

public class Reader {
	Path path = Paths.get("target/idx");
	
	public void ricercaPerTitolo() throws IOException{
		Directory directory = FSDirectory.open(path);
		IndexReader reader = DirectoryReader.open(directory);		
		IndexSearcher searcher = new IndexSearcher(reader);
		
	}
	
}
