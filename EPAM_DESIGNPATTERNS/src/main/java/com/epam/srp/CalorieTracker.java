package com.epam.srp;

public class CalorieTracker {
	private int calories;
	private int limit;
	
	public CalorieTracker(int calories){
		this.calories = calories;
		this.limit = 2600;
	}
	
	public void trackCalories(int calories) {
		this.calories += calories;
		if(calories > this.limit)
		{
			logCalories("limit exceeeded!");
		}
	}
	private void logCalories(String message) {
		new LogginTool(message);
	}
}
