package onboarding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Problem1 {

    public static boolean bookPageError(List<Integer> pobi, List<Integer> crong){
        if(pobi.get(0) + 1 == pobi.get(1) && crong.get(0) + 1 == crong.get(1)) {
            return true;
        }
        return false;
    }
    public static int getMaxValue(List<Integer> username){
        List<Integer> name = new ArrayList<>();
        name = username;
        int i,j;
        int temp;
        List<Integer> left =  new ArrayList<>();
        List<Integer> right =  new ArrayList<>();
        int leftSum = 0;
        int rightSum = 0;
        int leftMulti = 1;
        int rightMulti = 1;

        temp = name.get(0);
        while(temp > 0) {
            left.add(temp % 10);
            temp/= 10;
        }

        temp = name.get(1);
        while(temp > 0) {
            right.add(temp % 10);
            temp/= 10;
        }

        for(i =0; i<left.size(); i++){
            leftSum += left.get(i);
            leftMulti *= left.get(i);
        }
        for(i = 0; i<right.size(); i++){
            rightSum += right.get(i);
            rightMulti *= right.get(i);
        }

        return Math.max(Math.max(Math.max(leftSum, rightSum), leftMulti), rightMulti);
    }
    public static int calc(int pobiMaxValue, int crongMaxValue){
        int answer = -1;
        System.out.println(pobiMaxValue);
        System.out.println(crongMaxValue);

        if(pobiMaxValue > crongMaxValue)
            answer = 1;
        else if(pobiMaxValue < crongMaxValue)
            answer = 2;
        else if(pobiMaxValue == crongMaxValue)
            answer = 0;
        return answer;
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if(bookPageError(pobi, crong) == false) {
            System.out.println("ERROR: 왼쪽, 오른쪽 페이지가 다릅니다.");
            return  -1;
        }

        int pobiMaxValue = getMaxValue(pobi);
        int crongMaxValue = getMaxValue(crong);
        int calc = calc(pobiMaxValue, crongMaxValue);
        return calc;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> pobi = new ArrayList<>();
        List<Integer> crong = new ArrayList<>();

        int input = input(pobi, crong);
        if(input == -1){
            System.out.println("ERROR: 숫자를 입력하세요.");
            return;
        }

        int solution = solution(pobi, crong);
        if(solution == -1){
            return;
        }
        System.out.println("winner: " + solution); // pobi-win:1, crong-win:2, draw:0, exception:-1


    }
    public static int input(List<Integer> pobi, List<Integer> crong) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        System.out.print("page of pobi: ");
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<2;i++){
            try{
                int n = Integer.parseInt(st.nextToken());
                pobi.add(n);
            }catch (IllegalArgumentException e){
                return -1;
            }
        }

        System.out.print("page of crong: ");
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<2;i++){
            try{
                int n = Integer.parseInt(st.nextToken());
                crong.add(n);
            }catch (IllegalArgumentException e){
                return -1;
            }
        }
        br.close();
        return 0;
    }
}