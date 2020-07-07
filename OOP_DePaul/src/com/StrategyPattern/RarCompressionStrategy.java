package com.StrategyPattern;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy{
		
	public void compressFiles(ArrayList<File> files, String compressedArchiveFileName) {
		// TODO Auto-generated method stub
		System.out.println("Files are compressed using Rar approach: '" + compressedArchiveFileName + ".rar' file is created");
	}
}
