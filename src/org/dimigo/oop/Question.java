package org.dimigo.oop;
import java.util.Scanner;

/**
 * Created by seungsunoh on 2017. 3. 31..
 */
public class Question {
    public static void main(String[] args){
        String[] question={"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3.가장 좋아하는 과목은?"};
        String[] answer={"레드벨벳", "박신혜", "응용 프로그래밍"};
        String[] input={"abc", "abc", "abc"};


        int i;
        for(i=0;i<3;i++){
            System.out.println(question[i]);
            Scanner scanner=new Scanner(System.in);
            input[i]=scanner.nextLine();
            if(answer[i].equals(input[i])){
                System.out.println("정답입니다!");
            }
            else{
                System.out.println("틀렸습니다!");
            }
        }

        System.out.println("<<결과 출력>>");
        StringBuilder sb=new StringBuilder();
        for(i=0;i<3;i++){
            sb.append(question[i]);
            sb.append(" ");
            sb.append(answer[i]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}