package ini.hotel;

public class tarif extends hotel {
    
    private int tarif;
    private String kamar;;
    
    public int get_harga(){
        if(type == 1){
            tarif = 250000;
        }
        else if(type == 2){
            tarif = 500000;
        }
        else if(type == 3){
            tarif = 750000;
        } else{
            
        }
        return tarif;
    }
    
    public String get_kamar(){
        if(type == 1){
            kamar = "Deluxe";
        }
        else if(type == 2){
            kamar = "Premium";
        }
        else if(type == 3){
            kamar = "Superior";
        }else{
            
        }
        return kamar;
    }
    
    public int get_total(){
        return tarif * waktu;
    }
    
    
}
