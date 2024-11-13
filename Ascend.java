public class Ascend {
  // Replace this comment with your code
		public static void main (String[] args){
	
			int limit = Integer.parseInt(args[0]);
			int a = (int)(Math.random()*limit);
			int b = (int)(Math.random()*limit);
			int c = (int)(Math.random()*limit);
	
			System.out.println(a + " " +b+  " " +c);
	
			int minimum = Math.min(Math.min(a, b), c);
			int maximum = Math.max(Math.max(a,b),c);
			//middle the whole number minus the minimum and the maximum
			int middle = (limit-(minimum+maximum));
	
			System.out.println(minimum + " " + middle + " " + maximum);
	
			}
		  }
		
		
