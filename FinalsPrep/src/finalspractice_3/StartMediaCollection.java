package finalspractice_3;

import java.util.Scanner;

import finalspractice_3.VinylAlbum.RPM;
import finalspractice_3.CassetteTape.CassetteSize;

public class StartMediaCollection {

	public static void main(String[] args) {

//        Make 2 VinalAlbum objects and fill out the attributes, EXCEPT leave the ratingValue as it's default of 0.
		VinylAlbum album_1 = new VinylAlbum("Pink Floyd", "Momentary Lapse of Reason", RPM.THIRTY_THREE);
		VinylAlbum album_2 = new VinylAlbum("Tom Lehrer", "Songs By Tom Lehrer", RPM.SEVENTY_EIGHT);
//        Make 2 CassetteTape  objects and fill out the attributes, EXCEPT leave the ratingValue as it's default of 0.
		CassetteTape album_3 = new CassetteTape("Electric Light Orchastra", "Time", CassetteSize.C90);
		CassetteTape album_4 = new CassetteTape("Manfred Man", "Angel Station", CassetteSize.C60);
//        Make a MyCollection object.
		MyCollection collection = new MyCollection();
		
		collection.getMediaCollection().add(album_1);
		collection.getMediaCollection().add(album_3);
		collection.getMediaCollection().add(album_2);
		collection.getMediaCollection().add(album_4);

//        Add all the VinalAlbum and the CassetteTape to the MyCollection.
		
		
		int numberItems = collection.getMediaCollection().size(); 

		Scanner userinput = new Scanner(System.in);
		int tempRatingValue = 0;
		int item = 0;
		while (item < numberItems) {
			System.out.println("-----------------------------------------------------");
			
			// display MediaItem info
			MediaItem tempItem = collection.getMediaCollection().get(item);
			
			System.out.println(tempItem.toString());
						
			System.out.print("\nEnter a rating of 1 to 5 for the above Media Item: "); 
			
			tempRatingValue = userinput.nextInt();
			while(tempRatingValue < 1 || 5 < tempRatingValue) {
				System.out.println("\nEnter a rating of 1 to 5");
				tempRatingValue = userinput.nextInt();
			}
			
			// set the rating value for the media item
			tempItem.setRating(tempRatingValue);
			
			item += 1;
		}
		userinput.close();
		
		// display it all together one last time
		System.out.println("-----------------------------------------------------");
		for(int i = 0; i < numberItems; i++) {
			// display MediaItem info
			System.out.println(collection.getMediaCollection().get(i).toString());
		}
		System.out.println("-----------------------------------------------------");
	}
}
