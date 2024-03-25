package DateAPIchanges;
//java program on LocalTime class
import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create a LocalTime object representing the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Create a LocalTime object for a specific time
        LocalTime specificTime = LocalTime.of(15, 30, 45);
        System.out.println("Specific Time: " + specificTime);

        // Get the hour, minute, and second from a LocalTime object
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);

        // Modify a LocalTime object (LocalTime is immutable, so a new object is returned)
        LocalTime modifiedTime = specificTime.plusHours(2);
        System.out.println("Modified Time: " + modifiedTime);

        // Compare two LocalTime objects
        LocalTime futureTime = LocalTime.of(18, 0, 0);
        if (futureTime.isAfter(currentTime)) {
            System.out.println("Future time is after current time");
        } else {
            System.out.println("Future time is not after current time");
        }
	}

}
