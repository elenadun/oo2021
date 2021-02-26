public class CountLettersHomework {
    public static void main(String[] args) {
		int strCount = 0;
		String str = "mulle meeldib programmeerimine"; // lause
		for (char letter = 'a'; letter <= 'z'; letter++) { // otsib kõikidest võimalikest tähtedest a kuni z
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == letter) {
					strCount++;  // liidab tähtede esinemist
				}
			}
			if (strCount > 0) {
				System.out.println("Taht " + letter + " esineb " + strCount + " korda");
				strCount = 0;
			}
		}

        System.out.println("Kokku: " + str.length() + " tahti"); // prindib välja kui palju tähti esineb sõnas

		String toUpper = str.substring(0, 1).toUpperCase() + str.substring(1);

		// prindib muudatud esimene täht
		System.out.println("Esimene taht tehtud suureks: " + toUpper);
	}
}
