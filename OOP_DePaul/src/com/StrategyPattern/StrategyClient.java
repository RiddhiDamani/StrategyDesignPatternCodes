package com.StrategyPattern;

import java.io.File;
import java.util.ArrayList;

public class StrategyClient {

	public static void main(String[] args) {
		
		ArrayList<File> fileList = new ArrayList<File>();
		
		// Preparing array list of file that i need to compress.  
		fileList.add(new File("D:\\Picture\\Solos"));
		fileList.add(new File("D:\\Picture\\Desktop Wallpapers\24041"));
		
		// creating compression context
		CompressionContext ctx = null;
		
		//In compression context, we need to set what strategy we need to set to compress the files. 
		ctx = new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		//Using compression context, creating archive
		ctx.createArchive(fileList, "Picture");
		
		// Creating new compression context
		ctx = new CompressionContext();
		ctx.setCompressionStrategy(new RarCompressionStrategy());
		ctx.createArchive(fileList, "Picture");
		
	}

}
