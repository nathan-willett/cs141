package Lab14__3_4;

public class Point {
    private int x;
    private int y;

    public void Point(int initialX, int initialY) {
        int x = initialX;
        int y = initialY;
    }
    
    public static void main(String[] args) {
        //distance( )
    }
    
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

    public double distance(Point other) {
        double dx = x - other.x;
        double dy = y - other.y;

        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return distance;
    }
}
