package lineComparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		 System.out.println("Welcome to Line Comparison Computation Program");
		    LengthCal();
		 
		 
			}
						// Loacal Variable 
						static	int X1,Y1,X2,Y2;
						static	int X3,Y3,X4,Y4;
						static  int length;
						static  int length1;
							
	public static  void LengthCal() {
						//  Input from USER for 1st line 
						System.out.println("Enter the  Co-ordinates of 1st Line");
						Scanner Var = new Scanner(System.in);
							X1 = Var.nextInt();
							Y1 = Var.nextInt();
							X2 = Var.nextInt();
							Y2 = Var.nextInt();
							
	
						//Calculation for finding length of line 1st
						length = (int) Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 -Y1),2));
						System.out.println("Length of Line 1 := " + length);	
						
						
					//  Input from USER for 1st line 
						System.out.println("Enter the  Co-ordinates of 2nd Line");
							X3 = Var.nextInt();
							Y3 = Var.nextInt();
							X4 = Var.nextInt();
							Y4 = Var.nextInt();
								Var.close();
						//Calculation for finding length of line 2nd
						length1 = (int) Math.sqrt(Math.pow((X4 - X3),2) + Math.pow((Y4 -Y3),2));
						System.out.println("Length of Line 2 := " + length1);	
							
						}
	
}