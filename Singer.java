public class Singer  extends  Artist{
    Singer(String name){
        super(name);
    }

    void backup_singing (Performance performance)
    {
        System.out.println("Backup singers start singing");
        for(Singer singer:performance.backup_singers){
            System.out.println(singer.get_name());
        }

    }




}
