package io.zipcoder;

import java.util.HashMap;

public class Problem4 {
static final int numofcharacters = 256;

    public static String palindromeCheck(String input) {
        String answer = "";
        int[] count = new int[numofcharacters];

        for (int i = 0; i < input.length(); i++){
            count[input.charAt(i)]++;
        }
        int odd = 0;
        for (int j = 0; j < numofcharacters; j++){
            if ((count[j] & 1) != 0){
                odd++;
            }
            if (odd > 1){
                 answer = "NO";
            }
            else {
                answer = "YES";
            }
        }
        return answer;
    }
}




// two letters, both occur and EVEN number of times  = PALINDROME (YES)

// two letters, one occurs EVEN number of times and the other occurs
// ODD number and is more than DOUBLE  = NOT A PALINDROME (NO)

// three letters, two are EVEN and ONE is ODD but not more than double = PALINDROME (YES)