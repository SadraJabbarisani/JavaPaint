package PaintPackage;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape{
    public static int shapeNumber;
    public Point p1, p2, 
                 f1, f2;
    private double a, b, c;
    private double teta;
    

    public Oval() {
        super();
        name = "Oval_" + shapeNumber;
        shapeNumber++;
        p1 = new Point();
        p2 = new Point();
        setPoints();
        setABCFF();
        
    }

    public Oval(Point p1, Point p2, Color borderColor,Color fillColor, boolean isFill) {
        super(borderColor,fillColor,isFill);
        name = "Oval_" + shapeNumber;
        shapeNumber++;
        this.p1 = p1;
        this.p2 = p2;
        setPoints();
        setABCFF();
        
    }
    
    public void draw(Graphics myGr) {
        setPoints();
        myGr.setColor(borderColor);
        myGr.drawOval(p1.getX(), p1.getY(), p2.getX() - p1.getX(), p2.getY() - p1.getY());
        //myGr.drawLine(f1.getX(), f1.getY(), f2.getX(), f2.getY());                         //show focuses for debuging 
        if(isFill){
            myGr.setColor(fillColor);
            myGr.fillOval(p1.getX(), p1.getY(), p2.getX() - p1.getX(), p2.getY() - p1.getY());            
        }
        System.out.printf("%s draw at %s -> %s\n", name, p1, p2);
    }

    public void move(int xMove, int yMove) {
        p1.setX(p1.getX() + xMove);
        p1.setY(p1.getY() + yMove);
        p2.setX(p2.getX() + xMove);
        p2.setY(p2.getY() + yMove);
        f1.setX(f1.getX() + xMove);
        f1.setY(f1.getY() + yMove);
        f2.setX(f2.getX() + xMove);
        f2.setY(f2.getY() + yMove);

    }
    
    public void scale (int amount){
        amount *= 100000;
        p2.addX((int)(amount * Math.cos(teta)) / 200000 );
        p2.addY((int)(amount * Math.sin(teta)) / 200000 );
        p1.addX((int)(amount * Math.cos(teta)) /-200000 );
        p1.addY((int)(amount * Math.sin(teta)) /-200000 );
        setABCFF();
    }
    
    
    public void erase(){
        System.out.printf("%s erased\n",name);
    }
    
    public boolean hit(Point p){
        return p.distance(f1) + p.distance(f2) <= 2*a;
    }
    
    private void setABCFF(){
        setPoints();
        if(p2.getX() - p1.getX() > p2.getY() - p1.getY()){
            a = (p2.getX() - p1.getX()) / 2;
            b = (p2.getY() - p1.getY()) / 2;
            c = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));
            
            f1 = new Point(p2.getX()-(int)a-(int)c,p2.getY()-(int)b);
            f2 = new Point(p2.getX()-(int)a+(int)c,p2.getY()-(int)b);
        }else{
            a = (p2.getY() - p1.getY()) / 2;
            b = (p2.getX() - p1.getX()) / 2;
            c = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));
            
            f1 = new Point(p2.getX()-(int)b, p2.getY()-(int)a-(int)c);
            f2 = new Point(p2.getX()-(int)b, p2.getY()-(int)a+(int)c);
        }
    }
    
    private void setPoints(){
        int save;
        if(p1.getX()> p2.getX()){
            save = p1.getX();
            p1.setX(p2.getX());
            p2.setX(save);
        }
        
        if(p1.getY()> p2.getY()){
            save = p1.getY();
            p1.setY(p2.getY());
            p2.setY(save);
        }
        
        double y = p2.getY() - p1.getY();
        double x = p2.getX() - p1.getX();
        
        teta = Math.atan(y / x);
    }

}
