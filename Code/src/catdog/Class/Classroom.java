package Class;

import java.util.ArrayList;

public class Classroom {
	 public ArrayList amenities= new ArrayList<>();
     public boolean taken=false;
     public int prioritylevel=0;
     public String ClassholderEvent;
     public String name;
    public Classroom(String name, ArrayList e){
        for(int i=0; i<e.size(); i++){
            amenities.add(e.get(i));
            this.name=name;
        }
    }
    public void amenties(){
        System.out.print(name+" amenties: ");
        for(int i=0; i<amenities.size(); i++){
            System.out.print(amenities.get(i)+" ");
        }
    }
    
}

