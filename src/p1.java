import java.io.File;
import java.util.Scanner;

public class p1 {
	int rows, cols, rooms;

	public static void main(String[] args) {
		Scanner scanner;
		File f = new File("Map3cord");
		try {
			//code that might throw a special error
			scanner = new Scanner(f);
			
			//use text methods to grab the first 3 numbers
			//from the file for your map info
			int rows = scanner.nextInt();
			int cols = scanner.nextInt();
			int rooms = scanner.nextInt();
			System.out.println(rows + ", " + cols + ", " + rooms);
			
			//take in the cols and # of rooms
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
				String num = line.charAt(rows)+"";
				//use charAt to grab the element of the map for a given row
				System.out.println(num);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	public void coordinateBased(Scanner scan) {
		rows = scan.nextInt();
		cols = scan.nextInt();
		rooms = scan.nextInt();
		
		scan.nextLine();
		
	}

}
