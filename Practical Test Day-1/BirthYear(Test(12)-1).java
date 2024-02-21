import java.time.LocalDate;

public class VotingEligibility {

    public static void main(String[] args) {
        int currentYear = 2073;
        int votingAge = 21;

        int eligibleYear = currentYear - votingAge;

        LocalDate currentDate = LocalDate.now();

        int birthYear;
        if (eligibleYear > 2060) {
            birthYear = eligibleYear - (currentDate.getYear() - 2023);
        } else {
            birthYear = (eligibleYear + currentDate.getYear()) / 2;
        }

        System.out.println("The person's estimated birth year is: " + birthYear);
    }
}
