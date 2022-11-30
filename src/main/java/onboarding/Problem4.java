package onboarding;

public class Problem4 {
    static char[] origin = new char[26];
    static char[] changeCapitalAlphabet = new char[26];
    static char[] changeSmallAlphabet = new char[26];


    public static String solution(String word) {
        String answer = "";
        char[] arrayWord = word.toCharArray();
        changeAlphabet(word);
        int i, j =0;

        for(i =0; i<arrayWord.length; i++){
            if(arrayWord[i] >= 65 && arrayWord[i] <= 90){
                for(j =0; j< origin.length; j++){
                    if(origin[j] == arrayWord[i]){
                        answer += changeCapitalAlphabet[j];
                    }
                }
            } else if (arrayWord[i] >= 97 && arrayWord[i] <= 122) {
                for(j =0; j< origin.length; j++){
                    if(origin[j] + 32 == arrayWord[i]){
                        answer += changeSmallAlphabet[j];
                    }
                }
            }else {
                answer += " ";
            }
        }
        return answer;
    }
    static void changeAlphabet(String word){
        int i;
        for (i = 0; i < origin.length; i++) {
            origin[i] = (char) (65 + i);
        }
        for (i = 0; i < changeCapitalAlphabet.length; i++) {
            changeCapitalAlphabet[i] = (char) (90 - i);
        }
        for (i = 0; i < changeSmallAlphabet.length; i++) {
            changeSmallAlphabet[i] = (char) (122 - i);
        }

    }


    public static void main(String[] args) {
        String word = "I love you";
        System.out.println(word);

        System.out.println(solution(word));
    }
}

