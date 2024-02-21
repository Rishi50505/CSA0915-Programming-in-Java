public class BrotherAges {

    public static void main(String[] args) {
        int olderBrotherAge = 28;
        int youngerBrotherAge = 24;
        int ageDifference = olderBrotherAge - youngerBrotherAge;

        int targetOlderBrotherAge = 56;
        int youngerBrotherAgeWhenOlderIs56 = targetOlderBrotherAge - ageDifference;

        int olderBrotherAgeWhenYoungerIs1 = 5;
        int youngerBrotherAgeWhenOlderIs5 = olderBrotherAgeWhenYoungerIs1 + ageDifference;

        System.out.println("Younger brother's age when older brother is 56: " + youngerBrotherAgeWhenOlderIs56);
        System.out.println("Younger brother's age when older brother was 5: " + youngerBrotherAgeWhenOlderIs5);
    }
}
