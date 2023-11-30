/**
Programmer: Tahj Fayall
Program Name: HelloW.java
Date Programmed: 11/29/2023
Program Description: This is a java program designed to print the messages
"Hello World" and "This is a Github repository test" using methods.
*/
public class HelloW
{
   public static void main (String[] args)
   {
      helloWorld();
      
      message();
   }
   
   /**
   The helloWorld method displays the 
   opening message "Hello World" with a border.
   */
   public static void helloWorld()
   {
      System.out.println("===================");
      System.out.println("=   -----------   =");
      System.out.println("=   Hello World   =");
      System.out.println("=   -----------   =");
      System.out.println("===================");
   }
   
   /**
   The message method displays the main message 
   "This is a Github repository test" and closes with a 
   goodbye message.
   */
   public static void message()
   {
      System.out.println("");
      System.out.println(". . . . . . . . . . . . . . . . .");
      System.out.println("This is a Github repository test!");
      System.out.println(". . . . . . . . . . . . . . . . .");
      System.out.println("See ya later!");
   }
}