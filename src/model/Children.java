package model;

import helper.DaysOfWeek;

/**
 * Created by Wagner Santos on 8/9/16 - 11:29 AM.
 */
public class Children extends Client {

    // TODO: 8/10/16 Need to implement unit tests

    private static double baseFare = 5.50;


    @Override
    public double pay(DaysOfWeek daysOfWeek) {
        switch (daysOfWeek) {
            case MONDAY:
                return baseFare-(baseFare*0.1);
            case TUESDAY:
                return baseFare-(baseFare*0.15);
            case WEDNESDAY:
                return baseFare-(baseFare*0.3);
            case THURSDAY:
                return baseFare;
            case FRIDAY:
                return baseFare-(baseFare*0.11);
            default:
                return baseFare;
        }
    }
}
