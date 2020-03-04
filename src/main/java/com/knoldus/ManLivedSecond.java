package com.knoldus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * following class represent  man lived seconds
 */
public class ManLivedSecond {

    /**
     *
     * @param birthDateInput get birth date
     * @param deathDateInput get death date
     * @return actual seconds he live
     */
    static long getBirthAndDeathDateSeconds(String birthDateInput, String deathDateInput){
        LocalDate birthDate=LocalDate.parse(birthDateInput);
        LocalDate deathDate=LocalDate.parse(deathDateInput);

        Integer seconds=86400;
        long intervalDays = ChronoUnit.DAYS.between(birthDate, deathDate);
        return intervalDays * seconds ;
    }

}
