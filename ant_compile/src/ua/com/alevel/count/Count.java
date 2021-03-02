package ua.com.alevel.count;

import org.apache.commons.collections4.bag.*;
import org.apache.commons.collections4.Bag;

import ua.com.alevel.check.Check;

public class Count{
    public void run(){
        Bag bag = new HashBag();
//        bag.add("ONE", 6);  // add 6 copies of "ONE"
//        bag.remove("ONE", 2);  // removes 2 copies of "ONE"
//        int number = bag.getCount("ONE");  // returns 4, the number of copies in the bag (6 - 2)
        int number = 6;
        Check.run(number);
    }
}