package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;
import java.util.Scanner;

/**
 *
 * @author Group_11
 */
public class Group11_Project1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameTester war = new GameTester();
        try{
            System.out.println("Please enter the number of players:");
            int numOfPlayers = 0;
            numOfPlayers = input.nextInt();
            input.nextLine();
            if(numOfPlayers > 0){
                int i = 0;
                while(war.getPlayers().size() < numOfPlayers){
                    System.out.printf("Player %d: Please enter your name \n", i+1);
                    String name = input.nextLine();
                    PlayerTester player = new PlayerTester(name);
                    war.registerPlayer(player);
                    i++;
//                    input.nextLine();
                }
            }
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println("Welcome all to this Game of War");
            war.dealCards();
        }catch(Exception e){
            System.out.println("That's an invalid entry");
            Group11_Project1.main(args);
        }
        String winner = "";
        if(war.getPlayers().size() > 0){
            while(winner.isEmpty()){
                System.out.println();
                System.out.println("----------------------------------------");
                System.out.println();
                String[] options = {"Play A Round", "Show Everyone's score",
                    "Quit This Game", "Restart A New Game"};
                for(int i=0;i<options.length;i++){
                    System.out.printf("option %d: %s \n", i+1, options[i]);
                }
                System.out.println();
    //            input.nextLine();
        ////            input.next();
                int choice = input.nextInt();
                switch(choice){
                    case 1:
                        //play round
                        System.out.println();
                        System.out.println("----------------------------------------");
                        System.out.println();
                        war.playRound();
                        
                        war.checkForLosers();
                        winner = war.checkForWinner();
                        war.discardToHand();

                        break;
                    case 2:
                        //show score
                        System.out.println();
                        System.out.println("----------------------------------------");
                        System.out.println();
                        war.showScores();
                        
                        war.checkForLosers();
                        winner = war.checkForWinner();
                        war.discardToHand();
                        break;
                    case 3:
                        //quit game
                        System.out.println();
                        System.out.println("----------------------------------------");
                        System.out.println();
                        System.exit(0);
                        break;
                    case 4:
                        //restart game
                        System.out.println();
                        System.out.println("----------------------------------------");
                        System.out.println();
                        Group11_Project1.main(args);
                        break;
                    default:
                        System.out.println("Please choose one of the selected options");
                        choice = input.nextInt();
                }
            }
        }//while loop
//        
        
//        PlayerTester danielle = new PlayerTester("Danielle");
//        PlayerTester shelly = new PlayerTester("Shelly");
//        PlayerTester jenny = new PlayerTester("Jenny");
//        PlayerTester ali = new PlayerTester("Ali");
//
//        war.registerPlayer(ali);
//        war.registerPlayer(jenny);
//        war.registerPlayer(shelly);
//        war.registerPlayer(danielle);
//        for(PlayerTester player: war.getPlayers()){
//            player.showScore();
//            System.out.println();
//        }
//        System.out.println("Dealing");
//        war.dealCards();
//        System.out.println(shelly.getHand().getSize());
//        for(PlayingCard card: shelly.getHand().getCards()){
//            System.out.println(card);
//        }
//        System.out.print(shelly.getHand());
    }
    
}
