package com.StrategyPattern;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {
	
	public void compressFiles(ArrayList<File> files, String compressedArchiveFileName) {
		// TODO Auto-generated method stub
		System.out.println("Files are compressed using Zip approach: '" + compressedArchiveFileName + ".zip' file is created");
	}
}
