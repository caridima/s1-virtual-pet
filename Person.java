public class Person {
    private double height;

    public Person(double height){
        this.height = height;
    }
    public boolean equals(Person other){
        return (this.height == other.height);
    }
}
