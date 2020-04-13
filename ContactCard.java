import java.util.Scanner;
public class ContactCard
{
//Austin Phetsany
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      String firstName, lastName, job;
      String addy1, addy2, city, state, email, height;
      int age, weight, zip;
      long phone;
      double income, monthIncome, weekIncome;
      
      
      System.out.println ("---------------------------------------");
      System.out.println ("Please enter the following inforation:");
      System.out.println ("---------------------------------------");
      System.out.print ("First Name: ");
      firstName = input.nextLine();
      System.out.print ("Last Name: ");
      lastName = input.nextLine();
      System.out.print ("Address Line 1: ");
      addy1 = input.nextLine();
      System.out.print ("Address Line 2: ");
      addy2 = input.nextLine();
      System.out.print ("City: ");
      city = input.nextLine();
      System.out.print ("State: ");
      state = input.nextLine();
      System.out.print ("Zip Code: ");
      zip = input.nextInt();
      System.out.print ("Phone Number: ");
      phone = input.nextLong();
      System.out.print ("Email Address: ");
      input.nextLine();
      email = input.nextLine();
      System.out.print ("Age: ");
      age = input.nextInt();
      System.out.print ("Height: ");
      input.nextLine();
      height = input.nextLine();
      System.out.print ("Weight: ");
      weight = input.nextInt();
      System.out.print ("Job Title: ");
      input.nextLine();
      job = input.nextLine();
      System.out.print ("Annual Income: ");
      income = input.nextDouble();
      System.out.println ("---------------------------------------");
      System.out.println ("Thank you!");
      System.out.println ("---------------------------------------");
      
      monthIncome = income/12;
      weekIncome = income/52;
      
      System.out.println ("\n---------------------------------------");
      System.out.println ("Contact Card");
      System.out.println ("---------------------------------------");
      System.out.println ("Name: " + firstName + " " + lastName);
      System.out.println ("Address Line 1: " + addy1);
      System.out.println ("Address Line 2: " + addy2);
      System.out.println ("City, ST Zip: " + city + ", " + state + " " + zip);
      System.out.println ("---------------------------------------");
      System.out.println ("Phone Number: " + phone);
      System.out.println ("Email Address: " + email);
      System.out.println ("---------------------------------------");
      System.out.println ("Age: " + age + "	  " + "Height: " + height + "	  " + "Weight: " + weight);
      System.out.println ("---------------------------------------");
      System.out.println ("Job Title: " + job);
      System.out.printf ("Annual Income: $%,.2f", income);
      System.out.printf ("\nMonthly Income: $%,.2f", monthIncome);
      System.out.printf ("\nWeekly Income: $%,.2f", weekIncome);
      System.out.println ("\n---------------------------------------");
   }
}
