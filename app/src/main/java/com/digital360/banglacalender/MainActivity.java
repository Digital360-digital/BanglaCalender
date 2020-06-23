package com.digital360.banglacalender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner selectMonth;
    String getMonth;
    String[] english = new String[35];
    String[] bangla = new String[35];
    String[] arabic = new String[35];
    GridView showCalender;
    String banglaMonth,arabicMonth;
    TextView banglaMonthTxt,arabicMonthTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCalender = findViewById(R.id.gridId);
        selectMonth = findViewById(R.id.selectMonth);
        banglaMonthTxt=findViewById(R.id.banglaMonthId);
        arabicMonthTxt=findViewById(R.id.arabicMonthId);
        List<String> month = new ArrayList<>();
        month.add("জানুয়ারি");
        month.add("ফেব্রুয়ারি");
        month.add("মার্চ");
        month.add("এপ্রিল");
        month.add("মে");
        month.add("জুন");
        month.add("জুলাই");
        month.add("আগস্ট");
        month.add("সেপ্টেম্বর");
        month.add("অক্টোবর");
        month.add("নভেম্বর");
        month.add("ডিসেম্বর");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, month);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectMonth.setAdapter(adapter);

        selectMonth.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //getMonth = selectMonth.getSelectedItem().toString();
                //Toast.makeText(MainActivity.this, "" + getMonth, Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        setDateJanuary();
                        break;
                    case 1:
                        setDateFebruary();
                        break;
                    case 2:
                        setDateMarch();
                        break;
                    case 3:
                        setDateApril();
                        break;
                    case 4:
                        setDateMay();
                        break;
                    case 5:
                        setDateJun();
                        break;
                    case 6:
                        setDateJuly();
                        break;
                    case 7:
                        setDateAugust();
                        break;
                    case 8:
                        setDateSeptember();
                        break;
                    case 9:
                        setDateOctober();
                        break;
                    case 10:
                        setDateNovember();
                        break;
                    case 11:
                        setDateDecember();
                        break;

                }
                banglaMonthTxt.setText(banglaMonth);
                arabicMonthTxt.setText(arabicMonth);
                CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, english, bangla, arabic);

                showCalender.setAdapter(customAdapter);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    ///// for january
    private void setDateJanuary() {
       /* for (int e=1,b=17,a=5, i=1;i<=35;i++){
            if (i<=3 || i==35){
                english[i]="";
                bangla[i]="";
                arabic[i]="";
            }
            else {
                english[i]=""+e++;
                bangla[i]=""+b;
                arabic[i]=""+a;
            }
        }*/
       banglaMonth = "পৈষ-মাঘ ১৪২৬";
       arabicMonth="জমাঃ আউঃ-জমাঃ সানি ১৪৪১";
        english[0] = " ";
        english[1] = " ";
        english[2] = " ";
        english[3] = "" + "১";
        english[4] = "" + "২";
        english[5] = "" + "৩";
        english[6] = "" + "৪";
        english[7] = "" + "৫";
        english[8] = "" + "৬";
        english[9] = "" + "৭";
        english[10] = "" + "৮";
        english[11] = "" + "৯";
        english[12] = "" + "১০";
        english[13] = "" + "১১";
        english[14] = "" + "১২";
        english[15] = "" + "১৩";
        english[16] = "" + "১৪";
        english[17] = "" + "১৫";
        english[18] = "" + "১৬";
        english[19] = "" + "১৭";
        english[20] = "" + "১৮";
        english[21] = "" + "১৯";
        english[22] = "" + "২০";
        english[23] = "" + "২১";
        english[24] = "" + "২২";
        english[25] = "" + "২৩";
        english[26] = "" + "২৪";
        english[27] = "" + "২৫";
        english[28] = "" + "২৬";
        english[29] = "" + "২৭";
        english[30] = "" + "২৮";
        english[31] = "" + "২৯";
        english[32] = "" + "৩০";
        english[33] = "" + "৩১";
        english[34] = " ";


        bangla[0] = " ";
        bangla[1] = " ";
        bangla[2] = " ";
        bangla[3] = "" + "১৭";
        bangla[4] = "" + "১৮";
        bangla[5] = "" + "১৯";
        bangla[6] = "" + "২০";
        bangla[7] = "" + "২১";
        bangla[8] = "" + "২২";
        bangla[9] = "" + "২৩";
        bangla[10] = "" + "২৪";
        bangla[11] = "" + "২৫";
        bangla[12] = "" + "২৬";
        bangla[13] = "" + "২৭";
        bangla[14] = "" + "২৮";
        bangla[15] = "" + "২৯";
        bangla[16] = "" + "৩০";
        bangla[17] = "" + "১";
        bangla[18] = "" + "২";
        bangla[19] = "" + "৩";
        bangla[20] = "" + "৪";
        bangla[21] = "" + "৫";
        bangla[22] = "" + "৬";
        bangla[23] = "" + "৭";
        bangla[24] = "" + "৮";
        bangla[25] = "" + "৯";
        bangla[26] = "" + "১০";
        bangla[27] = "" + "১১";
        bangla[28] = "" + "১২";
        bangla[29] = "" + "১৩";
        bangla[30] = "" + "১৪";
        bangla[31] = "" + "১৫";
        bangla[32] = "" + "১৬";
        bangla[33] = "" + "১৭";
        bangla[34] = "";

        arabic[0] = " ";
        arabic[1] = " ";
        arabic[2] = " ";
        arabic[3] = "" + "৫";
        arabic[4] = "" + "৬";
        arabic[5] = "" + "৭";
        arabic[6] = "" + "৮";
        arabic[7] = "" + "৯";
        arabic[8] = "" + "১০";
        arabic[9] = "" + "১১";
        arabic[10] = "" + "১২";
        arabic[11] = "" + "১৩";
        arabic[12] = "" + "১৪";
        arabic[13] = "" + "১৫";
        arabic[14] = "" + "১৬";
        arabic[15] = "" + "১৭";
        arabic[16] = "" + "১৮";
        arabic[17] = "" + "১৯";
        arabic[18] = "" + "২০";
        arabic[19] = "" + "২১";
        arabic[20] = "" + "২২";
        arabic[21] = "" + "২৩";
        arabic[22] = "" + "২৪";
        arabic[23] = "" + "২৫";
        arabic[24] = "" + "২৬";
        arabic[25] = "" + "২৭";
        arabic[26] = "" + "২৮";
        arabic[27] = "" + "২৯";
        arabic[28] = "" + "৩০";
        arabic[29] = "" + "১";
        arabic[30] = "" + "২";
        arabic[31] = "" + "৩";
        arabic[32] = "" + "৪";
        arabic[33] = "" + "৫";
        arabic[34] = " ";


    }

    ///// for february
    private void setDateFebruary() {
        banglaMonth = "মাঘ-ফাল্গুন ১৪২৬";
        arabicMonth="জমাঃ সানি-রজব ১৪৪১";

        english[0] = "";
        english[1] = "";
        english[2] = "";
        english[3] = "";
        english[4] = "";
        english[5] = "";
        english[6] = "" + "১";
        english[7] = "" + "২";
        english[8] = "" + "৩";
        english[9] = "" + "৪";
        english[10] = "" + "৫";
        english[11] = "" + "৬";
        english[12] = "" + "৭";
        english[13] = "" + "৮";
        english[14] = "" + "৯";
        english[15] = "" + "১০";
        english[16] = "" + "১১";
        english[17] = "" + "১২";
        english[18] = "" + "১৩";
        english[19] = "" + "১৪";
        english[20] = "" + "১৫";
        english[21] = "" + "১৬";
        english[22] = "" + "১৭";
        english[23] = "" + "১৮";
        english[24] = "" + "১৯";
        english[25] = "" + "২০";
        english[26] = "" + "২১";
        english[27] = "" + "২২";
        english[28] = "" + "২৩";
        english[29] = "" + "২৪";
        english[30] = "" + "২৫";
        english[31] = "" + "২৬";
        english[32] = "" + "২৭";
        english[33] = "" + "২৮";
        english[34] = "" + "২৯";


        bangla[0] = "";
        bangla[1] = "";
        bangla[2] = "";
        bangla[3] = "";
        bangla[4] = "";
        bangla[5] = "";
        bangla[6] = "" + "১৮";
        bangla[7] = "" + "১৯";
        bangla[8] = "" + "২০";
        bangla[9] = "" + "২১";
        bangla[10] = "" + "২২";
        bangla[11] = "" + "২৩";
        bangla[12] = "" + "২৫";
        bangla[13] = "" + "২৫";
        bangla[14] = "" + "২৬";
        bangla[15] = "" + "২৭";
        bangla[16] = "" + "২৮";
        bangla[17] = "" + "২৯";
        bangla[18] = "" + "৩০";
        bangla[19] = "" + "১";
        bangla[20] = "" + "২";
        bangla[21] = "" + "৩";
        bangla[22] = "" + "৪";
        bangla[23] = "" + "৫";
        bangla[24] = "" + "৬";
        bangla[25] = "" + "৭";
        bangla[26] = "" + "৮";
        bangla[27] = "" + "৯";
        bangla[28] = "" + "১০";
        bangla[29] = "" + "১১";
        bangla[30] = "" + "১২";
        bangla[31] = "" + "১৩";
        bangla[32] = "" + "১৪";
        bangla[33] = "" + "১৫";
        bangla[34] = "" + "১৬";

        arabic[0] = "";
        arabic[1] = "";
        arabic[2] = "";
        arabic[3] = "";
        arabic[4] = "";
        arabic[5] = "";
        arabic[6] = "" + "৬";
        arabic[7] = "" + "৭";
        arabic[8] = "" + "৮";
        arabic[9] = "" + "৯";
        arabic[10] = "" + "১০";
        arabic[11] = "" + "১১";
        arabic[12] = "" + "১২";
        arabic[13] = "" + "১৩";
        arabic[14] = "" + "১৪";
        arabic[15] = "" + "১৫";
        arabic[16] = "" + "১৬";
        arabic[17] = "" + "১৭";
        arabic[18] = "" + "১৮";
        arabic[19] = "" + "১৯";
        arabic[20] = "" + "২০";
        arabic[21] = "" + "২১";
        arabic[22] = "" + "২২";
        arabic[23] = "" + "২৩";
        arabic[24] = "" + "২৪";
        arabic[25] = "" + "২৫";
        arabic[26] = "" + "২৬";
        arabic[27] = "" + "২৭";
        arabic[28] = "" + "২৮";
        arabic[29] = "" + "২৯";
        arabic[30] = "" + "৩০";
        arabic[31] = "" + "১";
        arabic[32] = "" + "২";
        arabic[33] = "" + "৩";
        arabic[34] = "" + "৪";


    }

    ///// for march
    private void setDateMarch() {
        banglaMonth = "ফাল্গুন-চৈত্র ১৪২৬ বাংলা";
        arabicMonth="রজব-শাবান ১৪৪১ ‍হিজরী";
        english[0] = "" + "১";
        english[1] = "" + "২";
        english[2] = "" + "৩";
        english[3] = "" + "৪";
        english[4] = "" + "৫";
        english[5] = "" + "৬";
        english[6] = "" + "৭";
        english[7] = "" + "৮";
        english[8] = "" + "৯";
        english[9] = "" + "১০";
        english[10] = "" + "১১";
        english[11] = "" + "১২";
        english[12] = "" + "১৩";
        english[13] = "" + "১৪";
        english[14] = "" + "১৫";
        english[15] = "" + "১৬";
        english[16] = "" + "১৭";
        english[17] = "" + "১৮";
        english[18] = "" + "১৯";
        english[19] = "" + "২০";
        english[20] = "" + "২১";
        english[21] = "" + "২২";
        english[22] = "" + "২৩";
        english[23] = "" + "২৪";
        english[24] = "" + "২৫";
        english[25] = "" + "২৬";
        english[26] = "" + "২৭";
        english[27] = "" + "২৮";
        english[28] = "" + "২৯";
        english[29] = "" + "৩০";
        english[30] = "" + "৩১";
        english[31] = "";
        english[32] = "";
        english[33] = "";
        english[34] = "";


        bangla[0] = "" + "১৭";
        bangla[1] = "" + "১৮";
        bangla[2] = "" + "১৯";
        bangla[3] = "" + "২০";
        bangla[4] = "" + "২১";
        bangla[5] = "" + "২২";
        bangla[6] = "" + "২৩";
        bangla[7] = "" + "২৪";
        bangla[8] = "" + "২৫";
        bangla[9] = "" + "২৬";
        bangla[10] = "" + "২৭";
        bangla[11] = "" + "২৮";
        bangla[12] = "" + "২৯";
        bangla[13] = "" + "৩০";
        bangla[14] = "" + "১";
        bangla[15] = "" + "২";
        bangla[16] = "" + "৩";
        bangla[17] = "" + "৪";
        bangla[18] = "" + "৫";
        bangla[19] = "" + "৬";
        bangla[20] = "" + "৭";
        bangla[21] = "" + "৮";
        bangla[22] = "" + "৯";
        bangla[23] = "" + "১০";
        bangla[24] = "" + "১১";
        bangla[25] = "" + "১২";
        bangla[26] = "" + "১৩";
        bangla[27] = "" + "১৪";
        bangla[28] = "" + "১৫";
        bangla[29] = "" + "১৬";
        bangla[30] = "" + "১৭";
        bangla[31] = "" + "";
        bangla[32] = "" + "";
        bangla[33] = "" + "";
        bangla[34] = "" + "";

        arabic[0] = "" + "৫";
        arabic[1] = "" + "৬";
        arabic[2] = "" + "৭";
        arabic[3] = "" + "৮";
        arabic[4] = "" + "৯";
        arabic[5] = "" + "১০";
        arabic[6] = "" + "১১";
        arabic[7] = "" + "১২";
        arabic[8] = "" + "১৩";
        arabic[9] = "" + "১৪";
        arabic[10] = "" + "১৫";
        arabic[11] = "" + "১৬";
        arabic[12] = "" + "১৭";
        arabic[13] = "" + "১৮";
        arabic[14] = "" + "১৯";
        arabic[15] = "" + "২০";
        arabic[16] = "" + "২১";
        arabic[17] = "" + "২২";
        arabic[18] = "" + "২৩";
        arabic[19] = "" + "২৪";
        arabic[20] = "" + "২৫";
        arabic[21] = "" + "২৬";
        arabic[22] = "" + "২৭";
        arabic[23] = "" + "২৮";
        arabic[24] = "" + "২৯";
        arabic[25] = "" + "১";
        arabic[26] = "" + "২";
        arabic[27] = "" + "৩";
        arabic[28] = "" + "৪";
        arabic[29] = "" + "৫";
        arabic[30] = "" + "৬";
        arabic[31] = "" + "";
        arabic[32] = "" + "";
        arabic[33] = "" + "";
        arabic[34] = "" + "";


    }

    ///// for April
    private void setDateApril() {
        banglaMonth = "চৈত্র-১৪২৬ বৈশাখ-১৪২৭ বাংলা";
        arabicMonth="শাবান-রমজান ১৪৪১ ‍হিজরী";
        english[0] = "" + "";
        english[1] = "" + "";
        english[2] = "" + "";
        english[3] = "" + "১";
        english[4] = "" + "২";
        english[5] = "" + "৩";
        english[6] = "" + "৪";
        english[7] = "" + "৫";
        english[8] = "" + "৬";
        english[9] = "" + "৭";
        english[10] = "" + "৮";
        english[11] = "" + "৯";
        english[12] = "" + "১০";
        english[13] = "" + "১১";
        english[14] = "" + "১২";
        english[15] = "" + "১৩";
        english[16] = "" + "১৪";
        english[17] = "" + "১৫";
        english[18] = "" + "১৬";
        english[19] = "" + "১৭";
        english[20] = "" + "১৮";
        english[21] = "" + "১৯";
        english[22] = "" + "২০";
        english[23] = "" + "২১";
        english[24] = "" + "২২";
        english[25] = "" + "২৩";
        english[26] = "" + "২৪";
        english[27] = "" + "২৫";
        english[28] = "" + "২৬";
        english[29] = "" + "২৭";
        english[30] = "" + "২৮";
        english[31] = "" + "২৯";
        english[32] = "" + "৩০";
        english[33] = "";
        english[34] = "";


        bangla[0] = "" + "";
        bangla[1] = "" + "";
        bangla[2] = "" + "";
        bangla[3] = "" + "১৮";
        bangla[4] = "" + "১৯";
        bangla[5] = "" + "২০";
        bangla[6] = "" + "২১";
        bangla[7] = "" + "২২";
        bangla[8] = "" + "২৩";
        bangla[9] = "" + "২৪";
        bangla[10] = "" + "২৫";
        bangla[11] = "" + "২৬";
        bangla[12] = "" + "২৭";
        bangla[13] = "" + "২৮";
        bangla[14] = "" + "২৯";
        bangla[15] = "" + "৩০";
        bangla[16] = "" + "১";
        bangla[17] = "" + "২";
        bangla[18] = "" + "৩";
        bangla[19] = "" + "৪";
        bangla[20] = "" + "৫";
        bangla[21] = "" + "৬";
        bangla[22] = "" + "৭";
        bangla[23] = "" + "৮";
        bangla[24] = "" + "৯";
        bangla[25] = "" + "১০";
        bangla[26] = "" + "১১";
        bangla[27] = "" + "১২";
        bangla[28] = "" + "১৩";
        bangla[29] = "" + "১৪";
        bangla[30] = "" + "১৫";
        bangla[31] = "" + "১৬";
        bangla[32] = "" + "১৭";
        bangla[33] = "" + "";
        bangla[34] = "" + "";

        arabic[0] = "" + "";
        arabic[1] = "" + "";
        arabic[2] = "" + "";
        arabic[3] = "" + "৭";
        arabic[4] = "" + "৮";
        arabic[5] = "" + "৯";
        arabic[6] = "" + "১০";
        arabic[7] = "" + "১১";
        arabic[8] = "" + "১২";
        arabic[9] = "" + "১৩";
        arabic[10] = "" + "১৪";
        arabic[11] = "" + "১৫";
        arabic[12] = "" + "১৬";
        arabic[13] = "" + "১৭";
        arabic[14] = "" + "১৮";
        arabic[15] = "" + "১৯";
        arabic[16] = "" + "২০";
        arabic[17] = "" + "২১";
        arabic[18] = "" + "২২";
        arabic[19] = "" + "২৩";
        arabic[20] = "" + "২৪";
        arabic[21] = "" + "২৫";
        arabic[22] = "" + "২৬";
        arabic[23] = "" + "২৭";
        arabic[24] = "" + "২৮";
        arabic[25] = "" + "২৯";
        arabic[26] = "" + "৩০";
        arabic[27] = "" + "১";
        arabic[28] = "" + "২";
        arabic[29] = "" + "৩";
        arabic[30] = "" + "৪";
        arabic[31] = "" + "৫";
        arabic[32] = "" + "৬";
        arabic[33] = "" + "";
        arabic[34] = "" + "";


    }

    ///// for May
    private void setDateMay() {
        banglaMonth = "বৈশাখ-জ্যৈষ্ঠ ১৪২৭ বাংলা";
        arabicMonth="রমজান-শাওয়াল ১৪৪১ ‍হিজরী";
        english[0] = "" + "৩১";
        english[1] = "" + "";
        english[2] = "" + "";
        english[3] = "" + "";
        english[4] = "" + "";
        english[5] = "" + "১";
        english[6] = "" + "২";
        english[7] = "" + "৩";
        english[8] = "" + "৪";
        english[9] = "" + "৫";
        english[10] = "" + "৬";
        english[11] = "" + "৭";
        english[12] = "" + "৮";
        english[13] = "" + "৯";
        english[14] = "" + "১০";
        english[15] = "" + "১১";
        english[16] = "" + "১২";
        english[17] = "" + "১৩";
        english[18] = "" + "১৪";
        english[19] = "" + "১৫";
        english[20] = "" + "১৬";
        english[21] = "" + "১৭";
        english[22] = "" + "১৮";
        english[23] = "" + "১৯";
        english[24] = "" + "২০";
        english[25] = "" + "২১";
        english[26] = "" + "২২";
        english[27] = "" + "২৩";
        english[28] = "" + "২৪";
        english[29] = "" + "২৫";
        english[30] = "" + "২৬";
        english[31] = "" + "২৭";
        english[32] = "" + "২৮";
        english[33] = "" + "২৯";
        english[34] = "" + "৩০";


        bangla[0] = "" + "১৭";
        bangla[1] = "" + "";
        bangla[2] = "" + "";
        bangla[3] = "" + "";
        bangla[4] = "" + "";
        bangla[5] = "" + "১৮";
        bangla[6] = "" + "১৯";
        bangla[7] = "" + "২০";
        bangla[8] = "" + "২১";
        bangla[9] = "" + "২২";
        bangla[10] = "" + "২৩";
        bangla[11] = "" + "২৪";
        bangla[12] = "" + "২৫";
        bangla[13] = "" + "২৬";
        bangla[14] = "" + "২৭";
        bangla[15] = "" + "২৮";
        bangla[16] = "" + "২৯";
        bangla[17] = "" + "৩০";
        bangla[18] = "" + "৩১";
        bangla[19] = "" + "১";
        bangla[20] = "" + "২";
        bangla[21] = "" + "৩";
        bangla[22] = "" + "৪";
        bangla[23] = "" + "৫";
        bangla[24] = "" + "৬";
        bangla[25] = "" + "৭";
        bangla[26] = "" + "৮";
        bangla[27] = "" + "৯";
        bangla[28] = "" + "১০";
        bangla[29] = "" + "১১";
        bangla[30] = "" + "১২";
        bangla[31] = "" + "১৩";
        bangla[32] = "" + "১৪";
        bangla[33] = "" + "১৫";
        bangla[34] = "" + "১৬";

        arabic[0] = "" + "৭";
        arabic[1] = "" + "";
        arabic[2] = "" + "";
        arabic[3] = "" + "";
        arabic[4] = "" + "";
        arabic[5] = "" + "৭";
        arabic[6] = "" + "৮";
        arabic[7] = "" + "৯";
        arabic[8] = "" + "১০";
        arabic[9] = "" + "১১";
        arabic[10] = "" + "১২";
        arabic[11] = "" + "১৩";
        arabic[12] = "" + "১৪";
        arabic[13] = "" + "১৫";
        arabic[14] = "" + "১৬";
        arabic[15] = "" + "১৭";
        arabic[16] = "" + "১৮";
        arabic[17] = "" + "১৯";
        arabic[18] = "" + "২০";
        arabic[19] = "" + "২১";
        arabic[20] = "" + "২২";
        arabic[21] = "" + "২৩";
        arabic[22] = "" + "২৪";
        arabic[23] = "" + "২৫";
        arabic[24] = "" + "২৬";
        arabic[25] = "" + "২৭";
        arabic[26] = "" + "২৮";
        arabic[27] = "" + "২৯";
        arabic[28] = "" + "৩০";
        arabic[29] = "" + "১";
        arabic[30] = "" + "২";
        arabic[31] = "" + "৩";
        arabic[32] = "" + "৪";
        arabic[33] = "" + "৫";
        arabic[34] = "" + "৬";

/// jun
    }

    private void setDateJun() {
        banglaMonth = "জ্যৈষ্ঠ-আষাঢ় ১৪২৭ বাংলা";
        arabicMonth="শাওয়াল-জিলক্বদ ১৪৪১ ‍হিজরী";
        english[0] = "" + "";
        english[1] = "" + "১";
        english[2] = "" + "২";
        english[3] = "" + "৩";
        english[4] = "" + "৪";
        english[5] = "" + "৪";
        english[6] = "" + "৫";
        english[7] = "" + "৭";
        english[8] = "" + "৮";
        english[9] = "" + "৯";
        english[10] = "" + "১০";
        english[11] = "" + "১১";
        english[12] = "" + "১২";
        english[13] = "" + "১৩";
        english[14] = "" + "১৪";
        english[15] = "" + "১৫";
        english[16] = "" + "১৬";
        english[17] = "" + "১৭";
        english[18] = "" + "১৮";
        english[19] = "" + "১৯";
        english[20] = "" + "২০";
        english[21] = "" + "২১";
        english[22] = "" + "২২";
        english[23] = "" + "২৩";
        english[24] = "" + "২৪";
        english[25] = "" + "২৫";
        english[26] = "" + "২৬";
        english[27] = "" + "২৭";
        english[28] = "" + "২৮";
        english[29] = "" + "২৯";
        english[30] = "" + "৩০";
        english[31] = "" + "";
        english[32] = "" + "";
        english[33] = "" + "";
        english[34] = "" + "";


        bangla[0] = "" + "";
        bangla[1] = "" + "১৮";
        bangla[2] = "" + "১৯";
        bangla[3] = "" + "২০";
        bangla[4] = "" + "২১";
        bangla[5] = "" + "২২";
        bangla[6] = "" + "২৩";
        bangla[7] = "" + "২৪";
        bangla[8] = "" + "২৫";
        bangla[9] = "" + "২৬";
        bangla[10] = "" + "২৭";
        bangla[11] = "" + "২৮";
        bangla[12] = "" + "২৯";
        bangla[13] = "" + "৩০";
        bangla[14] = "" + "৩১";
        bangla[15] = "" + "১";
        bangla[16] = "" + "২";
        bangla[17] = "" + "৩";
        bangla[18] = "" + "৪";
        bangla[19] = "" + "৫";
        bangla[20] = "" + "৬";
        bangla[21] = "" + "৭";
        bangla[22] = "" + "৮";
        bangla[23] = "" + "৯";
        bangla[24] = "" + "১০";
        bangla[25] = "" + "১১";
        bangla[26] = "" + "১২";
        bangla[27] = "" + "১৩";
        bangla[28] = "" + "১৪";
        bangla[29] = "" + "১৫";
        bangla[30] = "" + "১৬";
        bangla[31] = "" + "";
        bangla[32] = "" + "";
        bangla[33] = "" + "";
        bangla[34] = "" + "";

        arabic[0] = "" + "";
        arabic[1] = "" + "৮";
        arabic[2] = "" + "৯";
        arabic[3] = "" + "১০";
        arabic[4] = "" + "১১";
        arabic[5] = "" + "১২";
        arabic[6] = "" + "১৩";
        arabic[7] = "" + "১৪";
        arabic[8] = "" + "১৫";
        arabic[9] = "" + "১৬";
        arabic[10] = "" + "১৭";
        arabic[11] = "" + "১৮";
        arabic[12] = "" + "১৯";
        arabic[13] = "" + "২০";
        arabic[14] = "" + "২১";
        arabic[15] = "" + "২২";
        arabic[16] = "" + "২৩";
        arabic[17] = "" + "২৪";
        arabic[18] = "" + "২৫";
        arabic[19] = "" + "২৬";
        arabic[20] = "" + "২৭";
        arabic[21] = "" + "২৮";
        arabic[22] = "" + "২৯";
        arabic[23] = "" + "৩০";
        arabic[24] = "" + "১";
        arabic[25] = "" + "২";
        arabic[26] = "" + "৩";
        arabic[27] = "" + "৪";
        arabic[28] = "" + "৫";
        arabic[29] = "" + "৬";
        arabic[30] = "" + "৭";
        arabic[31] = "" + "";
        arabic[32] = "" + "";
        arabic[33] = "" + "";
        arabic[34] = "" + "";


    }

    /// july
    private void setDateJuly() {
        banglaMonth = "আষাঢ়-শ্রাবণ ১৪২৭ বাংলা";
        arabicMonth="জিলক্বদ-জিলহজ্ব ১৪৪১ ‍হিজরী";
        english[0] = "" + "";
        english[1] = "" + "";
        english[2] = "" + "";
        english[3] = "" + "১";
        english[4] = "" + "২";
        english[5] = "" + "৩";
        english[6] = "" + "৪";
        english[7] = "" + "৫";
        english[8] = "" + "৬";
        english[9] = "" + "৭";
        english[10] = "" + "৮";
        english[11] = "" + "৯";
        english[12] = "" + "১০";
        english[13] = "" + "১১";
        english[14] = "" + "১২";
        english[15] = "" + "১৩";
        english[16] = "" + "১৪";
        english[17] = "" + "১৫";
        english[18] = "" + "১৬";
        english[19] = "" + "১৭";
        english[20] = "" + "১৮";
        english[21] = "" + "১৯";
        english[22] = "" + "২০";
        english[23] = "" + "২১";
        english[24] = "" + "২২";
        english[25] = "" + "২৩";
        english[26] = "" + "২৪";
        english[27] = "" + "২৫";
        english[28] = "" + "২৬";
        english[29] = "" + "২৭";
        english[30] = "" + "২৮";
        english[31] = "" + "২৯";
        english[32] = "" + "৩০";
        english[33] = "" + "৩১";
        english[34] = "" + "";


        bangla[0] = "" + "";
        bangla[1] = "" + "";
        bangla[2] = "" + "";
        bangla[3] = "" + "১৭";
        bangla[4] = "" + "১৮";
        bangla[5] = "" + "১৯";
        bangla[6] = "" + "২০";
        bangla[7] = "" + "২১";
        bangla[8] = "" + "২২";
        bangla[9] = "" + "২৩";
        bangla[10] = "" + "২৪";
        bangla[11] = "" + "২৫";
        bangla[12] = "" + "২৬";
        bangla[13] = "" + "২৭";
        bangla[14] = "" + "২৮";
        bangla[15] = "" + "২৯";
        bangla[16] = "" + "৩০";
        bangla[17] = "" + "৩১";
        bangla[18] = "" + "১";
        bangla[19] = "" + "২";
        bangla[20] = "" + "৩";
        bangla[21] = "" + "৪";
        bangla[22] = "" + "৫";
        bangla[23] = "" + "৬";
        bangla[24] = "" + "৭";
        bangla[25] = "" + "৮";
        bangla[26] = "" + "৯";
        bangla[27] = "" + "১০";
        bangla[28] = "" + "১১";
        bangla[29] = "" + "১২";
        bangla[30] = "" + "১৩";
        bangla[31] = "" + "১৪";
        bangla[32] = "" + "১৫";
        bangla[33] = "" + "১৬";
        bangla[34] = "" + "";

        arabic[0] = "" + "";
        arabic[1] = "" + "";
        arabic[2] = "" + "";
        arabic[3] = "" + "৮";
        arabic[4] = "" + "৯";
        arabic[5] = "" + "১০";
        arabic[6] = "" + "১১";
        arabic[7] = "" + "১২";
        arabic[8] = "" + "১৩";
        arabic[9] = "" + "১৪";
        arabic[10] = "" + "১৫";
        arabic[11] = "" + "১৬";
        arabic[12] = "" + "১৭";
        arabic[13] = "" + "১৮";
        arabic[14] = "" + "১৯";
        arabic[15] = "" + "২০";
        arabic[16] = "" + "২১";
        arabic[17] = "" + "২২";
        arabic[18] = "" + "২৩";
        arabic[19] = "" + "২৪";
        arabic[20] = "" + "২৫";
        arabic[21] = "" + "২৬";
        arabic[22] = "" + "২৭";
        arabic[23] = "" + "২৮";
        arabic[24] = "" + "২৯";
        arabic[25] = "" + "১";
        arabic[26] = "" + "২";
        arabic[27] = "" + "৩";
        arabic[28] = "" + "৪";
        arabic[29] = "" + "৫";
        arabic[30] = "" + "৬";
        arabic[31] = "" + "৭";
        arabic[32] = "" + "৮";
        arabic[33] = "" + "৯";
        arabic[34] = "" + "";


    }

    /// August
    private void setDateAugust() {
        banglaMonth = "শ্রাবণ-ভাদ্র ১৪২৭ বাংলা";
        arabicMonth="জিলহজ্ব-১৪৪১ মহরম-১৪৪২ ‍হিজরী";
        english[0] = "" + "৩০";
        english[1] = "" + "৩১";
        english[2] = "" + "";
        english[3] = "" + "";
        english[4] = "" + "";
        english[5] = "" + "";
        english[6] = "" + "১";
        english[7] = "" + "২";
        english[8] = "" + "৩";
        english[9] = "" + "৪";
        english[10] = "" + "৫";
        english[11] = "" + "৬";
        english[12] = "" + "৭";
        english[13] = "" + "৮";
        english[14] = "" + "৯";
        english[15] = "" + "১০";
        english[16] = "" + "১১";
        english[17] = "" + "১২";
        english[18] = "" + "১৩";
        english[19] = "" + "১৪";
        english[20] = "" + "১৫";
        english[21] = "" + "১৬";
        english[22] = "" + "১৭";
        english[23] = "" + "১৮";
        english[24] = "" + "১৯";
        english[25] = "" + "২০";
        english[26] = "" + "২১";
        english[27] = "" + "২২";
        english[28] = "" + "২৩";
        english[29] = "" + "২৪";
        english[30] = "" + "২৫";
        english[31] = "" + "২৬";
        english[32] = "" + "২৭";
        english[33] = "" + "২৮";
        english[34] = "" + "২৯";


        bangla[0] = "" + "১৫";
        bangla[1] = "" + "১৬";
        bangla[2] = "" + "";
        bangla[3] = "" + "";
        bangla[4] = "" + "";
        bangla[5] = "" + "";
        bangla[6] = "" + "১৭";
        bangla[7] = "" + "১৮";
        bangla[8] = "" + "১৯";
        bangla[9] = "" + "২০";
        bangla[10] = "" + "২১";
        bangla[11] = "" + "২২";
        bangla[12] = "" + "২৩";
        bangla[13] = "" + "২৪";
        bangla[14] = "" + "২৫";
        bangla[15] = "" + "২৬";
        bangla[16] = "" + "২৭";
        bangla[17] = "" + "২৮";
        bangla[18] = "" + "২৯";
        bangla[19] = "" + "৩০";
        bangla[20] = "" + "৩১";
        bangla[21] = "" + "১";
        bangla[22] = "" + "২";
        bangla[23] = "" + "৩";
        bangla[24] = "" + "৪";
        bangla[25] = "" + "৫";
        bangla[26] = "" + "৬";
        bangla[27] = "" + "৭";
        bangla[28] = "" + "৮";
        bangla[29] = "" + "৯";
        bangla[30] = "" + "১০";
        bangla[31] = "" + "১১";
        bangla[32] = "" + "১২";
        bangla[33] = "" + "১৩";
        bangla[34] = "" + "১৪";

        arabic[0] = "" + "১০";
        arabic[1] = "" + "১১";
        arabic[2] = "" + "";
        arabic[3] = "" + "";
        arabic[4] = "" + "";
        arabic[5] = "" + "";
        arabic[6] = "" + "১০";
        arabic[7] = "" + "১১";
        arabic[8] = "" + "১২";
        arabic[9] = "" + "১৩";
        arabic[10] = "" + "১৪";
        arabic[11] = "" + "১৫";
        arabic[12] = "" + "১৬";
        arabic[13] = "" + "১৭";
        arabic[14] = "" + "১৮";
        arabic[15] = "" + "২৯";
        arabic[16] = "" + "২০";
        arabic[17] = "" + "২১";
        arabic[18] = "" + "২২";
        arabic[19] = "" + "২৩";
        arabic[20] = "" + "২৪";
        arabic[21] = "" + "২৫";
        arabic[22] = "" + "২৬";
        arabic[23] = "" + "২৭";
        arabic[24] = "" + "২৮";
        arabic[25] = "" + "২৯";
        arabic[26] = "" + "১";
        arabic[27] = "" + "২";
        arabic[28] = "" + "৩";
        arabic[29] = "" + "৪";
        arabic[30] = "" + "৫";
        arabic[31] = "" + "৬";
        arabic[32] = "" + "৭";
        arabic[33] = "" + "৮";
        arabic[34] = "" + "৯";


    }

    /// September
    private void setDateSeptember() {
        banglaMonth = "ভাদ্র-আশ্বিণ ১৪২৭ বাংলা";
        arabicMonth="মহরম-সফর ১৪৪২ ‍হিজরী";
        english[0] = "" + "";
        english[1] = "" + "";
        english[2] = "" + "১";
        english[3] = "" + "২";
        english[4] = "" + "৩";
        english[5] = "" + "৪";
        english[6] = "" + "৫";
        english[7] = "" + "৬";
        english[8] = "" + "৭";
        english[9] = "" + "৮";
        english[10] = "" + "৯";
        english[11] = "" + "১০";
        english[12] = "" + "১১";
        english[13] = "" + "১২";
        english[14] = "" + "১৩";
        english[15] = "" + "১৪";
        english[16] = "" + "১৫";
        english[17] = "" + "১৬";
        english[18] = "" + "১৭";
        english[19] = "" + "১৮";
        english[20] = "" + "১৯";
        english[21] = "" + "২০";
        english[22] = "" + "২১";
        english[23] = "" + "২২";
        english[24] = "" + "২৩";
        english[25] = "" + "২৪";
        english[26] = "" + "২৫";
        english[27] = "" + "২৬";
        english[28] = "" + "২৭";
        english[29] = "" + "২৮";
        english[30] = "" + "২৯";
        english[31] = "" + "৩০";
        english[32] = "" + "";
        english[33] = "" + "";
        english[34] = "" + "";


        bangla[0] = "" + "";
        bangla[1] = "" + "";
        bangla[2] = "" + "১৭";
        bangla[3] = "" + "১৮";
        bangla[4] = "" + "১৯";
        bangla[5] = "" + "২০";
        bangla[6] = "" + "২১";
        bangla[7] = "" + "২২";
        bangla[8] = "" + "২৩";
        bangla[9] = "" + "২৪";
        bangla[10] = "" + "২৫";
        bangla[11] = "" + "২৬";
        bangla[12] = "" + "২৭";
        bangla[13] = "" + "২৮";
        bangla[14] = "" + "২৯";
        bangla[15] = "" + "৩০";
        bangla[16] = "" + "৩১";
        bangla[17] = "" + "১";
        bangla[18] = "" + "২";
        bangla[19] = "" + "৩";
        bangla[20] = "" + "৪";
        bangla[21] = "" + "৫";
        bangla[22] = "" + "৬";
        bangla[23] = "" + "৭";
        bangla[24] = "" + "৮";
        bangla[25] = "" + "৯";
        bangla[26] = "" + "১০";
        bangla[27] = "" + "১১";
        bangla[28] = "" + "১২";
        bangla[29] = "" + "১৩";
        bangla[30] = "" + "১৪";
        bangla[31] = "" + "১৫";
        bangla[32] = "" + "";
        bangla[33] = "" + "";
        bangla[34] = "" + "";

        arabic[0] = "" + "";
        arabic[1] = "" + "";
        arabic[2] = "" + "১২";
        arabic[3] = "" + "১৩";
        arabic[4] = "" + "১৪";
        arabic[5] = "" + "১৫";
        arabic[6] = "" + "১৬";
        arabic[7] = "" + "১৭";
        arabic[8] = "" + "১৮";
        arabic[9] = "" + "১৯";
        arabic[10] = "" + "২০";
        arabic[11] = "" + "২১";
        arabic[12] = "" + "২২";
        arabic[13] = "" + "২৩";
        arabic[14] = "" + "২৪";
        arabic[15] = "" + "২৫";
        arabic[16] = "" + "২৬";
        arabic[17] = "" + "২৭";
        arabic[18] = "" + "২৮";
        arabic[19] = "" + "২৯";
        arabic[20] = "" + "১";
        arabic[21] = "" + "২";
        arabic[22] = "" + "৩";
        arabic[23] = "" + "৪";
        arabic[24] = "" + "৫";
        arabic[25] = "" + "৬";
        arabic[26] = "" + "৭";
        arabic[27] = "" + "৮";
        arabic[28] = "" + "৯";
        arabic[29] = "" + "১০";
        arabic[30] = "" + "১১";
        arabic[31] = "" + "১২";
        arabic[32] = "" + "";
        arabic[33] = "" + "";
        arabic[34] = "" + "";


    }


    /// October
    private void setDateOctober() {
        banglaMonth = "আশ্বিণ-কাতর্িক ১৪২৭ বাংলা";
        arabicMonth="সফর-রবিঃআউঃ ১৪৪২ ‍হিজরী";
        english[0] = "" + "";
        english[1] = "" + "";
        english[2] = "" + "";
        english[3] = "" + "";
        english[4] = "" + "১";
        english[5] = "" + "২";
        english[6] = "" + "৩";
        english[7] = "" + "৪";
        english[8] = "" + "৫";
        english[9] = "" + "৬";
        english[10] = "" + "৭";
        english[11] = "" + "৮";
        english[12] = "" + "৯";
        english[13] = "" + "১০";
        english[14] = "" + "১১";
        english[15] = "" + "১২";
        english[16] = "" + "১৩";
        english[17] = "" + "১৪";
        english[18] = "" + "১৫";
        english[19] = "" + "১৬";
        english[20] = "" + "১৭";
        english[21] = "" + "১৮";
        english[22] = "" + "১৯";
        english[23] = "" + "২০";
        english[24] = "" + "২১";
        english[25] = "" + "২২";
        english[26] = "" + "২৩";
        english[27] = "" + "২৪";
        english[28] = "" + "২৫";
        english[29] = "" + "২৬";
        english[30] = "" + "২৭";
        english[31] = "" + "২৮";
        english[32] = "" + "২৯";
        english[33] = "" + "৩০";
        english[34] = "" + "৩১";


        bangla[0] = "" + "";
        bangla[1] = "" + "";
        bangla[2] = "" + "";
        bangla[3] = "" + "";
        bangla[4] = "" + "১৬";
        bangla[5] = "" + "১৭";
        bangla[6] = "" + "১৮";
        bangla[7] = "" + "১৯";
        bangla[8] = "" + "২০";
        bangla[9] = "" + "২১";
        bangla[10] = "" + "২২";
        bangla[11] = "" + "২৩";
        bangla[12] = "" + "২৪";
        bangla[13] = "" + "২৫";
        bangla[14] = "" + "২৬";
        bangla[15] = "" + "২৭";
        bangla[16] = "" + "২৮";
        bangla[17] = "" + "২৯";
        bangla[18] = "" + "৩০";
        bangla[19] = "" + "৩১";
        bangla[20] = "" + "১";
        bangla[21] = "" + "২";
        bangla[22] = "" + "৩";
        bangla[23] = "" + "৪";
        bangla[24] = "" + "৫";
        bangla[25] = "" + "৬";
        bangla[26] = "" + "৭";
        bangla[27] = "" + "৮";
        bangla[28] = "" + "৯";
        bangla[29] = "" + "১০";
        bangla[30] = "" + "১১";
        bangla[31] = "" + "১২";
        bangla[32] = "" + "১৩";
        bangla[33] = "" + "১৪";
        bangla[34] = "" + "১৫";

        arabic[0] = "" + "";
        arabic[1] = "" + "";
        arabic[2] = "" + "";
        arabic[3] = "" + "";
        arabic[4] = "" + "১৩";
        arabic[5] = "" + "১৪";
        arabic[6] = "" + "১৫";
        arabic[7] = "" + "১৬";
        arabic[8] = "" + "১৭";
        arabic[9] = "" + "১৮";
        arabic[10] = "" + "১৯";
        arabic[11] = "" + "২০";
        arabic[12] = "" + "২১";
        arabic[13] = "" + "২২";
        arabic[14] = "" + "২৩";
        arabic[15] = "" + "২৪";
        arabic[16] = "" + "২৫";
        arabic[17] = "" + "২৬";
        arabic[18] = "" + "২৭";
        arabic[19] = "" + "২৮";
        arabic[20] = "" + "২৯";
        arabic[21] = "" + "৩০";
        arabic[22] = "" + "১";
        arabic[23] = "" + "২";
        arabic[24] = "" + "৩";
        arabic[25] = "" + "৪";
        arabic[26] = "" + "৫";
        arabic[27] = "" + "৬";
        arabic[28] = "" + "৭";
        arabic[29] = "" + "৮";
        arabic[30] = "" + "৯";
        arabic[31] = "" + "১০";
        arabic[32] = "" + "১১";
        arabic[33] = "" + "১২";
        arabic[34] = "" + "১৩";


    }


    /// november
    private void setDateNovember() {
        banglaMonth = "কাতর্িক-অগ্রহায়ন ১৪২৭ বাংলা";
        arabicMonth="রবিঃআউঃ-রবিঃসানি ১৪৪২ ‍হিজরী";

        english[0] = "" + "১";
        english[1] = "" + "২";
        english[2] = "" + "৩";
        english[3] = "" + "৪";
        english[4] = "" + "৫";
        english[5] = "" + "৬";
        english[6] = "" + "৭";
        english[7] = "" + "৮";
        english[8] = "" + "৯";
        english[9] = "" + "১০";
        english[10] = "" + "১১";
        english[11] = "" + "১২";
        english[12] = "" + "১৩";
        english[13] = "" + "১৪";
        english[14] = "" + "১৫";
        english[15] = "" + "১৬";
        english[16] = "" + "১৭";
        english[17] = "" + "১৮";
        english[18] = "" + "১৯";
        english[19] = "" + "২০";
        english[20] = "" + "২১";
        english[21] = "" + "২২";
        english[22] = "" + "২৩";
        english[23] = "" + "২৪";
        english[24] = "" + "২৫";
        english[25] = "" + "২৬";
        english[26] = "" + "২৭";
        english[27] = "" + "২৮";
        english[28] = "" + "২৯";
        english[29] = "" + "৩০";
        english[30] = "" + "";
        english[31] = "" + "";
        english[32] = "" + "";
        english[33] = "" + "";
        english[34] = "" + "";


        bangla[0] = "" + "১৬";
        bangla[1] = "" + "১৭";
        bangla[2] = "" + "১৮";
        bangla[3] = "" + "১৯";
        bangla[4] = "" + "২০";
        bangla[5] = "" + "২১";
        bangla[6] = "" + "২২";
        bangla[7] = "" + "২৩";
        bangla[8] = "" + "২৪";
        bangla[9] = "" + "২৫";
        bangla[10] = "" + "২৬";
        bangla[11] = "" + "২৭";
        bangla[12] = "" + "২৮";
        bangla[13] = "" + "২৯";
        bangla[14] = "" + "৩০";
        bangla[15] = "" + "১";
        bangla[16] = "" + "২";
        bangla[17] = "" + "৩";
        bangla[18] = "" + "৪";
        bangla[19] = "" + "৫";
        bangla[20] = "" + "৬";
        bangla[21] = "" + "৭";
        bangla[22] = "" + "৮";
        bangla[23] = "" + "৯";
        bangla[24] = "" + "১০";
        bangla[25] = "" + "১১";
        bangla[26] = "" + "১২";
        bangla[27] = "" + "১৩";
        bangla[28] = "" + "১৪";
        bangla[29] = "" + "১৫";
        bangla[30] = "" + "";
        bangla[31] = "" + "";
        bangla[32] = "" + "";
        bangla[33] = "" + "";
        bangla[34] = "" + "";

        arabic[0] = "" + "১৪";
        arabic[1] = "" + "১৫";
        arabic[2] = "" + "১৬";
        arabic[3] = "" + "১৭";
        arabic[4] = "" + "১৮";
        arabic[5] = "" + "১৯";
        arabic[6] = "" + "২০";
        arabic[7] = "" + "২১";
        arabic[8] = "" + "২২";
        arabic[9] = "" + "২৩";
        arabic[10] = "" + "২৪";
        arabic[11] = "" + "২৫";
        arabic[12] = "" + "২৬";
        arabic[13] = "" + "২৭";
        arabic[14] = "" + "২৮";
        arabic[15] = "" + "২৯";
        arabic[16] = "" + "৩০";
        arabic[17] = "" + "১";
        arabic[18] = "" + "২";
        arabic[19] = "" + "৩";
        arabic[20] = "" + "৪";
        arabic[21] = "" + "৫";
        arabic[22] = "" + "৬";
        arabic[23] = "" + "৭";
        arabic[24] = "" + "৮";
        arabic[25] = "" + "৯";
        arabic[26] = "" + "১০";
        arabic[27] = "" + "১১";
        arabic[28] = "" + "১২";
        arabic[29] = "" + "১৩";
        arabic[30] = "" + "";
        arabic[31] = "" + "";
        arabic[32] = "" + "";
        arabic[33] = "" + "";
        arabic[34] = "" + "";


    }


    /// December
    private void setDateDecember() {
        banglaMonth = "অগ্রহায়ন-পৌষ ১৪২৭ বাংলা";
        arabicMonth="রবিঃসানি-জমাঃআউঃ ১৪৪২ ‍হিজরী";

        english[0] = "" + "";
        english[1] = "" + "";
        english[2] = "" + "১";
        english[3] = "" + "২";
        english[4] = "" + "৩";
        english[5] = "" + "৪";
        english[6] = "" + "৫";
        english[7] = "" + "৬";
        english[8] = "" + "৭";
        english[9] = "" + "৮";
        english[10] = "" + "৯";
        english[11] = "" + "১০";
        english[12] = "" + "১১";
        english[13] = "" + "১২";
        english[14] = "" + "১৩";
        english[15] = "" + "১৪";
        english[16] = "" + "১৫";
        english[17] = "" + "১৬";
        english[18] = "" + "১৭";
        english[19] = "" + "১৮";
        english[20] = "" + "১৯";
        english[21] = "" + "২০";
        english[22] = "" + "২১";
        english[23] = "" + "২২";
        english[24] = "" + "২৩";
        english[25] = "" + "২৪";
        english[26] = "" + "২৫";
        english[27] = "" + "২৬";
        english[28] = "" + "২৭";
        english[29] = "" + "২৮";
        english[30] = "" + "২৯";
        english[31] = "" + "৩০";
        english[32] = "" + "৩১";
        english[33] = "" + "";
        english[34] = "" + "";


        bangla[0] = "" + "";
        bangla[1] = "" + "";
        bangla[2] = "" + "১৬";
        bangla[3] = "" + "১৭";
        bangla[4] = "" + "১৮";
        bangla[5] = "" + "১৯";
        bangla[6] = "" + "২০";
        bangla[7] = "" + "২১";
        bangla[8] = "" + "২২";
        bangla[9] = "" + "২৩";
        bangla[10] = "" + "২৪";
        bangla[11] = "" + "২৫";
        bangla[12] = "" + "২৬";
        bangla[13] = "" + "২৭";
        bangla[14] = "" + "২৮";
        bangla[15] = "" + "২৯";
        bangla[16] = "" + "৩০";
        bangla[17] = "" + "১";
        bangla[18] = "" + "২";
        bangla[19] = "" + "৩";
        bangla[20] = "" + "৪";
        bangla[21] = "" + "৫";
        bangla[22] = "" + "৬";
        bangla[23] = "" + "৭";
        bangla[24] = "" + "৮";
        bangla[25] = "" + "৯";
        bangla[26] = "" + "১০";
        bangla[27] = "" + "১১";
        bangla[28] = "" + "১২";
        bangla[29] = "" + "১৩";
        bangla[30] = "" + "১৪";
        bangla[31] = "" + "১৫";
        bangla[32] = "" + "১৬";
        bangla[33] = "" + "";
        bangla[34] = "" + "";

        arabic[0] = "" + "";
        arabic[1] = "" + "";
        arabic[2] = "" + "১৪";
        arabic[3] = "" + "১৫";
        arabic[4] = "" + "১৬";
        arabic[5] = "" + "১৭";
        arabic[6] = "" + "১৮";
        arabic[7] = "" + "১৯";
        arabic[8] = "" + "২০";
        arabic[9] = "" + "২১";
        arabic[10] = "" + "২২";
        arabic[11] = "" + "২৩";
        arabic[12] = "" + "২৪";
        arabic[13] = "" + "২৫";
        arabic[14] = "" + "২৬";
        arabic[15] = "" + "২৭";
        arabic[16] = "" + "২৮";
        arabic[17] = "" + "২৯";
        arabic[18] = "" + "৩০";
        arabic[19] = "" + "১";
        arabic[20] = "" + "২";
        arabic[21] = "" + "৩";
        arabic[22] = "" + "৪";
        arabic[23] = "" + "৫";
        arabic[24] = "" + "৬";
        arabic[25] = "" + "৭";
        arabic[26] = "" + "৮";
        arabic[27] = "" + "৯";
        arabic[28] = "" + "১০";
        arabic[29] = "" + "১১";
        arabic[30] = "" + "১২";
        arabic[31] = "" + "১৩";
        arabic[32] = "" + "১৪";
        arabic[33] = "" + "";
        arabic[34] = "" + "";


    }




   /* arabic[0]=""+"";
    arabic[1]=""+"";
    arabic[2]=""+"";
    arabic[3]=""+"";
    arabic[4]=""+"";
    arabic[5]=""+"";
    arabic[6]=""+"";
    arabic[7]=""+"";
    arabic[8]=""+"";
    arabic[9]=""+"";
    arabic[10]=""+"";
    arabic[11]=""+"";
    arabic[12]=""+"";
    arabic[13]=""+"";
    arabic[14]=""+"";
    arabic[15]=""+"";
    arabic[16]=""+"";
    arabic[17]=""+"";
    arabic[18]=""+"";
    arabic[19]=""+"";
    arabic[20]=""+"";
    arabic[21]=""+"";
    arabic[22]=""+"";
    arabic[23]=""+"";
    arabic[24]=""+"";
    arabic[25]=""+"";
    arabic[26]=""+"";
    arabic[27]=""+"";
    arabic[28]=""+"";
    arabic[29]=""+"";
    arabic[30]=""+"";
    arabic[31]=""+"";
    arabic[32]=""+"";
    arabic[33]=""+"";
    arabic[34]=""+"";*/


}
