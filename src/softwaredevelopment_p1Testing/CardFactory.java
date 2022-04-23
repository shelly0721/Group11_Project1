/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;

/**
 *
 * @author aliab
 */
public class CardFactory {
    public GroupOfCards getDeck(){
        GroupOfCards deck = new GroupOfCards(52);
        String[] suit = {"clubs", "diamonds", "hearts", "spades"};
        for (int i=0;i<4;i++){
            for (int j=2; j<15; j++){
                deck.add(new PlayingCard(j,suit[i]));
            }
        }
        return deck;
    }
}
