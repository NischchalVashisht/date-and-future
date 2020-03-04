package com.knoldus;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * following class represent leap year after first republic day
 */
public class RepublicDay {

    /**
     *
     * @return List of Leap year
     */
    static List<LocalDate> getLeapYears(){
        LocalDate firstLocalDateInstance = LocalDate.of(1949, 01, 26);
        LocalDate secondLocalDateInstance = LocalDate.now();
        Period intervalPeriod = Period.between(firstLocalDateInstance,secondLocalDateInstance);
        Integer difference = intervalPeriod.getYears();

      return IntStream.range(0,difference).mapToObj(secondLocalDate->firstLocalDateInstance.plus(secondLocalDate, ChronoUnit.YEARS)).filter(x->x.isLeapYear()).collect(Collectors.toList());
    }


}
