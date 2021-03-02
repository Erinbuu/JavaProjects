package rectangle2d;

/**
 *Explain the purpose of this project
 * CSC 1350 project #4
 * @author Erin Phillips
 * @since 04/17/2017
 * 
 */
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
public class Rectangle2D 
{  
    public double xlocation;
    public double ylocation;
    public double width;
    public double height;
   
    public Rectangle2D(double xLoc, double yLoc, double w, double h)
    {
        xlocation = xLoc;
        ylocation = yLoc;
        width = w;
        height = h;
    }
    public Rectangle2D()
    {
        xlocation = 0;
        ylocation = 0;
        width = 0;
        height = 0;
    }
    public Rectangle2D(java.awt.geom.Point2D.Double loc, double w, double h){
        width = w;
        height = h;
        xlocation = loc.x;
        ylocation = loc.y;
    }
    public boolean contains(double xCoord, double yCoord)
    {
        if(xCoord >= xlocation && yCoord >= ylocation && (xCoord) <= (xlocation + width) && (yCoord) <= (ylocation + height)){
            return true;
        }
        return false;
       
    }
    public boolean equals(Rectangle2D r)
    {
        return (xlocation == r.xlocation && ylocation == r.ylocation && width == r.width && height == r.height);
    }
    public Point2D.Double getLocation()
    {
        Point2D.Double loc = new Double(xlocation, ylocation);
        return loc;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth(){
        return width;
        
    }
    public double getX()
    {
        return xlocation;
    }
    public double getY(){
        return ylocation;
    }
    public void setRect2D(double xLoc, double yLoc, double w, double h)
    {
        xlocation = xLoc;
        ylocation = yLoc;
        width = w;
        height = h;
    }
   @Override
   public String toString()
   {
       String s = "Rectangle2D = [x=" + xlocation + ", y=" + ylocation + ", w=" + width + ", h=" + height + "]";
       return s;
   }
}
