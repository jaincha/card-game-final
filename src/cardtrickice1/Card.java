/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 * @modifier chahat jain 991668960
 * @author sivagamasrinivasan
 */
import java.util.*;
public class Card 
{
    int value;
    int suite_number;
    String [] suite = { "diamonds","clubs","spades","hearts"};
    String suite_value;
    Random rand = new Random();
    
    public int get_randd(){
        int random_no = rand.nextInt(13 -1) + 1;
        return random_no;
    }
    
    public int getSuite(){
        int random_suite = rand.nextInt(suite.length);
        return random_suite;
    }
    
    public void setValue(int value) {
        this.value = value;
    }

    public void set_suite(int suite_number) {
        this.suite_number = suite_number;
        suite_value = suite[suite_number];
    }    
}
