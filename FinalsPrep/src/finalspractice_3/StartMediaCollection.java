package finalspractice_3;

import java.util.Scanner;

public class StartMediaCollection {

	public static void main(String[] args) {
		
//        Has exactly NO Lists or Arrays - everything is stored in the class objects
//        Make 2 VinalAlbum objects and fill out the attributes, EXCEPT leave the ratingValue as it's default of 0.
//        Make 2 CassetteTape  objects and fill out the attributes, EXCEPT leave the ratingValue as it's default of 0.
//        Make a MyCollection object.
//
//        Add all the VinalAlbum and the CassetteTape to the MyCollection.
		
		
		int numberItems = 1; // this will depend on how many media items are added to MyCollection
		
		Scanner userinput = new Scanner(System.in);
		int tempRatingValue = 0;
		int item = 0;
		while (item < numberItems) {
			System.out.println("--------------------------------");
			
			// display MediaItem info
			System.out.println("media info using toString()".toString());
						
			System.out.println("\nEnter a rating of 1 to 5 for the above Media Item: "); 
			
			tempRatingValue = userinput.nextInt();
			while(tempRatingValue < 1 || 5 < tempRatingValue) {
				System.out.println("\nEnter a rating of 1 to 5");
				tempRatingValue = userinput.nextInt();
			}
			
			// set the rating value for the media item
			
			item += 1;
		}
		userinput.close();

		// display it all together one last time
		for(int i = 0; i < numberItems; i++) {
			// display MediaItem info
			System.out.println("media info using toString()".toString());
		}
	}
}
