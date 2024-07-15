package PaintPackage;

import java.awt.Graphics;
import java.awt.Color;

public class Triangle extends Shape{
    public static int shapeNumber;
    public Point p1, p2, p3, c;
    private int[] X; 
    private int[] Y; 


    public Triangle() {
        super();
        name = "Triangle_" + shapeNumber;
        shapeNumber++;
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
        setSets();
    }

    public Triangle(Point p1, Point p2, Point p3, Color borderColor, Color fillColor, boolean isFill) {
        super(borderColor, fillColor, isFill);
        name = "Triangle_" + shapeNumber;
        shapeNumber++;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        setSets();
        setCenter();
    }
    
    @Override
    public void draw(Graphics myGr) {
        myGr.setColor(borderColor);
        myGr.drawPolygon(X, Y, 3);
        //myGr.drawOval(c.getX()-5, c.getY()-5, 10, 10);  //for debug
        if (isFill){
            myGr.setColor(fillColor);
            myGr.fillPolygon(X, Y, 3);
        }
        System.out.printf("%s draw at %s -> %s -> %s\n", name, p1, p2,p3);
    }

    @Override
    public void move(int xMove, int yMove) {
        p1.setX(p1.getX() + xMove);
        p1.setY(p1.getY() + yMove);
        p2.setX(p2.getX() + xMove);
        p2.setY(p2.getY() + yMove);
        p3.setX(p3.getX() + xMove);
        p3.setY(p3.getY() + yMove);
        setSets();
    }
    
    public void scale (int amount){
        setCenter();
        
        if (amount >  100){
            amount =  100; 
        }
        if (amount < -100){
            amount = -100;
        }
        
        double k = (double)amount / 500; 
        
        p1 = scalePoint(p1, c, k);
        p2 = scalePoint(p2, c, k);
        p3 = scalePoint(p3, c, k);
        
        setSets();
    }
    

    @Override
    public void erase() {
        System.out.printf("%s erased\n",name);
    }

    @Override
    public boolean hit(Point p) {
        return areaOf(p1,p2,p3) == areaOf(p,p1,p2) + areaOf(p, p2, p3) + areaOf(p, p1, p3);
    }
    
    public static double areaOf(Point p1, Point p2, Point p3){
        return 0.5*Math.abs((p1.getX()*p2.getY())+(p2.getX()*p3.getY())+(p3.getX()*p1.getY())-(p1.getX()*p3.getY())-(p2.getX()*p1.getY())-(p3.getX()*p2.getY()));
    }
    
    private void setSets(){
        X = new int[3];
        Y = new int[3];
        X[0] = p1.getX();
        X[1] = p2.getX();
        X[2] = p3.getX();

        Y[0] = p1.getY();
        Y[1] = p2.getY();
        Y[2] = p3.getY();
    }
    
    private void setCenter(){
        int xMin = 100000,xMax = 0,
            yMin = 100000,yMax = 0;
        for (int x : X){
            if (x > xMax) {xMax = x;}
            if (x < xMin) {xMin = x;}
        }
        for (int y : Y){
            if (y > yMax) {yMax = y;}
            if (y < yMin) {yMin = y;}
        }
        c = new Point((xMax - xMin) / 2 + xMin, (yMax - yMin) / 2 + yMin);
    }
    
}
