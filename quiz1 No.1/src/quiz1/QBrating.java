package quiz1;

import java.util.Scanner;

public class QBrating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter the touchdowns:");
		float TD=input1.nextFloat();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter the total yards:");
		float YDS=input2.nextFloat();
		
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter the Interceptions:");
		float INT=input3.nextFloat();
		
		Scanner input4 = new Scanner(System.in);
		System.out.print("Enter the completions:");
		float COMP=input4.nextFloat();
		
		Scanner input5 = new Scanner(System.in);
		System.out.print("Enter the number of passes attempted:");
		float ATT=input5.nextFloat();
		
		double a;
		double b;
		double c;
		double d;

		double QB;
		
		a=(COMP/ATT-0.3)*5;
		if (a<0){
			a=0;
		}
		else if (a>2.375){
			a=2.375;
		}
		else{
			a=(COMP/ATT-0.3)*5;
		}
		b=(YDS/ATT-3)*0.25;
		if (b<0){
			b=0;
		}
		else if (b>2.375){
			b=2.375;
		}
		else{
			b=(YDS/ATT-3)*0.25;
		}
		c=(TD/ATT)*20;
		if (c>2.375){
			c=2.375;
		}
		else{
			c=(TD/ATT)*20;
		}
		d=2.375-(INT/ATT)*0.25;
		if (d<0){
			d=0;
		}
		else{
			d=2.375-(INT/ATT)*0.25*100;
		}

		
		QB=(a+b+c+d)/6*100;
		
		System.out.print("QB rating number is "+ QB);
		
		
		
		

	}

}
