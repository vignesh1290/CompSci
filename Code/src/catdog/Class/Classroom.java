package Class;

import java.util.ArrayList;

public class Classroom {
	 public ArrayList amenities= new ArrayList<>();
     public boolean taken=false;
     public int prioritylevel=0;
     public String ClassholderEvent;
    public Classroom(ArrayList e){
        for(int i=0; i<e.size(); i++){
            amenities.add(e.get(i));
        }
    }
    
}

