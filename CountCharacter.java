

public class CountCharacter {
	
	public static void main (String[] args) {
		String word = "abracadabra";
		char whichOne = 'a';
		int counter = 0;
		int len = word.length();
		System.out.println("Counting " + whichOne + " from " + word);
		for(int i = 0; i < len; i++) {
			if(word.charAt(i) == whichOne) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}

