package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    static List<Integer> answer = new ArrayList<>();

    public static List<Integer> solution(int money) {
        int temp;
        while(true){
            if(money <= 0)
                break;
            if(money / 50000 != 0){
                answer.add(money/50000);
                money %= 50000;
            }
            else
                answer.add(0);
            if(money / 10000 != 0){
                answer.add(money/10000);
                money %= 10000;
            }
            else
                answer.add(0);
            if(money / 5000 != 0){
                answer.add(money/5000);
                money %= 5000;
            }
            else
                answer.add(0);
            if(money / 1000 != 0){
                answer.add(money/1000);
                money %= 1000;
            }
            else
                answer.add(0);
            if(money / 500 != 0){
                answer.add(money/500);
                money %= 500;
            }
            else
                answer.add(0);
            if(money / 100 != 0){
                answer.add(money/100);
                money %= 100;
            }
            else
                answer.add(0);
            if(money / 50 != 0){
                answer.add(money/50);
                money %= 50;
            }
            else
                answer.add(0);
            if(money / 10 != 0){
                answer.add(money/10);
                money %= 10;
            }
            else
                answer.add(0);
            if(money / 1 != 0){
                answer.add(money/1);
                break;
            }
            else
                answer.add(0);
        }
        return answer;
    }
    public static void main(String[] args) {
        int money = 50237; // 15000
        answer = solution(money);
        System.out.print(answer);
    }
}