package PaintPackage;

public class Point {

    private int x = 0;
    private int y = 0;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void addY(int amount) {
        y += amount;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void addX(int amount) {
        x += amount;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
    
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x - this.x, 2)+Math.pow(y - this.y, 2));
    }
    
    public double distance(Point another){
        return distance(another.x, another.y);
    }
    
     public double distance(){
        return distance(0, 0);
    }
}
