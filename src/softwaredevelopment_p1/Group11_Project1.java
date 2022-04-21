package softwaredevelopment_p1;

import java.util.Scanner;

/**
 *
 * @author Group_11
 */
public class Group11_Project1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game war = new Game();
        System.out.println("Please enter the number of players:");
        int numOfPlayers = 0;
        try{
            numOfPlayers = input.nextInt();
        }catch(Exception e){
            System.out.println("That's an invalid entry");
            Group11_Project1.main(args);
        }
        if(numOfPlayers > 0){
            int i = 0;
            while(war.getPlayers().size() < numOfPlayers){
                System.out.printf("Player %d: Please enter your name", i+1);
                String name = input.nextLine();
                Player player = new Player(name);
                war.registerPlayer(player);
                i++;
            }
//            for(int i=0;i<numOfPlayers;i++){
//                System.out.printf("Player %d: Please enter your name", i+1);
//                input.nextLine();
//                Player player = new Player(input.nextLine());
//                war.registerPlayer(player);
//                input.next();
//                
//            }
            System.out.println("Welcome all to this Game of War");
            war.dealCards();
        }
        
        if(war.getPlayers().size() > 0){
            String[] options = {"Play A Round", "Show Everyone's score",
                "Quit This Game", "Restart A New Game"};
            for(int i=0;i<options.length;i++){
                System.out.printf("option %d: %s \n", i+1, options[i]);
            }
            input.nextLine();
//            input.next();
            int choice = input.nextInt();

            switch(choice){
                case 1:
                    //play round
                    war.playRound();
                    break;
                case 2:
                    //show score
                    war.showScores();
                    break;
                case 3:
                    //quit game
                    System.exit(0);
                    break;
                case 4:
                    //restart game
                    Group11_Project1.main(args);
                    break;
            }
        }
        
        
//        Player danielle = new Player("Danielle");
//        Player shelly = new Player("Shelly");
//        Player jenny = new Player("Jenny");
//        Player ali = new Player("Ali");
//
//        war.registerPlayer(ali);
//        war.registerPlayer(jenny);
//        war.registerPlayer(shelly);
//        war.registerPlayer(danielle);
//        for(Player player: war.getPlayers()){
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
