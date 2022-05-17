import java.util.*;

public class FindLargestWord {
    public static void findTheLargestWord(String wordGiven) {
        String[] splitStr = wordGiven.split(" ");

        Map<Integer, String> map = new HashMap<>();

        for (String word : splitStr) {
            map.put(word.length(), word);
        }
    }

    public static void main(String[] args) {


    }


}



