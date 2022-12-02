/*
* a FOR rOCK, b FOR pAPER, AND c FOR sCISSORS
* x FOR LOSE, y FOR DRAW, AND z FOR WIN (for YOU)
* 65, 66, 67 
*
*
* 1 FOR rOCK, 2 FOR pAPER, AND 3 FOR sCISSORS
* 0 IF YOU LOST, 3 IF THE ROUND WAS A DRAW, AND 6 IF YOU WON
* 
* SHAPE + OUTCOME
*/

import java.io.*;
import java.util.*;

// 0, 2, 23

/*
 * CHECKWIN:
 * 0 = computer win
 * 3 = draw
 * 6 = player win
*/

public class PartTwo {
    static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;

            int sum = 0;

            HashMap<Character, Integer> outcomes = new HashMap<Character, Integer>();

            HashMap<Integer, Integer> Rock = new HashMap<Integer, Integer>();
            HashMap<Integer, Integer> Paper = new HashMap<Integer, Integer>();
            HashMap<Integer, Integer> Scissors = new HashMap<Integer, Integer>();

            // {result :: pts}

            Rock.put(0, 2);
            Rock.put(3, 1);
            Rock.put(6, 3);

            Paper.put(0, 3);
            Paper.put(3, 2);
            Paper.put(6, 1);

            Scissors.put(0, 1);
            Scissors.put(3, 3);
            Scissors.put(6, 2);

            outcomes.put('X', 0);
            outcomes.put('Y', 3);
            outcomes.put('Z', 6);

            while ((line = br.readLine()) != null) {
                int temp = 0;
                char oppChoice = line.charAt(0);
                char outcome = line.charAt(2);

                temp += outcomes.get(outcome);

                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            // System.out.println(sb.toString());
            // System.out.println("PART TWO: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("test.txt");
    }
}
