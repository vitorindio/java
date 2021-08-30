package com.vitorindio.test.java;

import com.vitorindio.main.java.Name;

public class Person {
    private Name personName; /* instance variable */

    private static int personCounter;

    public Person (){
    //defautl constructor
    //use for create
        personCounter++;

    }

    //instance method
    public Name name(){
/*instance method*/
        return personName;

    }

    public Person(Name personName) {
        this.personName = personName;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons(){
        return personCounter ;
    }

    public Object helloWorld() {
        return "Hello World";
    }
}
