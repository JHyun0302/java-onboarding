package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static String solution(String cryptogram) {
        List<String> crypto = new ArrayList<>();
        int i;
        boolean check = false;
        String answer = "";
        for (i = 0; i < cryptogram.length(); i++) {
            crypto.add(String.valueOf(cryptogram.charAt(i)));
        }

        while (true) {
            check = false;
            for (i = 0; i < crypto.size() - 1; i++) {
                if (crypto.get(i).equals(crypto.get(i + 1))) {
                    check = true;
                }
                if(check == true){
                    helper(crypto);
                }
            }
            if(check == false){
                break;
            }
        }

        for (String s : crypto) {
            answer += s;
        }
        return answer;
    }


    public static void helper(List<String> crypto){
        int i;
        for (i =0; i< crypto.size()-1; i++){
            if(crypto.get(i).equals(crypto.get(i+1))){
                crypto.remove(i);
                crypto.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        String cryptogram = "browoanoommnaon"; //zyelleyz
        String answer;
        answer = solution(cryptogram);
        System.out.println("Solution: " +answer);
    }

}