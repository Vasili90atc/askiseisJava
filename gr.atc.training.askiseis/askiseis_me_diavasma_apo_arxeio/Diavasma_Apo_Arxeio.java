
package diavasma_apo_arxeio;
	import java.io.File; //κανουμε import java.io.File για εχει εισοδο και εξοδο σε αρχεια
	import java.io.FileNotFoundException; // κανουμε import για τυχον λαθη που δεν υπαρχουν
	import java.util.Scanner; // δηλωνουμε μια μεταβλητη που διαβαζουμε δεδομενα 

	public class Diavasma_Apo_Arxeio { // δηλωνουμε την κλαση μας 

		
		public static void main(String[] args) throws FileNotFoundException { // δηλωνουμε την στατικη main ου ειναι το κυριο ουσιαστικα προγραμμα  

			Scanner sc = new Scanner(System.in); //διαβαζει απο το πληκτρολογιο οτι πληκτρολογησει ο χρηστης 

			System.out.print("Enter fileName: "); // θα εμφανισει το εξης μηνυμα Enter fileName:

			String fileName = sc.next(); // το filename ειναι αλφαριθμητικα και διαβαζει τo επομενο 
			

			sc.close(); // εδω κλεινει η εξης sc μεθοδος
			System.out.println(fileName); // εμφανιζει το filename 

			WordCounter wc = new WordCounter(); // το wordcounter ειναι μια καινουργια μεθοδος

			wc.setFileName(fileName); //το setter του fileName 
			
			
			wc.count(); //  μεθοδος count 
		}
}
