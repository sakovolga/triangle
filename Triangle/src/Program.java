public class Program {
    public static void main(String[] args) {
        Point pt=new Point();
        Point pt2=new Point(8, 9);
        Point pt3=new Point(13, 14);
        Triangle tr1=new Triangle();
        Triangle tr2=new Triangle(1, 3, 4, 6, 10, 12);
        Triangle tr3=new Triangle(pt.x, pt.y, pt2.x, pt2.y, pt3.x, pt3.y);

        System.out.println("Треугольник1: первая вершина:" + tr1.x1+";"+tr1.y1+" вторая вершина:"+tr1.x2+";"+tr1.y2+" третья вершина:"+tr1.x3+";"+tr1.y3);
        System.out.println("Треугольник2: первая вершина:" + tr2.x1+";"+tr2.y1+" вторая вершина:"+tr2.x2+";"+tr2.y2+" третья вершина:"+tr2.x3+";"+tr2.y3);
        System.out.println("Треугольник3: первая вершина:" + tr3.x1+";"+tr3.y1+" вторая вершина:"+tr3.x2+";"+tr3.y2+" третья вершина:"+tr3.x3+";"+tr3.y3);



    }
}
