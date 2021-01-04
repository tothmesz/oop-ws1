public class Main {
    public static void main(String[] args){
        Range range1 = new Range(1, 2);
        Range range2 = new Range(2, 3);

        System.out.println(range1.start);
        range1.start = 3;
        range2.start = 5;
        System.out.println(range1.start);
        System.out.println(range2.start);

    }
}
