package assignment_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		
		// Open input and output files.
		FileInputStream inputFile = new FileInputStream("bags.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("results.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		// Loop through the input file
		while (scanner.hasNext()) {
			
			// Takes the first two value in the input file to determine the bag size and type
			String bagType = scanner.next();
			int bagSize = scanner.nextInt();
			int i;
			
			// The for loops in these conditional statements helps add each specific item to their desired bags via scanner.type
			// This conditional will determine if the bag is integer, then creates the integer bag, then adds the integer items into the bag
			if (bagType.equals("integer")) {
				Bag<Integer> bag = new Bag<Integer>();
				for (i = 0; i < bagSize; i++) {
					bag.addItem(scanner.nextInt());
				}
				// Writes the maximum value in this bag to the output file
				writer.println(bag.getMax());
			}
			// This conditional will determine if the bag is string, then creates the string bag, then adds the string items into the bag
			else if (bagType.equals("string")) {
				Bag<String> bag = new Bag<String>();
				for (i = 0; i < bagSize; i++) {
					bag.addItem(scanner.next());
				}
				// Writes the maximum value in this bag to the output file
				writer.println(bag.getMax());
			}
			// This conditional will determine if the bag is a double, then creates the double bag, then adds the double items into the bag
			else {
				Bag<Double> bag = new Bag<Double>();
				for (i = 0; i < bagSize; i++) {
					bag.addItem(scanner.nextDouble());
				}
				// Writes the maximum value in this bag to the output file
				writer.println(bag.getMax());
			}
		}
		
		// Close input and output files.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
	}
}
