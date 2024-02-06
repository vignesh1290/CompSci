package Class;

import java.util.ArrayList;

public class Event {
    public String name;
    public int time;
    public int size;
    public int priority;
    public Event(String name, int time, int size){
        this.name=name;
        this.time=time;
        this.size=size;
    }
    public Event(){
        
    }
    public void request(Classroom e){
        if (e.taken==true && e.prioritylevel<priority){
           e.ClassholderEvent=name;
           e.prioritylevel=priority;
           e.taken=true;
           System.out.println(e.ClassholderEvent+ "now holds this room");
        }
        else if (e.taken==false){
           e.ClassholderEvent=name;
           System.out.println(e.ClassholderEvent+ " now holds this room");
       }
        else{
            System.out.println(e.ClassholderEvent+ "holds this room");
        }
        
      
        
      }
 
}
