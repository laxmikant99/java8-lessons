package com.laxmikant.java8.nio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*Problem statement: How would you read a file */
public class ReadFile {
	
	public static void main(String[] args){
		String fileName = "resources\\file1";

		// java 7 way
		try(BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		// java 8 way
		try {
			Files.readAllLines(Paths.get(fileName)) //we also have readAllBytes
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// given a file, skip the first line, change to upper-case and collect in a list.
        List<String> filteredLines = Collections.emptyList();
		try( Stream<String> stream = Files.lines(Paths.get("resources","file1"))) {
			filteredLines = stream.skip(1)
					.map(String::toUpperCase)
					.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		System.out.println(filteredLines);
		
		//Extra1: new lines method in BufferedReader to get the stream out of Br.
		try(BufferedReader br =Files.newBufferedReader(Paths.get(fileName))) {
			br.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Extra2: find the list of files in a directory.
		try(Stream<Path> stream = Files.list(Paths.get("resources"))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Reference: 
		//http://eherrera.net/ocpj8-notes/09-java-file-io-(NIO.2)
		//http://winterbe.com/posts/2015/03/25/java8-examples-string-number-math-files/
	}
}
