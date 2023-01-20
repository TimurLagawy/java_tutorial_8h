package test;

public class Person {
    private Name personName;
    private int personCounter = 1;
    public Person(Name personName){
        this.personName = personName;
    }

   public Person() {
        personCounter++;

    }

    public String helloWorld() {
        return "Hello World";
    }
    public Name name(){
        return personName;
    }

    public String hello(String name) {

        return "Hello " + name;
    }

    public int numberOfPersons() {
        return personCounter;
    }
}
