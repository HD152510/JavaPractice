package org.dimigo.basic;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by seungsunoh on 2017. 3. 16..
 */
public class Loop {
    public static void main(String[] args){
        int att=100;
        Scanner scanner=new Scanner(System.in);
        int input;
        do{
            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 공격력 증가");
            System.out.println("2. 공격력 감소");
            System.out.println("3. 캐릭터 설정");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.print("메뉴 입력 => ");
            input=scanner.nextInt();
            String[] job={"마법사", "영주", "기사", "농민"};
            switch(input){
                case 1:
                    att+=10;
                    System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", att);
                    break;
                case 2:
                    att-=10;
                    System.out.printf("공격력이 감소되었습니다 현재 공격력 : %d\n", att);
                    break;
                case 3:
                    System.out.printf("%s(으)로 설정되었습니다.\n", job[new Random().nextInt(4)]);
                    break;
                case 9:
                    System.out.println("이제 공부하세요!");
                    break;
                default:
                    System.out.println("없는 메뉴입니다!");
                    break;
            }
        }while(input!=9);
    }
}