package com.javaproject;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate){
        LocalDate currDate = LocalDate.now();

        if (birthDate != null && !birthDate.isAfter(currDate)) {

            return Period.between(birthDate, currDate).getYears();

        }else{
            throw new IllegalArgumentException();
        }
    }

    public static long calculateAgeDays(LocalDate birthDate){
        LocalDate currDate = LocalDate.now();

        if (birthDate != null && !birthDate.isAfter(currDate)) {

            return ChronoUnit.DAYS.between(birthDate, currDate);

        }else{
            throw new IllegalArgumentException();
        }
    }

}
