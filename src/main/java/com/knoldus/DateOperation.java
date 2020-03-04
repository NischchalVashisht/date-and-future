package com.knoldus;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * following class List all your birth date’s DayOfWeek till date.
 */

public class DateOperation {

    /**
     *
     * @param localDateFirst starting date
     * @param localDateSecond last date
     * @return difference in N.o of Year
     */
    private Integer getYearDifference(LocalDate localDateFirst, LocalDate localDateSecond) {


        Period intervalPeriod = Period.between(localDateFirst, localDateSecond);
        return intervalPeriod.getYears();
    }

    /**
     *
     * @param localDateInstance starting Date Instance
     * @param limit N.o of Years
     * @param list Contains list Of Day of Week
     * @return list of day of week
     */
    public List<String> getDayList(LocalDate localDateInstance, Integer limit, ArrayList<String> list) {

        if (limit == 1)
            return list;
        else {
            list.add((localDateInstance.getDayOfWeek().toString()));
            getDayList(localDateInstance.plus(1, ChronoUnit.YEARS), limit - 1, list);
        }
        return list;
    }

    /**
     *
     * @param year represent year
     * @param month represent month
     * @param day   represent day
     * @return  desire output of list of week days
     */
    public List<String> getDaysOfBirthDay(Integer year, Integer month, Integer day) {
        LocalDate firstLocalDateInstance = LocalDate.of(year, month, day);
        Integer difference = getYearDifference(firstLocalDateInstance, LocalDate.now());
        return getDayList(firstLocalDateInstance, difference, new ArrayList<>());

    }


}
