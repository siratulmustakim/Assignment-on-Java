//Question 20
//A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse,
// what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate
// the price]

public class Problem20 {
    public static void main(String[] args) {
        String message = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop" +
                " and 1 piece mouse, what will be my total cost after giving 15% discount?";

        String laptop = "laptop price";
        String mouse = "mouse price";
        String discountSign = "%";

        int laptopPrice = 0;
        int mousePrice = 0;
        int discountAmount = 0;

        String[] price = message.split("tk");

        for (String s : price) {
            if (s.contains(laptop)) {
                String[] laptopInfo = s.split(" ");
                laptopPrice = Integer.parseInt(laptopInfo[laptopInfo.length - 1]);
                System.out.println("Laptop price is: "+laptopPrice);
            }
            else if (s.contains(mouse)) {
                String[] mouseInfo = s.split(" ");
                mousePrice = Integer.parseInt(mouseInfo[mouseInfo.length - 1]);
                System.out.println("Mouse price is: "+mousePrice);
            }
            else if (s.contains(discountSign)) {
                String discountInfo[] = s.split("\\%")[0].split(" ");
                discountAmount = Integer.parseInt(discountInfo[discountInfo.length - 1]);  // getting discount
                //System.out.println("Total discount is: "+discountAmount);
            }
            //System.out.println(s);
        }
        double finalPrice = calculatePrice(laptopPrice, mousePrice, discountAmount);
        System.out.println("\nYour total cost is: "+finalPrice);

    }


    public static double calculatePrice(int laptopPrice, int mousePrice, int discountAmount){
        int price = laptopPrice + mousePrice;
        double totalDiscount = ((double) discountAmount/100)*price;
        System.out.println("Total discount is: "+totalDiscount);
        double finalPrice = (double)price - totalDiscount;

        return finalPrice;
    }

}


