public class DatabaseConnection {
     private static DatabaseConnection instance;



    private DatabaseConnection(){
        System.out.println("Database is init");

    }


    public static DatabaseConnection getInstance(){

        if(instance == null){
            instance = new DatabaseConnection();
            return instance;
        }else{
            return instance;
        }
     

    }


    public void connect(){
        System.out.println("Database is connected");

    }


    public void disconnect(){
        System.out.println("Database is disconnected");
    }
    
}
