public class Bill3 {
    public static void main(String[] args) { 

        String one = args[0];
        String two = args[1];
        String three = args[2];
        int price = Integer.parseInt(args[3]);
        double money = ((double)price)/3;
        double newMoney = Math.ceil(money);


        System.out.println("Dear " + three + ", " + two + ", and " + one + ": pay " + newMoney + " Shekels each." );


    }
    
}
