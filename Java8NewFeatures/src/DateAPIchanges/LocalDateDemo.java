package DateAPIchanges;

import java.time.LocalDate;

/*
 * -> In java we have java.util.Date class to work with date related functionality in our application.
Date date = new Date();
-> When we create object for Date class it will give both date and time (current date & time).
-> If we want to get only date without time or only time without date then we have to write our own logic using Date class object.
-> To overcome this problem, in java 1.8 v changes happened for Date API.
-> In Java 1.8v new classes provided to work with date related functionality
java.time.LocalDate (It will deal with only date)
java.time.LocalTime (It will deal with only time)
java.time.LocalDateTime (It will deal with both date & time)
-> The above classes got introduced in java.time package.

 */

// java program LocalDate class
public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Create a LocalDate object representing the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Create a LocalDate object for a specific date
        LocalDate specificDate = LocalDate.of(2022, 12, 31);
        System.out.println("Specific Date: " + specificDate);

        // Get the year, month, and day from a LocalDate object
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);

        // Modify a LocalDate object (LocalDate is immutable, so a new object is returned)
        LocalDate modifiedDate = specificDate.plusDays(10);
        System.out.println("Modified Date: " + modifiedDate);

        // Compare two LocalDate objects
        LocalDate futureDate = LocalDate.of(2023, 1, 1);
        if (futureDate.isAfter(currentDate)) {
            System.out.println("Future date is after current date");
        } else {
            System.out.println("Future date is not after current date");
        }
	}

}
