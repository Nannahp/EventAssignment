public class Participant {
    String name;
    int age;

    @Override
    public String toString() {
        return name +
                ", who is " + age +" years old";
    }
}
