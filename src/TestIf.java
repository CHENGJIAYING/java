import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestIf {

	public static void main(String[] args) {

		int age = 35;

		if (age >= 18) {
			System.out.println("成年");
			if (age >= 30) {
				System.out.println("壯年");// ALT+up or down 若先完成條件就會停止
			} // 巢狀if
		} else {
			System.out.println("未成年");
		}

		int classroom = 200;
		switch (classroom) {
			case 204:
			System.out.println("人數大於等於30");
				break;
			case 305:
			System.out.println("人數小於30,大於等於20");
			break;
		default:
			System.out.println("其他狀況");
			break;
		}

	}

}
