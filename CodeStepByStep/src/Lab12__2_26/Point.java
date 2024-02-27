/*
 * Add the following method to the Point class:
 * 
 * public double slope(Point other)
 * 
 * Returns the slope of the line drawn between this Point and the given other Point. Use the formula
 * (y2 - y1) / (x2 - x1) to determine the slope between two points (x1, y1) and (x2, y2). Note that this
 * formula fails for points with identical x-coordinates, so throw an IllegalArgumentException in 
 * this case.
 */

package Lab12__2_26;

public class Point {
    private int x;
    private int y;

    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException("The x-coordinates are identical. Slope is undefined.");
        }
    
        return (double) (other.y - this.y) / (other.x - this.x);
    }

    public boolean isVertical(Point other) {
        if (this.x == other.x) {
            return true;
        }
        return false;
    }

    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public int manhattanDistance(Point other) {
        double dx = Math.pow((x - other.x), 2);
        double dy = Math.pow((y - other.y), 2);
        return (int) Math.abs(dx + dy);
    }
}