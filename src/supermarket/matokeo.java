package supermarket;
import java.util.*;


public class matokeo {
 public static void main(String arg[]){
	 double maize = 20;
	 double rice = 100;
	 double sorgum = 120;
	 double oats = 235;
	 double millet = 145;
	 double soda = 75;
	 double milk = 102;
	 double water = 20;
	 double kales = 40;
	 double spinach = 50;
	 double cabbage = 65;
	 double jembe = 65;
	 double jogoo = 66;
	 double EXE = 123;
	 double taifa = 120;
	
	 
  System.out.println("Welcome to Matokeo SuperMarket:Enter a number to see the price of item that you would like to buy\n"
  		+ "Cereals\n1:Maize, 2:Rice, 3:Sorgum, 4:Oats, 5:Millet\n"
  		+ "Berevages\n6:Soda, 7:Milk, 8:Water\n"
  		+ "Vegetables\n9:Kales, 10:Spinach, 11:Cabbage\n"
  		+ "Flour\n Maize Flour\n12:Jembe, 13:Jogoo\n"
  		+ " Wheat Flour\n14:EXE, 15:Taifa");
  Scanner products = new Scanner(System.in);
  int x = products.nextInt();
				  if(x == 1 ){
					  System.out.println("Maize:Ksh 20bob per cob");
				  }
				if(x == 2 ){
					 System.out.println("Rice: Ksh.100per kg\nhalf kg: Ksh.50");
				  }
				if(x == 3 ){
					 System.out.println("Sorgum: Ksh 120 per kg\nhalf kg: Ksh.60");
				}
				if(x == 4 ){
					 System.out.println("Oats: Ksh 235 per kg\nhalf kg: Ksh.117.50");
				}
				if(x == 5 ){
					 System.out.println("Millet: Ksh 145 per kg\nhalf kg: Ksh.72.50");
				}
				if(x == 6 ){
					 System.out.println("Soda:Kshs 99per Litre");
				}
				if(x == 7 ){
					 System.out.println("Milk: Ksh.102 per Litre");
				}
				if(x == 8 ){
					 System.out.println("Water:Ksh 40 per Litre");
				}
				if(x == 9 ){
					 System.out.println("Kales:Ksh 40 per Bunch");
				}
				if(x == 10 ){
					 System.out.println("Spinach: Ksh 50 per Bunch");
				}
				if(x == 11 ){
					 System.out.println("Cabbage:Ksh 65 per Bunch");
				}
				if(x == 12 ){
					 System.out.println("Jembe:Ksh. 98 per 2kg\nhalf kg: Ksh.49");
				}
				if(x == 13 ){
					 System.out.println("Jogoo:Ksh 88 per 2kg\nhalf kg: Ksh.44");
				}
				if(x == 14 ){
					 System.out.println("EXE: Ksh 123 per kg\nhalf kg: Ksh.61.50");
				}
				if(x == 15 ){
					 System.out.println("Taifa: Ksh 120 per kg\nhalf kg: Ksh.60");
				}
				if(x <1 || x>15 ){
			    System.out.println("Sorry we currently do not have that product.");
			    	}
				 System.out.println("Discounted items:\n"
        +"Soda is now Ksh.75 per Litre from Ksh.99\n"
        +"Jembe is now Ksh.65 per 2Kg from Ksh.98\n"
        +"Water is Ksh.20 per Litre from Ksh. 40\n"
        +"Jogoo is Ksh. 66 per 2Kgs from Ksh.88");


 }
}
