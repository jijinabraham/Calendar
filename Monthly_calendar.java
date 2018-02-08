package calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Calendar {

    
    public static void main(String[] args) {
        int year = 2018;
        int month = 2;
        LocalDate day = LocalDate.of(year, month, 1);
        int num_days = day.lengthOfMonth(); // How many days in this month
        // Days of the week header
        System.out.println("Su Mo Tu We Th Fr Sa");
        // Day of the week for the 1st day of the month
        DayOfWeek first_day = day.getDayOfWeek();
        int padding = (first_day.ordinal() % 7+1)*3;
        for(int p = 0; p < padding; p ++)
            System.out.print(" ");
        
        
        for (int i = 0; i < num_days; i ++) {
            // Print current date
           // System.out.print(day.getDayOfMonth() + " ");
           System.out.printf("%2d", day.getDayOfMonth() );
           
            // Start a new line after Saturdays
            if (day.getDayOfWeek() == DayOfWeek.SATURDAY)
                System.out.println();
            // Move forward the next day
            day = day.plusDays(1);
        }
        System.out.println();
    }
    
}
