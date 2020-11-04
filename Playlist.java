import java.util.ArrayList;


class Playlist {
  
  public static void main(String[] args) {

    
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    // add songs to the list
    desertIslandPlaylist.add("5150");
    desertIslandPlaylist.add("Help");
    desertIslandPlaylist.add("Only the Lonely");
    desertIslandPlaylist.add("When Im Sixty Four");
    desertIslandPlaylist.add("Power of Love");
    desertIslandPlaylist.add("Two tickets to Paradise");

    //System.out.println(desertIslandPlaylist);
    //System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Help");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

     //tempValueA = desertIslandPlaylist.indexof("5150");
     //tempValueB = desertIslandPlaylist.indexof("Power of Love");

    int indexA = desertIslandPlaylist.indexOf("5150");
    int indexB = desertIslandPlaylist.indexOf("Power of Love");

    System.out.println("The index of A is: " + indexA);
    System.out.println("The index of B is: "+indexB);

String tempA = "Unforgettable";

desertIslandPlaylist.set(indexA, "Power of Love");
desertIslandPlaylist.set(indexB, tempA);
System.out.println("The new list is: " + desertIslandPlaylist);

  }
  
}
