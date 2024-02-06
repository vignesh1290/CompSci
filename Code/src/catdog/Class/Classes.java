package Class;

import java.util.ArrayList;

public class Classes extends Event{
   int priority;
   public Classes(String name, int time, int size){
    this.priority=4;
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

