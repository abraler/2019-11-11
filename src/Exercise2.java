class Node1{
    int x;
    int y;
    public Node1(int x) {
        System.out.println(1111111);
    }
    public Node1(int x, int y) {
        this(x);
        this.y = y;
        System.out.println(2222);
    }


}
public class Exercise2 {
    static int i;
    public static void main(String[] args) {
        System.out.println(i);


    }
}
