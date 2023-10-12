package marksComputationJavaProgram;
import java.util.Scanner;

public class MarksComputation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		String[] grades = new String[4];
		String[] results = new String[4];
		int total[] = new int[4];
		int average[] = new int[4];
		String names[] = new String[4];
		int rollNumber[] = new int[4];
		int marks [][]= new int [4][3];
		
		int i, j;
		
		for(i=0; i<4; i++) {
		
		System.out.print("Enter the student " +(i+1)+ " roll number: ");
		rollNumber[i] = sc.nextInt();
		System.out.print("Enter the Student Name: ");
		names[i] = scan.nextLine();
		
			for(j=0; j<=2; j++) {
				System.out.print("Enter the marks: ");
				marks[i][j] = sc.nextInt();
				total[i] += marks[i][j];
				
			}
			}
			for(i=0; i<4; i++) {
			 average[i] = total[i] / 3;
			 if (average[i] >= 70) {
	                grades[i] = "A";
	            } else if (average[i] >= 50) {
	                grades[i] = "B";
	            } else {
	                grades[i] = "C";
	            }
			results[i] = (average[i] >= 50) ? "P" : "F";
			 	
	            
			}
			System.out.println("*****************************************************************************************");
			System.out.println("\t\t\t\tSTUDENT MARKLIST");
			System.out.println("*****************************************************************************************");
			System.out.println("ROLL\tNAME\t\tMARK1\t\tMARK2\t\tMARK3\tTOTAL\tRESULT\tAVERAGE\t GRADE");
			for (i = 0; i <4; i++) {
				System.out.print("\n" +rollNumber[i]+ "\t" +names[i] );
				for(j=0; j<=2; j++) {
	              System.out.print("\t\t" +marks[i][j]);
	              }
				System.out.print("\t" +total[i]+ "\t" +results[i]+ "\t" +average[i]+ ".0\t " +grades[i]);
	        }
			

	}

}
