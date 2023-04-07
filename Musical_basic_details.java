public class Musical_basic_details {
    private  String performance_venue ;
    private int performance_year ;

    //gets the basic details of the event
    Musical_basic_details(String performance_venue , int performance_year )
    {
        this.performance_venue=performance_venue ;
        this.performance_year=performance_year;

    }

    //one who want to get the year
    int get_performance_year(){
        return performance_year;

    }
    //one who want venue
    String get_performance_venue(){
        return performance_venue;
    }
}
