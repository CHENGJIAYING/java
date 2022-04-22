
public class Test9x9 {

	public static void main(String[] args) {
		// ixj
		// 1x1=1 1x2=2.....1x9=9
		// 2x1=1 2x2=2.....2x9=18

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				// LN會換行 \t(tab鍵)較美觀
			}
				System.out.println();
		}
	}

}
