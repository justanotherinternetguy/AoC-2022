/*
* a FOR rOCK, b FOR pAPER, AND c FOR sCISSORS
* x FOR rOCK, y FOR pAPER, AND z FOR sCISSORS (for YOU)
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

public class Main {
	static int checkWin(char computer, char player) {
		int intComputer = (int) computer;
		int intPlayer = (int) player - 23;
		if (intComputer == intPlayer) {
			return 3;
		}
		return 0;
	}

	static void readFile(String fileName) {
		try {
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;

			int sum = 0;
			while ( ( line=br.readLine() ) != null ) {
				System.out.println(checkWin('A', 'X'));
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		readFile("test.txt");
	}
}