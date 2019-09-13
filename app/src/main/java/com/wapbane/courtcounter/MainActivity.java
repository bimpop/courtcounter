package com.wapbane.courtcounter;

import android.app.*;
import android.os.*;
import android.view.*;
import java.util.zip.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	int scoreA = 0;
	int scoreB = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		resetScores((findViewById(R.id.mainButtonReset)));
    }
	
	public void resetScores(View view){
		scoreA = 0;
		scoreB = 0;
		displayScores();
	}
	
	private void displayScores(){
		displayScoreA();
		displayScoreB();
	}
	
	private void displayScoreA(){
		TextView textViewA = (TextView) findViewById(R.id.mainTextViewA);
		textViewA.setText(String.valueOf(scoreA));
	}
	
	private void displayScoreB(){
		TextView textViewB = (TextView) findViewById(R.id.mainTextViewB);
		textViewB.setText(String.valueOf(scoreB));
	}
	
	public void addThreeA(View view){
		scoreA += 3;
		displayScoreA();
	}
	
	public void addTwoA(View view){
		scoreA += 2;
		displayScoreA();
	}
	
	public void addOneA(View view){
		scoreA += 1;
		displayScoreA();
	}
	
	public void addThreeB(View view){
		scoreB += 3;
		displayScoreB();
	}

	public void addTwoB(View view){
		scoreB += 2;
		displayScoreB();
	}

	public void addOneB(View view){
		scoreB += 1;
		displayScoreB();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		// TODO: Implement this method
		MenuInflater Inflater = getMenuInflater();
		Inflater.inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		// TODO: Implement this method
		switch(item.getItemId()){
			case R.id.mainMenuAbout:
				Toast.makeText(this, "This is a B-Ball game counter!", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.mainMenuExit:
				finish();
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
