package GemminiPractice;

import java.util.ArrayList;
import java.util.List;

public class FirstPractice {

    public static String getDayName(int dayNumber) {


        switch (dayNumber) {
            case 1:
                return "Hétfő";

            case 2:
                return "Kedd";

            case 3:
                return "Szerda";

            case 4:
                return "Csütörtök";

            case 5:
                return "Péntek";

            case 6:
                return "Szombat";

            case 7:
                return "Vasárnap";


            default: return "no correct number";
        }

    }


public static List<Integer> getEvenNumbers(List<Integer> numbers) {
    List<Integer> countlist = new ArrayList<>();

    for (int num : numbers) {
        if ( num % 2 == 0) {
            countlist.add(num);
        }

    }
    return countlist;

}

    public static int countCharacter(String text, char targetChar) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (targetChar == text.charAt(i)){
                count++;
            }else count = count;

        }
        return count;


    }





}
