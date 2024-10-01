import java.text.SimpleDateFormat;
import java.util.Date;

// AS 2024-10-01
// TodaysDate.java
public class TodaysDate {
    public static void main(String[] args) {

        System.out.printf("\n Welcome to dates and Animal class\n");

        // Create a Date object tp represent the current date
        Date today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formattterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        Date Year = new Date();
        String strTodaysYear = formatter.format(Year);
        // Output the result
        System.out.println("Today's date in the format yyyy-MM-dd; " + strTodaysDate);

        // Calculate birthdates for the following two hyenas
        // 1) 4-year-old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12-year-old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write java code to calculate birthdates for the animals and then create a method that returns
        // for the animal's birthdate.

        // input: "4-year-old female hyena, born in spring"
        // processing: ' find the age and birth season
        //               and then use decision control structure
        //               calculate the date.

        // parse the string
        String strStarting = "12-year-old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        // split the string on ","
        String[] arrayOfStringPartsOnCOmma = strStarting.split(",");
        // output the array elemetns
        // this is a for : each loop - very handy when examining array elements
        int elementNum = 0;
        for (String thePart : arrayOfStringPartsOnCOmma) {
            System.out.println("element " + elementNum + "of this string is: " + thePart);
            elementNum++;
        }
        String[] arrayOfStrPartOnSpace = arrayOfStringPartsOnCOmma[0].split(",");
        elementNum = 0;
        for (String thePart : arrayOfStrPartOnSpace) {
            System.out.println("element " + elementNum + "of this string is: " + thePart);
            elementNum++;


        }
        System.out.println();

        String[] arrayOfStrPartOnSpace02 = arrayOfStringPartsOnCOmma[1].split(",");
        elementNum = 0;
        for (String thePart : arrayOfStrPartOnSpace02) {
            System.out.println("element " + elementNum + "of this string is: " + thePart);
            elementNum++;
        }


        String ageInYears = arrayOfStrPartOnSpace[0];
        String animalBirthSeason = arrayOfStrPartOnSpace02[2];
        System.out.println("the age in years of the animal is: " + ageInYears);
        System.out.println(" the season of birth of the animal is: " + animalBirthSeason);

        String animalBirthDate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        if (animalBirthSeason.contains("spring")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-03-21";
        }
        if (animalBirthSeason.contains("fall")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-09-21";
        }
        if (animalBirthSeason.contains("winter")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-09-21";

        }
        if (animalBirthSeason.contains("summer")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-09-21";

        }
        System.out.println("\n animalBirthDate = " + animalBirthDate);
        
    }
}



