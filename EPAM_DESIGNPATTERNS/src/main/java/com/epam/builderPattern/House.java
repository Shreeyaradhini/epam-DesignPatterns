package com.epam.builderPattern;

public class House {
	private Boolean walls;
	private Boolean windows;
	private Boolean doors;
	private Boolean windowsCount;
	private Boolean chimney;
	private Boolean garage;
	private Boolean swimmingPool;
	
	public House(Boolean walls, Boolean windows, Boolean doors){
		this.walls = walls;
		this.windows  = windows;
		this.doors = doors;
	}
	
	public House(Boolean walls, Boolean windows, Boolean doors,
			Boolean chimney, Boolean garage, Boolean swimmingPool){
		this.walls = walls;
		this.windows  = windows;
		this.doors = doors;
		this.chimney=chimney;
		this.garage = garage;
		this.swimmingPool = swimmingPool;
	}
	
	public void detailsOfHouse() {
		String message ="";
		if(walls)
		{
			message += "House has walls \n";
		}
		if(doors)
		{
			message+= "House has dooes\n";
		}
		if(windows)
		{
			message += "House has windows \n";
		}
		if(chimney)
		{
			message += "House has chimney \n";
		}
		if(garage)
		{
			message += "House has garage \n";
		}
		if(swimmingPool)
		{
			message+= "House has swimming Pool ";
		}
		System.out.println(message);
	}

	public Boolean getWalls() {
		return walls;
	}

	public void setWalls(Boolean walls) {
		this.walls = walls;
	}

	public Boolean getWindows() {
		return windows;
	}

	public void setWindows(Boolean windows) {
		this.windows = windows;
	}

	public Boolean getDoors() {
		return doors;
	}

	public void setDoors(Boolean doors) {
		this.doors = doors;
	}

	public Boolean getWindowsCount() {
		return windowsCount;
	}

	public void setWindowsCount(Boolean windowsCount) {
		this.windowsCount = windowsCount;
	}

	public Boolean getChimney() {
		return chimney;
	}

	public void setChimney(Boolean chimney) {
		this.chimney = chimney;
	}

	public Boolean getGarage() {
		return garage;
	}

	public void setGarage(Boolean garage) {
		this.garage = garage;
	}

	public Boolean getSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(Boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}
	
	
}
