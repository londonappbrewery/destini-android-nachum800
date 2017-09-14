package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        Button mTop_Button;
        Button mBottom_Button;
        TextView storyText;
        int storyIndex;
        int falsePressed=0;

        private story[] allStories= new story[]{
                new story(R.string.T1_Story , R.string.T1_Ans1 , R.string.T1_Ans2),
                new story(R.string.T2_Story ,
                    R.string.T2_Ans1 ,
                    R.string.T2_Ans2),
                new story(R.string.T3_Story , R.string.T3_Ans1 , R.string.T3_Ans2)
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mTop_Button=(Button)findViewById(R.id.buttonTop);
            mBottom_Button=(Button)findViewById(R.id.buttonBottom);
            storyText=(TextView)findViewById(R.id.storyTextView);
            storyIndex=1;

            storyText.setText(R.string.T1_Story);
            mTop_Button.setText(R.string.T1_Ans1);
            mBottom_Button.setText(R.string.T1_Ans2);




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTop_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyIndex = (storyIndex + 1);
                if(storyIndex==3)
                {
                    storyText.setText(R.string.T6_End);
                    mTop_Button.setVisibility(View.GONE);
                    mBottom_Button.setVisibility(View.GONE);
                }
                else {


                    storyText.setText(allStories[storyIndex].getQuestion());
                    mTop_Button.setText(allStories[storyIndex].getTop());
                    mBottom_Button.setText(allStories[storyIndex].getBottom());

                }
            }
        });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottom_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(storyIndex==2)
                {
                    storyText.setText(R.string.T5_End);
                    mTop_Button.setVisibility(View.GONE);
                    mBottom_Button.setVisibility(View.GONE);
                }
                else if(allStories[storyIndex*falsePressed]==allStories[1]){

                    storyText.setText(R.string.T4_End);
                    mTop_Button.setVisibility(View.GONE);
                    mBottom_Button.setVisibility(View.GONE);
                }

                else {

                    storyText.setText(allStories[storyIndex].getQuestion());
                    mTop_Button.setText(allStories[storyIndex].getTop());
                    mBottom_Button.setText(allStories[storyIndex].getBottom());
                    falsePressed++;
                }
            }
        });

    }
}
