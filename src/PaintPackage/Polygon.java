package PaintPackage;

import java.awt.Graphics;
import java.awt.Color;

public class Polygon extends Shape{
    public static int shapeNumber;
    public Point c;
    public Point[] ps;
    private int[] X; 
    private int[] Y; 

    
    public Polygon(){
        super();
        name = "Polygone_" + shapeNumber;
        shapeNumber++;
        ps = new Point[1];
        setSets();
    }
    
    public Polygon(Point[] ps, Color borderColor, Color fillColor, boolean isFill){
        super(borderColor, fillColor, isFill);
        name = "Polygone_" + shapeNumber;
        shapeNumber++;
        this.ps = ps;
        setSets();
        setCenter();
    }
    
    @Override
    public void draw(Graphics myGr) {
        myGr.setColor(borderColor);
        myGr.drawPolygon(X, Y, ps.length);
        if (isFill){
            myGr.setColor(fillColor);
            myGr.fillPolygon(X, Y, ps.length);
        }
    }

    @Override
    public void move(int xMove, int yMove) {
        for(int i = 0 ; i < ps.length; i++){
            ps[i].setXY(ps[i].getX()+xMove, ps[i].getY()+yMove);
            setSets();
        }
    }

    @Override
    public void erase() {
        System.out.printf("%s erased\n",name);
    }
    
    @Override
    public void scale(int amount){
        setCenter();
        
        if (amount >  100){
            amount =  100; 
        }
        if (amount < -100){
            amount = -100; 
        }
        
        double k = (double)amount / 500; 
        
        for (int i = 0; i < ps.length ; i++){
            ps[i] = scalePoint(ps[i], c, k);
        }
        
        setSets();
    }

    @Override
    public boolean hit(Point p) {
        int n = ps.length;
        boolean inside = false;
        for (int i = 0, j = n - 1; i < n; j = i++) {
            if ((ps[i].getY() > p.getY()) != (ps[j].getY() > p.getY()) &&
                (p.getX() < (ps[j].getX() - ps[i].getX()) * (p.getY() - ps[i].getY()) / (ps[j].getY() - ps[i].getY()) + ps[i].getX())) {
                inside = !inside;
            }
        }
        return inside;
    }
    
    private void setSets(){
        X = new int[ps.length];
        Y = new int[ps.length];
        for (int i = 0; i < ps.length; i++){
            X[i] = ps[i].getX();
            Y[i] = ps[i].getY();
        }
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
