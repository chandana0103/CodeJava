package DateAPIchanges;

import java.time.Duration;
import java.time.LocalTime;

//-> Duration class is used to check difference between 2 times.
//java program on Duration class
public class DurationClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create two LocalTime objects
        LocalTime startTime = LocalTime.of(9, 0, 0);
        LocalTime endTime = LocalTime.of(10, 30, 0);

        // Calculate the duration between the two times
        Duration duration = Duration.between(startTime, endTime);

        // Display the duration
        System.out.println("Duration between " + startTime + " and " + endTime + ": " + duration);

        // Create a duration of 3 hours and 15 minutes
        Duration customDuration = Duration.ofHours(3).plusMinutes(15);

        // Add the custom duration to the start time
        LocalTime newTime = startTime.plus(customDuration);

        // Display the new time
        System.out.println("New time after adding custom duration: " + newTime);
    
	}

}
