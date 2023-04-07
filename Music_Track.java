import java.util.HashMap;
public class Music_Track {
    String name_of_track;
    String duration_of_track;

    //HashMap keeps the track and the duration of each track as value pairs

    HashMap<String,String> Track_List = new HashMap<String,String>();

    //adding tracks to hashmap

    void set_tracks(String track,String duration_of_track){
        Track_List.put(track,duration_of_track);
    }


    //starts playing music
    void playing(){
        System.out.println("Music track is  playing.......");
    }
}
