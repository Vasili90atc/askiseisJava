package diavasma_apo_arxeio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnomaArxeiou1 {
	public static void main(String[] args) {
ArrayList<String> myList=new ArrayList<>();
		System.out.print("Dose to onoma tou arxeiou ");
		String line;
		int count = 0;
		int word = 0;
		double sum=0;
		double mo;
		Scanner input = new Scanner(System.in);
		String filename = input.next();
		System.out.println(filename);
try {
		File file = new File(filename);
		Scanner myfile= new Scanner(file);
		while (myfile.hasNextLine()) {
			line=myfile.nextLine();
			String[] k=line.split(" ");
			for(int i=0; i<k.length; i++) {
				try {
			
			int	j=Integer.parseInt(k[i]);
			sum=sum+j;
						count++;
				}catch(NumberFormatException ex) {
					word++;
					myList.add(k[i]);
				}
			}
			System.out.println(line);
		}
		myfile.close();
		System.out.println("oi lexeis einai: "+word);
		System.out.println("oi arithmoi einai: "+count);
		if (count!=0) {
		mo=sum/count;
		System.out.println("o mo einai: "+mo);
		}
		for(int i=0; i<myList.size(); i++ ) {
			System.out.println(myList.get(i));
		}
}catch(FileNotFoundException e) {
	System.out.println("Den vrika to arxeio");
}
		

	}
