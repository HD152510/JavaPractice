package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by seungsunoh on 2017. 6. 2..
 */
public class MelonChart {
    public static void main(String[] args){
        /*List<Music> list=Arrays.asList(
                new Music("I LUV IT", "PSY"),
                new Music("맞지?", "언니쓰"));
        System.out.println("--<<멜론 챠트>>--");*/
        List<Music> list=new ArrayList<>();
        list.add(new Music("I LUV IT", "PSY"));
        list.add(new Music("맞지?", "언니쓰"));
        printList(list);
        System.out.println("");

        list.add(1,new Music("SIGNAL", "트와이스"));
        System.out.println("--<<2위 곡 추가>--");
        printList(list);
        System.out.println("");

        list.set(2, new Music("팔레트", "아이유"));
        System.out.println("--<<3위 곡 변경>>--");
        printList(list);
        System.out.println("");

        list.remove(1);
        System.out.println("--<<2위 곡 삭제>>--");
        printList(list);
        System.out.println("");

        System.out.println("--<<전체 리스트 삭제>>--");
        list.clear();
    }
    public static void printList(List<Music> list){
        int i=1;
        for(Music m:list){
            System.out.println(i + ". " + m.toString());
            i++;
        }
    }
}