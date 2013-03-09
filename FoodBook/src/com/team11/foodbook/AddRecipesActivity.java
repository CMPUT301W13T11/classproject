package com.team11.foodbook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddRecipesActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_recipes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_recipes, menu);
		return true;
	}

}
