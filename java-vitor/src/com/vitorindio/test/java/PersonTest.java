package com.vitorindio.test.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};
    private static final int PENDING = 40;
    private static final int PROCESSING= 41;
    private static final int PROCESSED = 42;

    @Test
    public void shouldReturnHelloWorld(){

        Person vitor = new Person();
        assertEquals("Hello World", vitor.helloWorld() );
    }

    @Test
    public void shouldReturnVitor(){
        Person person = new Person();
        assertEquals("Hello Vitor", person.hello("Vitor"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        assertEquals(3, Person.numberOfPersons() );
    }

    @Test
    public void demonstrateConditionals(){
        int i = 4;
        int j = 3;

        if (i > j) {
            //do something;
        }else if (j>i){
            //do something;
        }else if(i == j){
            //do something;
        }else {
            //do something;
        }
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        //using FOR
        Person person1;
        for (int i = 0; i < 4; i++) {
            person1 = new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop2(){
        Person person1;
        int i = 0;
//using WHILE
    /*
        while(i < 4){
            person1 = new Person();
            i++;

        } */
//using DO WHILE
        do {
            person1 = new Person();
            i++;
        }while(i < 4);
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnDemonstrateArraysInLoop(Person[] persons) {
    //using .LENGTH
        for (int i =0; i < persons.length; i++) {
            persons[i] = new Person();
        }

    /*
    public void shouldReturnDemonstrateArraysInLoop() {
        Person[] persons = new Person[4];
        Name vitor, indio, brasil;
    FOR
        for (int i =0; i < 4; i++){
            persons[i] = new Person();
        }
        //FOR EACH
        for(Person person: persons){
        person.helloWorld();
        System.out.println(person.hello("vitor,indio,brasil"));
        {
    }
    */

    }

    @Test
    public void demonstrateArrays(){
     Person[] persons = new Person[4];
     Person myPerson = new Person();
     persons[0] = new Person();
     persons[1] = new Person();
     persons[2] = new Person();
     persons[3] = myPerson;

    }

    @Test
    public void demonstrateArrays2(){
/*
       Person myPerson = new Person();
        Person[] persons = new Person[4];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = myPerson;

        Person myPerson2 = new Person();
       // Person[] persons2 = {persons[1], null, myPerson, myPerson2};
       // Person vip = persons2[3];
       // vip.helloWorld();
       final Person[] persons2 = {persons[1], null, myPerson, myPerson2};
*/


/*using FOR*/
        /*
        for (LoggingLevel state: LoggingLevel.values() ){
            if (state == Pending){
                callMethod

            }if (state == Processing){
                callMethod();

            }if (state == LoggingLevel.Processed){
                callMethod();
            }
        }
        */
/*using SWITCH CASE*/
        LoggingLevel state = LoggingLevel.PENDING;
        int myState = PENDING;

        switch (myState) {
            case PENDING:
                callMethod();
                break;
            case PROCESSING:
                callMethod();
                break;
            default:
                CallMethod();
        }

    }

}