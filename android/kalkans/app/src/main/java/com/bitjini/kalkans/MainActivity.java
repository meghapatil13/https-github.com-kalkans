package com.bitjini.kalkans;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
=======
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

>>>>>>> 2954dc84eac70ea77b3faee5e5c4724a98143443

public class MainActivity extends Activity implements View.OnClickListener {

    private CardView EarthquakeCard,WomenSafetyCard,TheftCard,TerroristCard,FloodCard,MedicalEmergencyCard,LandSlidesCard,AccidentsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if(!isUsrLoggedIn){
//            //show login page
//        }else{
//
//        }

        FloodCard=(CardView)findViewById(R.id.Flood_card);
        AccidentsCard=(CardView)findViewById(R.id.Accidents_card);
        MedicalEmergencyCard=(CardView)findViewById(R.id.Medical_Emergency_card);
        LandSlidesCard=(CardView)findViewById(R.id.Land_Slides_card);
        EarthquakeCard=(CardView)findViewById(R.id.Earthquake_card);
        TheftCard=(CardView)findViewById(R.id.Theft_card);
        TerroristCard=(CardView)findViewById(R.id.Terrorist_card);
        WomenSafetyCard=(CardView)findViewById(R.id.Women_Safety_card);


        FloodCard.setOnClickListener(this);
        AccidentsCard.setOnClickListener(this);
        MedicalEmergencyCard.setOnClickListener(this);
        LandSlidesCard.setOnClickListener(this);
        EarthquakeCard.setOnClickListener(this);
        TheftCard.setOnClickListener(this);
        TerroristCard.setOnClickListener(this);
        WomenSafetyCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent I;
        switch(v.getId()) {
            case R.id.Flood_card : I = new Intent(this,Flood. class); startActivity(I);break;
            case R.id.Accidents_card : I = new Intent(this,Accidents. class);startActivity(I); break;
            case R.id.Medical_Emergency_card : I = new Intent(this,Medical_Emergency. class);startActivity(I); break;
            case R.id.Land_Slides_card : I = new Intent(this,Land_Slides. class);startActivity(I); break;
            case R.id.Earthquake_card: I = new Intent(this,Earthquake. class);startActivity(I); break;
            case R.id.Theft_card : I = new Intent(this,Theft. class); startActivity(I);break;
            case R.id.Terrorist_card : I = new Intent(this,Terrorist. class); startActivity(I);break;
            case R.id.Women_Safety_card : I = new Intent(this,Women_Safety. class);startActivity(I); break;
            default:break;

        }
    }
}