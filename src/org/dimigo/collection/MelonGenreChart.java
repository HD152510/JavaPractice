package org.dimigo.collection;

import java.util.*;

/**
 * Created by seungsunoh on 2017. 6. 5..
 */
public class MelonGenreChart {
    public static void main(String[] args){
        Map<String, List<Music>> map=new HashMap<>();
        System.out.println("--<<멜론 장르별 챠트>>--");
        List<Music> list1=new ArrayList<>();
        list1.add(new Music("팔레트", "아이유"));
        map.put("발라드", list1);
        List<Music> list2=new ArrayList<>();
        list2.add(new Music("I LUV IT", "PSY"));
        list2.add(new Music("맞지?", "언니쓰"));
        map.put("댄스", list2);

        printMap(map);
        System.out.println("--<<댄스 2위 곡 변경>>--");
        list2.set(1, new Music("Signal", "트와이스"));
        printMap(map);
        System.out.println("--<<댄스 1위 곡 삭제>>--");
        list2.remove(0);
        printMap(map);
        System.out.println("--<<전체 리스트 삭제>>--");
        map.clear();
        printMap(map);
    }
    public static void printMap(Map<String, List<Music>> map){
        for(Map.Entry<String, List<Music>> entry : map.entrySet()){
            System.out.println("["+entry.getKey()+"]");
            for(int i=0;i<entry.getValue().size();i++){
                System.out.println(i+1 + ". " + entry.getValue().get(i));
            }
        }
        System.out.println("");
    }
}