package model;

import helper.DaysOfWeek;

/**
 * Created by Wagner Santos on 8/9/16 - 11:30 AM.
 */
public class Elderly extends Client {

    // TODO: 8/10/16 Need to implement unit tests
    private static double baseFare = 6.00;

    @Override
   public double pay(DaysOfWeek daysOfWeek) {
        switch (daysOfWeek) {
            case MONDAY:
                return baseFare-(baseFare*0.1);
            case TUESDAY:
                return baseFare-(baseFare*0.15);
            case WEDNESDAY:
                return baseFare-(baseFare*0.4);
            case THURSDAY:
                return baseFare-(baseFare*0.3);
            case FRIDAY:
                return baseFare;
            case SATURDAY:
                return baseFare-(baseFare*0.05);
            case SUNDAY:
                return baseFare-(baseFare*0.05);
            case HOLIDAY:
                return baseFare-(baseFare*0.05);
            default:
                return baseFare;
        }
    }
}
