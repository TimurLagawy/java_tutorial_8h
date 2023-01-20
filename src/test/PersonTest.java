package test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person timur = new Person();
        assertEquals("Hello World", timur.helloWorld());
    }
    @Test
    public void shouldReturnHelloTimur() {
        Person person = new Person();
        assertEquals("Hello Timur", person.hello("Timur"));
    }
    @Test
            public void souldreturnNumberOfPersons(){
        Person person1 = new Person();
        Person myPerson = new Person();

        assertEquals(2, myPerson.numberOfPersons());
    }
}
