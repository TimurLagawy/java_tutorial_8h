package test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person timur = new Person();
        assertEquals("Hello World", timur.helloWorld());
    }

    @Test
    public void shouldReturnHelloTimur() {
        Person person = new Person();
        assertEquals("Hello Timur", person.hello("Timur"));
    }

    @Test
    public void souldreturnNumberOfPersons() {
        Person person1 = new Person();
        Person Person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnOfPersonsInLoop() {
        for (int i = 0; i < 4; i++) {
            new Person();
        }
      /*  assertEquals(4, Person.numberOfPersons());
        int j = 0;
        while (j < 4) {
            new Person();
            j++;
        }
       j = 0;
        do {
            new Person();
            j++;
        } while (j < 4);
        assertEquals(12, Person.numberOfPersons());

        /* Person person1;
        int i = 0;
        do {
            person1 = new Person();
            i++;
        }while (i<4);
            assertEquals(4, Person.numberOfPersons());

        while(i < 4){
            person1 = new Person();
            i++;
        }*/
        /*for (int i = 0; i < 4; i ++) {
            person1 = new Person();
        }*/
        assertEquals(4, Person.numberOfPersons());
        System.out.println( "true  " + Person.numberOfPersons() );
    }

    @Test
    public void demonstrateBoolean() {
        int i = 4;
        int j = 3;
        boolean monday = false;
        boolean raining = true;

        //if(shouldStayAtHome(i && j && monday && raining) )
        if (shouldStayAtHome(i, j, monday, raining)) {
            stayAtHome();
        }
        if (i == j) {
            raining = true;
        }
        if (monday || raining) {
            i = 34;
            j = 91;
            i = i + j;
            stayAtHome();
        } else if (j > i) {
            i++;
            j = 56;
        } else if (i != j) {
            i = 8;
        } else {
            j--;
        }
    }
@Test
public void demonstrateArrays(){
        Person persons [] = new Person[4];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
    for (int i = 0; i < persons.length; i++) {
        persons[i] = new Person();
    }
    for (int i = 0; i < persons.length; i++) {
        persons[i] = new Person();
    }
    for(Person person : persons){
        person.helloWorld();
    }
    Person myPerson = new Person();
    Person myPerson2 = new Person();
    Person[] persons2 = {persons[0], null, myPerson, myPerson2};
       /* Person[] persons = new Person[4];
    for (int i = 0; i < persons.length; i++) {
        persons[i] = new Person();
    }

        /* можно расписать каждый элемент, а можно прописать: создать список
        Person myPerson = new Person();
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();

        persons[3] = myPerson;  - замена элементов в списке
        myPerson = persons[2];*/

}
    private void stayAtHome() {
    }

    private boolean shouldStayAtHome(int i, int j, boolean monday, boolean raining) {
         return i < j || (monday && raining) || j > 37;
    }
}