public class Event {
    String name;
    String date;
    String location;
    int numberOfParticipents;


    @Override
    public String toString() {
        return "Event \"" +name+"\", at the " + date + " at " + location +
                "\n" + numberOfParticipents + " people on checklist.";
    }
}
