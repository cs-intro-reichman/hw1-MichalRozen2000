// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		String TimeMarker = " ";
		if (hours < 12){
			TimeMarker = "AM";
		}
		else TimeMarker = "PM"; 
	

		if (hours > 12){
			String formattedMinutes = String.format("%02d", minutes);
			System.out.println((hours-12) + ":" + formattedMinutes + " " +TimeMarker);
		}
		else {
			String formattedMinutes = String.format("%02d", minutes);
			System.out.println(hours + ":" + formattedMinutes + " " + TimeMarker);
		}
		}

	}
