package Class;

import java.util.*;

public class ClassScheduler{
	public static void main(String[] args) {

		GuestSpeakers guestspeaker= new GuestSpeakers("Joe Rogan talks about java",1200, 5);
		
		ArrayList amentiesClassroom1 = new ArrayList<>();
		amentiesClassroom1.add("printer");
		Classroom classroom1 = new Classroom(amentiesClassroom1);
		guestspeaker.request(classroom1);
		System.out.print(classroom1.ClassholderEvent);

	}
}

