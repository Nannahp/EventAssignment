import java.util.Arrays;

public class EventManager {
    public static void main(String[] args) {
        new EventManager().run();
    }

    public void run() {
        // Make 2 events (in array)
        Event firstEvent = new Event();
        Event secondEvent = new Event();
        Event[] events = {firstEvent, secondEvent};

        makeEvents(firstEvent, "Cath's birthday ", "3th of September", "Bristol Boat House", 33);
        makeEvents(secondEvent, "Alec's promotion party", "25th of July", "Broadchurch Police Station", 40);

        // Make 3 participants for each event
        Participant person1 = new Participant();
        Participant person2 = new Participant();
        Participant person3 = new Participant();
        // Make list of participants (not a list, made an array)
        Participant[] participants = {person1, person2, person3};

        makeParticipants(person1, "Trish", 49);
        makeParticipants(person2, "Jim", 51);
        makeParticipants(person3, "Cath", 50);

        // Print events and participents by going through the arrays in a for-loop.
        // Participents will be the same for both events.
        System.out.println("\n\u001B[32mPRINT WITH FOR-LOOP \u001B[0m\n");
        showEventInformationArrays(events,participants);
        // Print single event and participents.
        // Use same participants but update names and ages.
        System.out.println("\n\u001B[32mPRINT INDIVIDUALLY \u001B[0m\n");
        showEventInformation(firstEvent, participants);
        makeParticipants(person1, "Ellie", 39);
        makeParticipants(person2, "Beth", 37);
        makeParticipants(person3, "Daisy", 14);
        showEventInformation(secondEvent, participants);

    }
    public void makeEvents(Event event, String name, String date, String location, int participants){
        event.name = name;
        event.date = date;
        event.location = location;
        event.numberOfParticipents = participants;
    }
    public  void makeParticipants(Participant person, String name, int age){
        person.name = name;
        person.age = age;
    }
    public void showEventInformationArrays(Event[] events, Participant[] participants){
            for (int i = 0; i <= events.length-1; i++ ){
                System.out.println(events[i]);
                System.out.println("\nSome expected guests are: ");
                for (int j = 0; j<=participants.length-1; j++){
                    System.out.println(participants[j]);
                }
                System.out.println();
            }
    }
    public void showEventInformation(Event event, Participant[] participants){
        System.out.println(event);
        System.out.println("Some expected guests are: ");
        System.out.println(Arrays.asList(participants) + "\n");
    }
}
