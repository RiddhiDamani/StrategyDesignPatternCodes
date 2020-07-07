package com.StrategyPattern;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	
	private CompressionStrategy strategy;
	
	//Client will set what CompressionStrategy to use by calling this method
	public void setCompressionStrategy (CompressionStrategy strategy) {
		this.strategy = strategy;
	}
	
	// Method to create archive based on the compression strategy passed by the client. We need to pass
	// files that needs to be added in the ArrayList and compressed archived file name as input!! The strategy wl b implemented
	// and the output will be given back to the client. 
	public void createArchive (ArrayList<File> files, String compressedArchiveFileName) {
		strategy.compressFiles(files, compressedArchiveFileName);
	}
}
