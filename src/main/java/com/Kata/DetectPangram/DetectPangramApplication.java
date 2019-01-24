package com.Kata.DetectPangram;

import java.util.*;
import java.util.stream.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DetectPangramApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetectPangramApplication.class, args);
	}

	public static boolean check(String sentence) {

		Map<Character, Integer> letterCount = new HashMap<Character, Integer>();

		char[] lettersInAlphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		IntStream.range(0, lettersInAlphabets.length).mapToObj(ordinalPosition -> lettersInAlphabets[ordinalPosition])
				.forEach(c -> letterCount.put(c, 0));

		char[] lettersInSentence = sentence.toLowerCase().toCharArray();
		IntStream.range(0, lettersInSentence.length).mapToObj(ordinalPosition -> lettersInSentence[ordinalPosition])
				.forEach(c -> letterCount.put(c, 1));

		return letterCount.entrySet().stream().filter(entry -> entry.getValue() == 0).count() == 0;
		// code
	}

	// alternate solution

	// public boolean check(String sentence){
	// for (char c = 'a'; c<='z'; c++)
	// if (!sentence.toLowerCase().contains("" + c))
	// return false;
	// return true;

	// }

}
