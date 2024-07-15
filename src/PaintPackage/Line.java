package PaintPackage;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

    public static int shapeNumber;
    public Point p1, p2, c;
    double teta;


    public Line() {
        super();
        name = "Line_" + shapeNumber;
        shapeNumber++;
        p1 = new Point();
        p2 = new Point();
        
    }

    public Line(Point p1, Point p2, Color borderColor) {
        name = "Line_" + shapeNumber;
        shapeNumber++;
        this.p1 = p1;
        this.p2 = p2;
        this.borderColor = borderColor;
    }

    public void draw(Graphics myGr) {
        System.out.printf("%s draw at %s -> %s\n", name, p1, p2);
        myGr.setColor(borderColor);
        myGr.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public void move(int xMove, int yMove) {
        p1.setX(p1.getX() + xMove);
        p1.setY(p1.getY() + yMove);
        p2.setX(p2.getX() + xMove);
        p2.setY(p2.getY() + yMove);

    }
    
    public void scale (int amount){
        setCenter();
        
        double k = (double)amount / 500; 
        
        p1 = scalePoint(p1, c, k);
        p2 = scalePoint(p2, c, k);
    }
    
    
    public void erase(){
        System.out.printf("%s erased\n",name);
    }
    
    public boolean hit(Point p){
        return p1.distance(p2) + 0.5 >= p1.distance(p) + p2.distance(p) ;
    }
    
    private void setCenter(){
        int xMin = 100000,xMax = 0,
            yMin = 100000,yMax = 0;
        
        if (p1.getX() > p2.getX()){
            xMax = p1.getX();
            xMin = p2.getX();
        }else{
            xMax = p2.getX();
            xMin = p1.getX();
        }
        
        if (p1.getY() > p2.getY()){
            yMax = p1.getY();
            yMin = p2.getY();
        }else{
            yMax = p2.getY();
            yMin = p1.getY();
        }
        
        c = new Point((xMax - xMin) / 2 + xMin, (yMax - yMin) / 2 + yMin);
    }

}
