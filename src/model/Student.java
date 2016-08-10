package model;

import helper.DaysOfWeek;

/**
 * Created by Wagner Santos on 8/9/16 - 11:30 AM.
 */
public class Student extends Client {

    // TODO: 8/10/16 Need to implement unit tests

    private boolean hasStudentPass;
    private static double baseFare = 8.00;


    public Student(boolean hasStudentPass) {
        this.hasStudentPass = hasStudentPass;
    }

    @Override
    public double pay(DaysOfWeek daysOfWeek) {
        // always apply major discount
        if (!daysOfWeek.equals(DaysOfWeek.SUNDAY) || !daysOfWeek.equals(DaysOfWeek.SATURDAY)) {
            if (this.hasStudentPass && !daysOfWeek.equals(DaysOfWeek.WEDNESDAY)) {
                //apply 35% discount
                return baseFare-(baseFare*0.35);
            } else {
                switch (daysOfWeek) {
                    case MONDAY:
                        // apply 10% discount
                        return baseFare-(baseFare*0.1);
                    case TUESDAY:
                        // apply 5% discount
                        return baseFare-(baseFare*0.05);
                    case WEDNESDAY:
                        // apply 50% discount
                        return baseFare-(baseFare*0.5);
                    case THURSDAY:
                        // apply 30% discount
                        return baseFare-(baseFare*0.3);
                }
            }
        }
        return baseFare;
    }
}
