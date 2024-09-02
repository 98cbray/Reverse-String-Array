package Project0;

/*
 * COSC 485 Project 0 - ReverseString
 * This project aims to reverse the string a a pre-determined text file within the project line per line.
 * Then this program will print the reversed lines to a output text file within the project.
 * Colby Bray
 * Updated: 2/17/2024
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
        // Setup input and output text file paths
        File inputFile = new File("input.txt");
        File outputFile = new File ("output.txt");

        try {
        	
            // Set up scanner to read the contents of the input text file
    		Scanner sc1 = new Scanner(new FileReader(inputFile)); // scanner reads text line, ends at line break
            StringBuilder contents = new StringBuilder(); // setup string builder to use reverse() method
            
            FileWriter writer = new FileWriter(outputFile); // Write the reversed content to the output text file
            while (sc1.hasNextLine()) { // scanner works one line at a time
                contents.append(sc1.nextLine());
             // Method to reverse the string contents
                String reversedContent = contents.reverse().toString();
                writer.write(reversedContent);
                writer.write("\n"); // ensure text file spaces out text lines
                contents.setLength(0); // clear output contents for next line
            }
            sc1.close(); // end scanner
            writer.close(); // end file Writer

            System.out.println("File reversed successfully. Reversed content saved in " + outputFile+" in project folder. ");
        } 
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } // end of IOException catch
    } // end of try
} // end of ReverseString class


