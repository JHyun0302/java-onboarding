package onboarding;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
=======
import java.util.Arrays;
>>>>>>> 57301ec (problem2,3,4,5 commit)
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
<<<<<<< HEAD
        int i,j,k;
        List<String> answer = new ArrayList<>();
        String nickname[] = new String[forms.size()];
        int check[] = new int[forms.size()];
        int num=0;
        for(i=0;i<forms.size();i++)
            nickname[i]=forms.get(i).get(1);

        for(i=0;i<forms.size()-1;i++){ //브루스 포스
            for(j=0;j<nickname[i].length()-1;j++){
                for(k=i; k<forms.size()-1; k++) {
                    if (nickname[k + 1].indexOf(nickname[i].charAt(j)) != -1 && nickname[k + 1].indexOf(nickname[i].charAt(j)) != nickname[k + 1].length() - 1) {
                        if (nickname[i].charAt(j + 1) == nickname[k+1].charAt(nickname[k + 1].indexOf(nickname[i].charAt(j)) + 1)) {
                            check[i]++;
                            check[k + 1]++;
                            break;
                        }
                    }
                }
            }
        }
        for(i=0;i<forms.size();i++){
            if(check[i]!=0){
                answer.add(forms.get(i).get(0));
            }
        }

        Collections.sort(answer,String.CASE_INSENSITIVE_ORDER); //이름 순 정렬

=======
        int i,j;
        List<String> answer = List.of("answer");
        String temp =  forms.toString();
        String[] name = new String[forms.size()];
        String[] mail = new String[forms.size()];
        temp = temp.replace(String.valueOf('['),  "");
        temp = temp.replace(String.valueOf(']'),  "");
        temp = temp.replace(String.valueOf(','),  "");
        String[] res = temp.split(" ");
        for(i =0; i< forms.size(); i++){
                mail[i] = res[i*2];
                name[i] = res[i*2+1];
        } //mail & name 배열에 각각 값 넣어줌!! 서로 비교해서 뽑아내는 과정 필요!
        /*for(i =0; i< forms.size(); i++) {
            System.out.print(mail[i]+ " ");

        }
        System.out.println();
        for(i =0; i< forms.size(); i++) {
            System.out.print(name[i]+ " ");
        }*/

        /*List<String> temp = new ArrayList<>();
        for(i =0; i< forms.size();i++){
            int idx = forms.get(i).split("@");
            temp.add(String.valueOf(forms.get(i).substring(0,idx)));
            System.out.print(temp.get(i));
        }*/
>>>>>>> 57301ec (problem2,3,4,5 commit)
        return answer;
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠"),
                List.of("jason@email.com", "제이슨"),
                List.of("woniee@email.com", "워니"),
                List.of("mj@email.com", "엠제이"),
                List.of("nowm@email.com", "이제엠")
        );
        List<String> result = new ArrayList<>();
        result = solution(forms);
        for (String value : result)
            System.out.println(value);
=======
        List<List<String>> forms = Arrays.asList(Arrays.asList("jm@email.com", "제이엠"), Arrays.asList("jason@email.com", "제이슨"), Arrays.asList("woniee@email.com", "워니"),  Arrays.asList("mj@email.com", "엠제이"), Arrays.asList("nowm@email.com", "이제엠"));
        //forms.forEach(System.out::println);
        List<String> result = new ArrayList<>();
        result = solution(forms);
        //System.out.println(forms.size());
>>>>>>> 57301ec (problem2,3,4,5 commit)
    }
}
