package by.htp.point;

public class Point {
	private double x;
	private double y;
	private double timeSec;
	private double speed;
	private double speedX;
	private double speedY;
	private double acceleration;
	private double accelerationX;
	private double accelerationY;
	private double angleCoeff;

//	{
//		this.x = 0;
//		this.y = 0;
//		this.timeSec = 0;
//	}

	public void move() {

	}

	public void initilizePoint(double x0, double y0, double x1, double y1) {
		this.acceleration = Math.sqrt(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2)) * 2;
		this.accelerationX = (x1 - x0) * 2;
		this.accelerationY = (y1 - y0) * 2;
		this.angleCoeff = (y1 - y0) / (x1 - x0);
	}

	public void SetTimeSec(double timeSec) {
		this.timeSec = timeSec;
		coords();
		speed();
	}

	public void speedAtMoment() {
		this.speed = this.acceleration * this.timeSec;
		this.speedX = this.accelerationX * this.timeSec;
		this.speedY = this.accelerationY * this.timeSec;
		System.out.println(
				"Current moment sec:" + timeSec + " Speed XY:" + speed + " Speed X: " + speedX + " Speed Y: " + speedY);
	}

	private void speed() {
		this.speed = this.acceleration * this.timeSec;
		this.speedX = this.accelerationX * this.timeSec;
		this.speedY = this.accelerationY * this.timeSec;
	}

	public void coordinatesAtMoment() {
		this.x = this.accelerationX * Math.pow(this.timeSec, 2) / 2;
		this.y = this.accelerationY * Math.pow(this.timeSec, 2) / 2;
		System.out.println("Current moment sec:" + timeSec + " X coord: " + x + " Y coord: " + y);
	}

	private void coords() {
		this.x = this.accelerationX * Math.pow(this.timeSec, 2) / 2;
		this.y = this.accelerationY * Math.pow(this.timeSec, 2) / 2;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public double getAccelerationX() {
		return accelerationX;
	}

	public double getAccelerationY() {
		return accelerationY;
	}

	public double getAngleCoeff() {
		return angleCoeff;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
