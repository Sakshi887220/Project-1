/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package montyhall;
    import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Sonam
 */

public class montyhall {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      int userDoor, openDoor, otherDoor;

      // generate random value 1 to 3
      int prizeDoor = generator.nextInt(3) + 1;
      int goatDoor1 = prizeDoor;
      while (goatDoor1 == prizeDoor) {
         goatDoor1 = generator.nextInt(3) + 1;
      }
      int goatDoor2 = goatDoor1;
      while (goatDoor2 == goatDoor1 || goatDoor2 == prizeDoor) {
         goatDoor2 = generator.nextInt(3) + 1;
      }

      // begin Game
      System.out.println("Welcome to the Monty Hall game show!");
      System.out.print("Select the door (1, 2, or 3): ");
      userDoor = scan.nextInt();

      // validation
      

         System.out.println("\nIn a moment, I will show you " 
                 + " where the prize is located, but first I will"
               + " show you what is behind one of the other doors");
         System.out.println("\nBehind door number " + openDoor 
                        + " are goats!");
         System.out.println("You selected door number " + userDoor);
         System.out.print("\nWould you like to switch your"+
                         " door (y/n)? ");

         // take user input Yes or No
         char userReply = scan.next().charAt(0);
         while (userReply != 'y' && userReply != 'n') {
            System.out.print("Please enter either y/n");
            userReply = scan.next().charAt(0);
         }
         if (userReply == 'y') {
            userDoor = otherDoor;
            System.out.println("Your choice switched to door " 
                               + userDoor);
         }

         System.out.println("The prize is behind door number: " 
                           + prizeDoor);

         // check if user won or lost
         
      }
   }
}

