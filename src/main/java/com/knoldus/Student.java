package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  following class represent a student class having three field
 */
public class Student {
    Integer id;
    String name;
    Address address;

    Student(Integer id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    /**
     *
     * @param list get list of student on operation is to be performed
     * @return list of student with desired output
     */
   static List<Student> getListWithOnlyPrimaryAddress(List<Student> list){
        return list.stream().filter(student->!student.address.secondaryAddress.isPresent())
                .collect(Collectors.toList());
   }

    /**
     *
     * @param list get list of student on operation is to be performed
     * @return list of student with desired output
     */
    static List<Student> getListWithOnlyPrimaryAddressAndName(List<Student> list){
        return list.stream().filter(student->!student.address.secondaryAddress.isPresent() && student.name
                .toUpperCase().startsWith("N"))
                .collect(Collectors.toList());
    }

}
