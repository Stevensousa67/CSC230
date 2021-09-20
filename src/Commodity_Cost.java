/* Steven Sousa - 4Cs - Data Structures - 09/19/21

You are buying commodities at different times at different prices and selling them hopefully for a profit. Given a period
of time and the corresponding current price for that commodity. Write a program to identify the best buy and sell dates.

•The commodity cost for each day in a given period is given in an array A[] of size N.
•Find all the days on which you buy and sell the commodity so that in between those days your profit is maximum.
•Assume i[0] is the first buy day.

Input: int[] price = {100,180,260,310,240,535,695}; n = 7; */

import java.util.*;
import java.util.stream.*;

public class Commodity_Cost {
    public static void main(String[] args){
        int[] price = {100, 180, 260, 310, 240, 535, 695};
        int sell_day_counter = 0;
        int buy_day_counter = 1;
        List<Integer> temp = IntStream.of(price).boxed().collect(Collectors.toList());
        ArrayList<Integer> cost = new ArrayList<Integer>(temp);
        ArrayList<Integer> buy_day = new ArrayList<Integer>();
        ArrayList<Integer> sell_day = new ArrayList<Integer>();
        boolean stock = true;
        buy_day.add(cost.indexOf(100));

        for(int i = 1; i < cost.size()-1; i++){
            if(i == 5){
                sell_day_counter++;
                sell_day.add(cost.indexOf(cost.get(i+1)));
                stock = false;
            }
            else if (stock) {
                if (cost.get(i) < cost.get(i + 1)) {
                    continue;
                }
                sell_day_counter++;
                sell_day.add(cost.indexOf(cost.get(i)));
                stock = false;
            }
            else {
                buy_day_counter++;
                buy_day.add(cost.indexOf(cost.get(i)));
                stock = true;
            }
        }

        System.out.println("The best days to sell are: " + sell_day);
        System.out.println("The best days to buy are: " + buy_day);
    }
}
