
public class FVCalc {
	public static void main(String[] args){

				int investment = Integer.parseInt(args[0]); 
				double rate = Double.parseDouble(args[1]);
				int years = Integer.parseInt(args[2]);
				double newRate = ((rate/100.0));
				double FVCalc = (investment * (Math.pow((newRate+1), years)));
				 
				System.out.println("After " + years + " years, a $" + investment + " saved at " + rate + "% will yield " + "$" + (int)FVCalc);
		
		
			}
		
		}
	
	
