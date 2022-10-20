public class SpaceCounter {

	SpaceCounter() {
	}

	int sum(String phrase) {
		int count = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
}



