package com.path.rating.entities;

import java.util.HashSet;
import java.util.Set;

public class SubString {

	    public static void main(String[] args) {
	        String str = "Hi, I am Gulam Mohammad@";
	        String longestSubstring = findLongestSubstringWithSpecialCharacters(str);
	        System.out.println("Longest Substring: " + longestSubstring);
	    }

	    public static String findLongestSubstringWithSpecialCharacters(String str) {
	        // Regular expression to split based on spaces and specific delimiters
	        String[] substrings = str.split("[,\\s]+"); // Splits on commas, spaces, or multiple spaces
	        String longest = "";

	        for (String s : substrings) {
	            if (s.length() > longest.length()) {
	                longest = s;
	            }
	        }

	        return longest;
	    }
	}
