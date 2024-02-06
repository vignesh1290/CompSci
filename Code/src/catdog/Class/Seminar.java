package Class;

import java.util.ArrayList;

public class Seminar extends Event{
   int priority;
   public Seminar(String name, int time, int size){
    this.priority=3;
   }
   public void request(Classroom e){
     if (e.taken==true && e.prioritylevel<priority){
        e.ClassholderEvent=name;
        e.prioritylevel=priority;
        e.taken=true;
     }else{
        System.out.println(e.ClassholderEvent+ "holds this room");

     }
     
   
     
   }

}

