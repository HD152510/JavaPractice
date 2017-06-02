package org.dimigo.collection;

/**
 * Created by seungsunoh on 2017. 6. 2..
 */
public class Music {
    private String title;
    private String singer;

    public Music(String title, String singer){
        this.title=title;
        this.singer=singer;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getSinger(){
        return singer;
    }

    public void setSinger(String singer){
        this.singer=singer;
    }

    public String toString(){
        return getTitle() + " (" + getSinger() + ")";
    }
}