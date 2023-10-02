package diavasma_apo_arxeio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnomaArxeiou {
	

	public static void main(String[] args) {

		System.out.print("Dose to onoma tou arxeiou ");
		String line;
		int count = 0;
		int word = 0;
		int	i=0;
		
		Scanner input = new Scanner(System.in);
		String filename = input.next();
		System.out.println(filename);
try {
		File file = new File(filename);
		Scanner myfile= new Scanner(file);
		while (myfile.hasNextLine()) {
			line=myfile.nextLine();
			String[] k=line.split(" ");
			for(int j=0; j<k.length; j++) {
				try {
			
			Integer.parseInt(k[i]);
			
						count++;
				}catch(NumberFormatException ex) {
					word++;
				System.out.println(line);
				}
				}
		myfile.close();
		System.out.println("oi lexeis einai: "+word);
		System.out.println("oi arithmoi einai: "+count);	
		}		
			}catch(FileNotFoundException e) {
				System.out.println("Den vrika to arxeio");
			}
}
}