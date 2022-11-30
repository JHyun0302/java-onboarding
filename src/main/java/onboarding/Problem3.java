package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        answer = helper(number);
        System.out.println(answer);

        return answer;
    }
    static int helper(int number){
        int i;
        int answer = 0;
        for(i=1;i<= number;i++){
            if(i/10 == 3 || i/10 == 6 || i/10 == 9) // 30, 31,32,33 ..., 60, 61,62,63
                answer++;
            if(i%10 == 3|| i%10 == 6 || i%10 == 9) //3, 6, 9,...,33..
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(33);
    }
}