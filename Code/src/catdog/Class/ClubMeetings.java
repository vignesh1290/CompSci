package Class;

import java.util.ArrayList;

public class ClubMeetings extends Event{
   int priority;
   public ClubMeetings(String name, int time, int size){
    this.priority=1;
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

