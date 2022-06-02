/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 * @modifier chahat jain 991668960
 */
import java.util.Scanner;
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Card[] rr = new Card[7];
        for(int i = 0; i < rr.length; i++){
            Card c = new Card();
            int r = c.get_randd();
            int s = c.getSuite();
            c.setValue(r);
            c.set_suite(s);
            rr[i] = c;
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a card number:(1 - 12) ");
        int card_no = in.nextInt();
        
        System.out.println("1: Heart\n2: Diamond\n3: Spades\n4: Clubs");
        int suit_no = in.nextInt();
        
        Card c = new Card();
        lucky_card = new Card(1, 4);
        c.set_suite(suit_no - 1);
        for(int i =0; i < rr.length; i++){
            if(rr[i].value == card_no){
                //if(rr[i].suite_value == c.suite_value){}
                System.out.println("Congratulations!Your card matches.");
                break;
                
            }
            if(i == 7){
                System.out.println("Sorry!No match found");
            }
        }
        System.out.println("Cards are: ");
        for(int i = 0; i < 7; i++){
            System.out.println(rr[i].value + " of " + rr[i].suite_value);
        }
        
    }
    
}
