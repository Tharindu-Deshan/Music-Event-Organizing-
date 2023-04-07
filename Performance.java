import java.util.ArrayList;

public class Performance implements IBackup {

    String  performance_name;
    String  artist_name;

    //grouping the singers and dancers

    public ArrayList<Singer> backup_singers = new ArrayList<Singer>();

    public ArrayList<Dancer> backup_dancers = new ArrayList<Dancer>();

    //constructor gets performance name and artist name for each particular performance

    Performance( String  performance_name,String  artist_name){
        this.performance_name=performance_name;
        this.artist_name=artist_name;

    }
    public void welcome(){
        System.out.println("Welcome to the Performance " + this.performance_name + " by " + this.artist_name + "!");
    }
    @Override
    public void backup_singing()
    {
        System.out.println("This is the method backup_singing in the class Performance.");
        for(Singer singer:backup_singers){
            System.out.println(singer.get_name()+" is singing..");
        }

    }

    @Override
    public void backup_dancing() {
        System.out.println("This is the method backup_dancing in the class Performance.");
        for(Dancer dancer:backup_dancers){
            System.out.println(dancer.get_name()+" is dancing..");
        }
    }
    //adding singers to array

    void add_backup_singer(Singer name){
        System.out.println("This is the method add_backup_singer in the class Performance.");
        backup_singers.add(name );
    }
    //adding dancers to array
    void add_backup_dancer(Dancer name){
        System.out.println("This is the method add_backup_dancer in the class Performance.");
        backup_dancers.add(name);
    }
}
