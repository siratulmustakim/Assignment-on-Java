//Question 15
// Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
//Output:
//Number of words: 4
//Number of chars without spaces: 17
//Number of vowels: 7
//Number of consonant: 10

public class Problem15 {
    public static void main(String[] args) {
        String myStr = "I live in Bangladesh";

        // word count
        String words[] = (myStr.split(" "));
        System.out.println("\nNumber of words: "+words.length);

        //character count
        int characters = myStr.length() - (words.length - 1);
        System.out.println("Number of characters: "+characters);


        // counting vowels and consonants
        myStr = myStr.toLowerCase();
        char[] c = myStr.toCharArray();
        //System.out.println(c.length);

        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0;

        for (int i = 0; i<myStr.length(); i++){

            for (int j = 0; j<vowel.length; j++){
                if(c[i]==vowel[j]){
                 //   System.out.println(c[i]);
                    vowelCount++;
                }
            }
        }
        int consonantCount = characters - vowelCount;
        System.out.println("Number of vowels: "+vowelCount+" and consonant: "+consonantCount);

    }
}
