package tiger.melken;

import java.util.ArrayList;
import java.util.List;

public class Kovarianz {

	public static void main(String[] args) {
		List<Kuh> tiere = new ArrayList<Kuh>();

		// alleTiereFuettern(tiere); dies ist leider nicht möglich

		for (Kuh kuh : tiere) {
			kuh.melken();
		}
	}

	private static void alleTiereFuettern(List<Tier> tiere) {
		tiere.add(new Tiger());
	}
}
