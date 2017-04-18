package org.dimigo.oop;

/**
 * Created by seungsunoh on 2017. 4. 18..
 */
public class FamilyMember {
    private static int memberCnt;
    private String memberName;

    public FamilyMember(String memberName){
        this.memberName=memberName;
        memberCnt+=1;
    }

    public String getMemberName(){
        return memberName;
    }

    public static void printMemberCnt(){
        System.out.println("가족 총 인원 수 : " + memberCnt + "명");
    }
}