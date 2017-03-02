public class Person {

    public Person(String name, int age, String postcode) {
        this.name = name;
        this.age = age;
        this.postcode = postcode;
    }    

    String name;
    int age;
    String postcode;   
    
    @Override
    public String toString() {
        return String.format("%s is %d y/o at %s", name, age, postcode);
    }
    
}
