package com.javaproject;
import java.time.LocalDate;
import java.time.Period;


public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate){
        LocalDate currDate = LocalDate.now();

        if (birthDate != null && !birthDate.isAfter(currDate)) {

            return Period.between(birthDate, currDate).getYears();

        }else{
            throw new IllegalArgumentException();
        }
    }

}
