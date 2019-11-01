public class getTotalArea{
    public static double getAllCircleArea(Circle[] clist){
        double sum = 0;
        // for (Circle c : clist)
        for (int i=0; i<clist.length; i++)  {
            sum += clist[i].getArea();
        }
        return sum;
    }

    public static double getAllRectangleArea(ArrayList<Rectangle> rlist){
        double sum = 0;
        // for (int r=0; r<rlist.length; r++)
        for (Rectangle r : rlist) {
            sum += r.getArea();
        }
        return sum;
    }

    public static double getAllTriangleArea(Triangle[][] tlist){
        double sum = 0;
        // for (Triangle[] r : clist){
        //    for (Triangle c : r){
        //        sum += c.getArea;
        //    }    
        //}
        for (int r=0; r<tlist.length; r++) {
            for (int c=0; c<tlist[r].length; c++){
                sum += tlist[r][c].getArea();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Circle
        Circle[] clist = new Circle[2];
        clist[0] = new Circle(4, "red");
        Circle c2 = new Circle(7, "blue");
        clist[1] = c2;

        // Rectangle
        ArrayList<Rectangle> rlist = new ArrayList<Rectangle>();
        rlist.add(new Rectangle(4,7));
        rlist.add(new Rectangle(9,3));
        
        // Triangle
        Triangle[][] tlist = new Triangle[1][2];
        tlist[0][0] = new Triangle(8,6);
        tlist[0][1] = new Triangle(7,3);
    }
}
