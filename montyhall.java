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
      

         System.out.println("\nIn a moment, I will show you " 
                 + " where the prize is located, but first I will"
               + " show you what is behind one of the other doors");
         

         

    
         
      
   }
}

