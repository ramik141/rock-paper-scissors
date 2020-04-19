
package fi.company;

import java.util.*;

public class Main {
    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        String[] valinnat = {"Rock", "Paper", "Scissors"};

        System.out.println("1) rock, 2) paper, 3) scissors?");
        int choice = Integer.parseInt(s.nextLine());
        int computerChoice = (int) (Math.random() * 3);

        System.out.println("You chose: "+ valinnat[choice]);
        System.out.println("Computer chose: "+ valinnat[computerChoice]);

        if(choice == 1 && computerChoice == 2) {
            System.out.println("Computer won!");
        } else if(choice == 2 && computerChoice == 3){
            System.out.println("Computer won!");
        } else if(choice == 3 && computerChoice == 1){
            System.out.println("Computer won!");
        } else if(choice == computerChoice){
            System.out.println("Tie");
        } else {
            System.out.println("You won!");
        }
    }


}