package by.htp.point;

public class Main {
	public static void main(String[] args) {
		Point firstPoint = new Point();
		firstPoint.initilizePoint(0, 0, 4, 3);
		firstPoint.SetTimeSec(1);
		firstPoint.coordinatesAtMoment();
		firstPoint.speedAtMoment();
		Point secondPoint = new Point();
		secondPoint.initilizePoint(1, 1, 3, 5);
		secondPoint.SetTimeSec(1);
		secondPoint.coordinatesAtMoment();
		secondPoint.speedAtMoment();
		findCollisionPoint(firstPoint, secondPoint);

	}

	private static void findCollisionPoint(Point firstPoint, Point secondPoint) {
		if (firstPoint.getAngleCoeff() != secondPoint.getAngleCoeff()) {
			firstPoint.SetTimeSec(1);
			secondPoint.SetTimeSec(1);
			double x1 = firstPoint.getX(); 
			double y1 = firstPoint.getY(); 
			double x3 = secondPoint.getX(); 
			double y3 = secondPoint.getY();
			firstPoint.SetTimeSec(2);
			secondPoint.SetTimeSec(2);
			double x2 = firstPoint.getX(); 
			double y2 = firstPoint.getY(); 
			double x4 = secondPoint.getX(); 
			double y4 = secondPoint.getY();
			
			double finX = ((x1*y2 - y1*x2)*(x3-x4) - (x1-x2)*(x3*y4-y3*x4))/((x1-x2)*(y3-y4)-(y1-y2)*(x3-x4));
			double finY = ((x1*y2 - y1*x2)*(y3-y4) - (y1-y2)*(x3*y4-y3*x4))/((x1-x2)*(y3-y4)-(y1-y2)*(x3-x4));
			System.out.println("Пересекаются в x="+finX+" y="+finY);
		}
	}
}
