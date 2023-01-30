package ini.hotel;

public class hotel {
    protected String name;
    protected int type, waktu;
  
    
    public String getName(){
        return name;

    }
        
    public void setName(String name){
        this.name = name;
    }
        
    public int getType(){
        return type;
    }
        
    public void SetType(int type){
        this.type = type;
        
    }
        
    public int getWaktu(){
        return waktu;
        
    }
    
    public void setWaktu(int waktu){
        this.waktu = waktu;
        
    }
}
