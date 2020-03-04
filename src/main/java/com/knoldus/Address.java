package com.knoldus;

import java.util.*;

class Address {
    String primaryAddress;
    Optional<String> secondaryAddress;




    Address(String primaryAddress) {
        this.primaryAddress=primaryAddress;
        this.secondaryAddress=Optional.empty();
   }

    Address(String primaryAddress,String secondaryAddress) {
        this.primaryAddress=primaryAddress;
        this.secondaryAddress=Optional.ofNullable(secondaryAddress);
    }


}
