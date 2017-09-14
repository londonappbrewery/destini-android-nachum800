package com.londonappbrewery.destini;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nachum on 9/13/2017.
 */

public class story {
   private int question;
   private int top;
   private int bottom;

    public  story(int q, int tb, int bb){
        question=q;
        top=tb;
        bottom=bb;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
}
