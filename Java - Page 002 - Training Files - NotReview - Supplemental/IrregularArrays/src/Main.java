
public class Main {

	public static void main(String[] args) {
		int test = 3;
		int test2 = 4;
		int test3 = 5;
		int table[][] = new int[test][];

		table[0] = new int[test2];
		table[1] = new int[test2];
		table[2] = new int[test3];
		
		int mainSize = table.length;
		int innerSize;
		
		int i, j;
		
		int row[];
		
		for(i = 0; i < mainSize; i++) {
			row = table[i];
			innerSize = row.length;
			for(j = 0; j < innerSize; j++) {
				row[j] = i + j * 2;
				System.out.print(row[j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
