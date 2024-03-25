package DateAPIchanges;
/*
 * -> Period class is used to check difference between 2 dates
// java program on Period class
 */
import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create two LocalDate objects
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 1);

        // Calculate the period between the two dates
        Period period = Period.between(startDate, endDate);

        // Display the period
        System.out.println("Period between " + startDate + " and " + endDate + ": " + period.getYears() + " years, " +
                period.getMonths() + " months, " + period.getDays() + " days");

        // Create a period of 2 years, 3 months, and 5 days
        Period customPeriod = Period.of(2, 3, 5);

        // Add the custom period to the start date
        LocalDate newDate = startDate.plus(customPeriod);

        // Display the new date
        System.out.println("New date after adding custom period: " + newDate);
    
	}

}
