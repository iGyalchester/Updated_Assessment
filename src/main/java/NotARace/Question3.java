package NotARace;

public class Question3 {
	public static void main(String[] args) {
		String[] artists = new String[3];
		artists[0] = "Jay Z";
		artists[1] = "Nas";
		artists[2] = "Kendrick";


		for (int i = 0; i < artists.length; i++) {
			System.out.println(artists[i]);
		}

		System.out.println("------------------");

		for (String artist : artists) {
			System.out.println(artist);
		}
	}
}
