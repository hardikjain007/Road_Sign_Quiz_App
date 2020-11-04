package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class intermediate extends AppCompatActivity {
    ArrayList<ArrayList> qlist=new ArrayList<ArrayList>();
    int qno=0;
    CardView ans1;
    CardView ans2;
    CardView ans3;
    CardView ans4;

    TextView question;
    ImageView qimg;

    TextView textans1;
    TextView textans2;
    TextView textans3;
    TextView textans4;

    void addque(String q,int qimgid,String a1,String a2,String a3,String a4,String actualans){
        ArrayList<String> qu=new ArrayList<>();
        qu.add(q);
        qu.add(String.valueOf(qimgid));
        qu.add(a1);
        qu.add(a2);
        qu.add(a3);
        qu.add(a4);
        qu.add(actualans);
        qlist.add(qu);
    }
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        ans1= findViewById(R.id.bans1);
        ans2= findViewById(R.id.bans2);
        ans3= findViewById(R.id.bans3);
        ans4= findViewById(R.id.bans4);

        qimg=findViewById(R.id.bQimg);
        question=findViewById(R.id.bquestion);

        textans1=findViewById(R.id.btans1);
        textans2=findViewById(R.id.btan2);
        textans3=findViewById(R.id.btans3);
        textans4=findViewById(R.id.btans4);

        addque("What does this sign mean?",R.drawable.righturn,"Go","Left Turn","Stop","Right Turn","Right Turn");
        addque("What does this sign mean?",R.drawable.nouturn,"U-turn is Prohibited","No left side turn","Left lane ends","No merging left","U-turn is Prohibited");
        addque("What does this sign mean?",R.drawable.stop,"Stop","Stop for pedestrian","Slow down","Stop for signal","Stop");
        addque("What does this sign mean?",R.drawable.noparking,"No Partying","No Parking allowed","No Passing allowed","Parking allowed","No Parking allowed");
        addque("What does this sign mean?",R.drawable.pcross,"School Crossing ahead","School Zone ahead","Pedestrian crossing","Walking","Pedestrian crossing");
        ArrayList<String> a = qlist.get(0);
        System.out.println("queeeeeeeeeeeeeeeee"+a);
        question.setText(a.get(0));
        qimg.setImageResource(Integer.parseInt(a.get(1)));
        textans1.setText(a.get(2));
        textans2.setText(a.get(3));
        textans3.setText(a.get(4));
        textans4.setText(a.get(5));
        //qno+=1;
    }

    public int ans_finder(){
        int ans_index = 0;
        ArrayList<String> a=qlist.get(qno);
        if(a.get(2).equals(a.get(6))){
            ans_index = 1;
        }
        if(a.get(3).equals(a.get(6))){
            ans_index = 2;
        }
        if(a.get(4).equals(a.get(6))){
            ans_index = 3;
        }
        if(a.get(5).equals(a.get(6))){
            ans_index = 4;
        }
        return ans_index;
    }

    boolean ispressed=false;
    public void anbtn1(View view)  {
        //ArrayList<String> a=qlist.get(qno);
        //System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa"+a.get(6));
        int a = ans_finder();
        if(ispressed==false){
            if(a == 1){
                score+=2;
                ans1.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }
            else {
                if(a == 2){
                    ans2.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 3){
                    ans3.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 4){
                    ans4.setCardBackgroundColor(Color.GREEN);
                }
                ans1.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }

        }else {
            Toast.makeText(this, "Already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;

    }
    public void anbtn2(View view){
        if(ispressed==false){
            int a = ans_finder();
            if(a == 2){
                score+=2;
                ans2.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }
            else {
                if(a == 1){
                    ans1.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 3){
                    ans3.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 4){
                    ans4.setCardBackgroundColor(Color.GREEN);
                }
                ans2.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }


        }else {
            Toast.makeText(this, "already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;


    }
    public void anbtn3(View view){
        if(ispressed==false){

            int a = ans_finder();
            if(a == 3){
                score+=2;
                ans3.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }
            else {
                if(a == 1){
                    ans1.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 2){
                    ans2.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 4){
                    ans4.setCardBackgroundColor(Color.GREEN);
                }
                ans3.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }


        }else {
            Toast.makeText(this, "already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;

    }
    public void anbtn4(View view){
        if(ispressed==false){

            int a = ans_finder();
            if(a == 4){
                score+=2;
                ans4.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }
            else {
                if(a == 1){
                    ans1.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 3){
                    ans3.setCardBackgroundColor(Color.GREEN);
                }
                else if(a == 2){
                    ans2.setCardBackgroundColor(Color.GREEN);
                }
                ans4.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }




        }else {
            Toast.makeText(this, "already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;

    }
    int optionselected=0;
    public void bsubmit(View view){

        if(qno == qlist.size()-1){
            Intent i=new Intent(intermediate.this,scorebord.class);
            i.putExtra("score",score);
            startActivity(i);
        }

        if(ispressed==true){
            ArrayList<String> a=qlist.get(qno+1);
            question.setText(a.get(0));
            qimg.setImageResource(Integer.parseInt(a.get(1)));
            textans1.setText(a.get(2));
            textans2.setText(a.get(3));
            textans3.setText(a.get(4));
            textans4.setText(a.get(5));

            ans1.setCardBackgroundColor(Color.parseColor("#FFEB3B"));
            ans2.setCardBackgroundColor(Color.parseColor("#FFEB3B"));
            ans3.setCardBackgroundColor(Color.parseColor("#FFEB3B"));
            ans4.setCardBackgroundColor(Color.parseColor("#FFEB3B"));

            qno+=1;
            ispressed=false;
        }else {
            Toast.makeText(this, "Select option first", Toast.LENGTH_SHORT).show();
        }

        System.out.println("Qno"+qno);
    }
}


/*package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class intermediate extends AppCompatActivity {
    ArrayList<ArrayList> qlist=new ArrayList<ArrayList>();
    int qno=0;
    CardView ans1;
    CardView ans2;
    CardView ans3;
    CardView ans4;

    TextView question;
    ImageView qimg;

    TextView textans1;
    TextView textans2;
    TextView textans3;
    TextView textans4;

    void addque(String q,int qimgid,String a1,String a2,String a3,String a4,String actualans){
        ArrayList<String> qu=new ArrayList<>();
        qu.add(q);
        qu.add(String.valueOf(qimgid));
        qu.add(a1);
        qu.add(a2);
        qu.add(a3);
        qu.add(a4);
        qu.add(actualans);
        qlist.add(qu);
    }
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);
        ans1= findViewById(R.id.bans1);
        ans2= findViewById(R.id.bans2);
        ans3= findViewById(R.id.bans3);
        ans4= findViewById(R.id.bans4);

        qimg=findViewById(R.id.bQimg);
        question=findViewById(R.id.bquestion);

        textans1=findViewById(R.id.btans1);
        textans2=findViewById(R.id.btan2);
        textans3=findViewById(R.id.btans3);
        textans4=findViewById(R.id.btans4);

        addque("what is thius intermidia",R.drawable.grn,"op1","op2","op3","op4","op1");
        addque("what is thius 2",R.drawable.r,"op1","op2","op3","op4","op4");
        addque("what is thius 2",R.drawable.r,"op1","op2","op3","op4","op4");
        addque("what is thius 2",R.drawable.r,"op1","op2","op3","op4","op4");
        addque("what is thius 2",R.drawable.r,"op1","op2","op3","op4","op4");
        ArrayList<String> a=qlist.get(0);
        question.setText(a.get(0));

        qimg.setImageResource(Integer.parseInt(a.get(1)));

        textans1.setText(a.get(2));
        textans2.setText(a.get(3));
        textans3.setText(a.get(4));
        textans4.setText(a.get(5));

        //qno+=1;

    }




    boolean ispressed=false;
    public void anbtn1(View view)  {
        ArrayList<String> a=qlist.get(qno);
        if(ispressed==false){
            if(a.get(2).equals(a.get(6))){
                //truearea
                score+=2;
                ans1.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }else {
                ans1.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }




        }else {
            Toast.makeText(this, "already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;

    }
    public void anbtn2(View view){
        ArrayList<String> a=qlist.get(qno);
        if(ispressed==false){
            if(a.get(3).equals(a.get(6))){
                //truearea
                score+=2;
                ans2.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }else {
                ans2.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }




        }else {
            Toast.makeText(this, "already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;


    }
    public void anbtn3(View view){
        ArrayList<String> a=qlist.get(qno);
        if(ispressed==false){
            if(a.get(4).equals(a.get(6))){
                //truearea
                score+=2;
                ans3.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }else {
                ans3.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }




        }else {
            Toast.makeText(this, "already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;

    }
    public void anbtn4(View view){
        ArrayList<String> a=qlist.get(qno);
        if(ispressed==false){
            if(a.get(5).equals(a.get(6))){
                //truearea
                score+=2;
                ans4.setCardBackgroundColor(Color.GREEN);
                Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
            }else {
                ans4.setCardBackgroundColor(Color.RED);
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }




        }else {
            Toast.makeText(this, "already option selected", Toast.LENGTH_SHORT).show();
        }
        ispressed=true;

    }
    int optionselected=0;
    public void bsubmit(View view){
        if(qno==qlist.size()-1){
            Intent i=new Intent(intermediate.this,scorebord.class);
            i.putExtra("score",score);
            startActivity(i);
        }

        if(ispressed==true){
            ArrayList<String> a=qlist.get(qno);
            question.setText(a.get(0));

            qimg.setImageResource(Integer.parseInt(a.get(1)));

            textans1.setText(a.get(2));
            textans2.setText(a.get(3));
            textans3.setText(a.get(4));
            textans4.setText(a.get(5));

            ans1.setCardBackgroundColor(Color.parseColor("#FFEB3B"));
            ans2.setCardBackgroundColor(Color.parseColor("#FFEB3B"));
            ans3.setCardBackgroundColor(Color.parseColor("#FFEB3B"));
            ans4.setCardBackgroundColor(Color.parseColor("#FFEB3B"));

            qno+=1;
            ispressed=false;
        }else {
            Toast.makeText(this, "Select option first", Toast.LENGTH_SHORT).show();

        }


    }
}*/