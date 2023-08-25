import java.util.*;
public class nearbuycars {
    static class point implements Comparable<point> {
        int x;
        int y;
        int sqrt;
        public point(int x,int y,int sqrt) {
            this.x=x;
            this.y=y;
            this.sqrt=sqrt;
        }
        public int compareTo(point p2) {
            return this.sqrt -p2.sqrt;
        }
    }
    public static void main(String args []) {
        int pts[][]= {{3,3},{5,-1},{-2,4}};
        int k =2;
        PriorityQueue<point> pq = new PriorityQueue<>();
        for (int i=0; i<pts.length;i++) {
            int sqrt = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][1],sqrt));
        }
        for (int i=0;i<k;i++) {
            point p = pq.remove();
            System.out.println(p.x+p.y);
        }
    }
}
