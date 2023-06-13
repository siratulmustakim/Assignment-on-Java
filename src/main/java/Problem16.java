//Question 16
//Encrypt word: ROADTOSDET [when A=F]
//Output: WTFIYTXIJY


public class Problem16 {
    public static void main(String[] args) {
        String myStr = "ROADTOSDET";
        char[] myChar = myStr.toCharArray();

//        int num = (int) 'a';  // char to ascii val
        //char m = (char) 65; //ascii to char

        String code = "";
        for (int i = 0; i<myStr.length(); i++){
            int num = (int)myChar[i];  //
            code+= (char) (num+5);
//            System.out.print(c);
        }
        System.out.println("Encrypted code of ROADTOSDET is: "+ code);
    }
}
