import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedateTimeExample {
  public static void main(String[] args) {
    //create a ZonedDateTime object
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("Current ZonedDateTime: " + zonedDateTime);

    //compare two ZonedDateTime objects
    ZonedDateTime future = zonedDateTime.plusDays(1);
    System.out.println("Future ZonedDateTime: " + future);

    //get the specific value from ZonedDateTime
    int year = zonedDateTime.getYear();
    int month = zonedDateTime.getMonthValue();
    int day = zonedDateTime.getDayOfMonth();
    int hour = zonedDateTime.getHour();
    int minute = zonedDateTime.getMinute();
    int second = zonedDateTime.getSecond();
    System.out.println("Year: " + year);

    //convert ZonedDateTime to a another timezone
    ZonedDateTime newYorkTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
    System.out.println("New York Time: " + newYorkTime);

    //localize ZonedDateTime
    ZonedDateTime tokyoTime = zonedDateTime.withZoneSameLocal(ZoneId.of("Asia/Tokyo"));
    System.out.println("Tokyo Time: " + tokyoTime);

    // Calculate the period between two LocalDates
    LocalDate localDate1 = LocalDate.of(2021, 1, 1);
    LocalDate localDate2 = LocalDate.of(2021, 12, 31);
    Period period = Period.between(localDate1, localDate2);
    System.out.println("Period: " + period);

    // Get specific date units from the period
    int years = period.getYears();
    int months = period.getMonths();
    int days = period.getDays();
    System.out.println("Years: " + years);
    System.out.println("Months: " + months);
    System.out.println("Days: " + days);

    // Define a custom format
    String formatted = zonedDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    System.out.println("Formatted ZonedDateTime: " + formatted);

    // Parse a string to ZonedDateTime
    String text = "2021-01-01T12:00:00+01:00[Europe/Paris]";
    ZonedDateTime parsed = ZonedDateTime.parse(text);
    System.out.println("Parsed ZonedDateTime: " + parsed);

    // Get the current moment in time (timestamp)
    long epochSecond = zonedDateTime.toEpochSecond();
    System.out.println("Epoch Second: " + epochSecond);



  }

}
