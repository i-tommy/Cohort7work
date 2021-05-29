package ChapterFiveExercise;

public class ChristmasSong {

    public static void main(String... arg) {
        int verse = 1;
        int daysInChristmas = 1;

        do {

            switch (daysInChristmas) {
                case 1:
                    System.out.println("On the 1st day of xmas, my true love gave to me");
                    break;

                case 2:
                    System.out.println("On the 2nd day of xmas, my true love gave to me");
                    break;

                case 3:
                    System.out.println("On the 3rd day of xmas, my true love gave to me");
                    break;

                case 4:
                    System.out.println("On the 4th day of xmas, my true love gave to me");
                    break;

                case 5:
                    System.out.println("On the 5th day of xmas, my true love gave to me");
                    break;

                case 6:
                    System.out.println("On the 6th day of xmas, my true love gave to me");
                    break;

                case 7:
                    System.out.println("On the 7th day of xmas, my true love gave to me");
                    break;

                case 8:
                    System.out.println("On the 8th day of xmas, my true love gave to me");
                    break;

                case 9:
                    System.out.println("On the 9th day of xmas, my true love gave to me");
                    break;

                case 10:
                    System.out.println("On the 10th day of xmas, my true love gave to me");
                    break;

                case 11:
                    System.out.println("On the 11th day of xmas, my true love gave to me");
                    break;

                case 12:
                    System.out.println("On the 12th day of xmas, my true love gave to me");


            }
            switch (verse) {
                case 12:
                    System.out.println("Twelve drummers drumming");

                case 11:
                    System.out.println("Eleven pipers piping");

                case 10:
                    System.out.println("Ten lords are leaping");

                case 9:
                    System.out.println("Nine ladies dancing");

                case 8:
                    System.out.println("Eight maids are milking");

                case 7:
                    System.out.println("Seven swarms are swimming");

                case 6:
                    System.out.println("Six geese are laying");

                case 5:
                    System.out.println("Five gold rings");

                case 4:
                    System.out.println("Four calling birds");

                case 3:
                    System.out.println("Three fresh hens");

                case 2:
                    System.out.println("Two turtle doves");

                case 1:
                    System.out.println("A partridge in a pear tree");

            }
            verse += 1;
            daysInChristmas += 1;

        } while (daysInChristmas >= 1 && verse <= 12);

    }

}

