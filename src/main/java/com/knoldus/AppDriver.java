package com.knoldus;

import java.util.Arrays;
import java.util.List;

public class AppDriver {


    public static void main(String args[]){
        Student firstInstance =new Student(1,"nischal",new Address("abc"));
        Student secondInstance=new Student(2,"raveen",new Address("def"));
        Student thirdInstance=new Student(3,"Abhinav",new Address("ghi","goa"));
        Student fourthInstance=new Student(4,"Suraj",new Address("jkl","goa"));
        Student fifthInstance=new Student(5,"Mansi",new Address("pqr","UP"));


        List<Student> list= Arrays.asList(firstInstance, secondInstance, thirdInstance, fourthInstance, fifthInstance);
        List<Student>finalListWithEmptySecondaryAddress=Student.getListWithOnlyPrimaryAddress(list);
        List<Student>finalListWithNameStarts=Student.getListWithOnlyPrimaryAddressAndName(list);

        for(Student student : finalListWithEmptySecondaryAddress){

            System.out.println(student.name);

        }
        for(Student student : finalListWithEmptySecondaryAddress){

            System.out.println(student.name);

        }

        System.out.println(RepublicDay.getLeapYears());
        System.out.println(ManLivedSecond.getBirthAndDeathDateSeconds("1997-07-25","2150-07-26"));
        System.out.println(FileContentCount.getContentCount("/home/knoldus/Downloads/TestingScala/build.sbt"));

    }
}
