
public class Main
{
    public static void main(String[] args) {

        //giving the details to the system which don't change for musical event

        Musical_basic_details basic_obj = new Musical_basic_details("Glendale",2023);

        //creating an object for one corresponding performance

        Performance performance_obj = new Performance("Eras Tour","Taylor Swift");


        Performance_live performance_live_obj = new Performance_live();

        // creating an object to music track

        Music_Track music_track_obj = new Music_Track();

        //Making the music track list...

        music_track_obj.set_tracks("Lavender Haze","4.56 secounds");
        music_track_obj.set_tracks(" All Too Well","4.76 secounds");
        music_track_obj.set_tracks(" The lakes","4.99 secounds");
        music_track_obj.set_tracks(" The Man","3.99 secounds");
        music_track_obj.set_tracks(" Love Story","4.29 secounds");



        //Backup dancers

        Dancer backup_dancer1 = new Dancer(" Stephanie");
        Dancer backup_dancer2 = new Dancer(" Jake ");


        //add backup dancers into a group
        performance_obj.add_backup_dancer(backup_dancer1);
        performance_obj.add_backup_dancer(backup_dancer2);

        //backup singers

        Singer backup_singer1 = new Singer("Jeslyn");
        Singer backup_singer2 = new Singer("Melanie");

        //add backup singers into a group

        performance_obj.add_backup_singer(backup_singer1);
        performance_obj.add_backup_singer(backup_singer2);
        performance_obj.welcome();

        //Main artist for this corresponding performance(swift)

        Main_Artist Swift  = new Main_Artist("Taylor Swift");

        //music track starts to play
        music_track_obj.playing();

        //Artist singing

        Swift.main_artist_singing();

        //recording live

        performance_live_obj.recording_live();

        //backup singers singing

        performance_obj.backup_singing();




        performance_obj.backup_dancing();


        performance_live_obj.artist_audience_interaction();






    }
}