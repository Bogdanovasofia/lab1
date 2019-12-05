public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Basketball", 8);
        Ball d2 = new Ball("Football", 9);
        Ball d3 = new Ball("Volleyball", 10);
        System.out.println(d1);
        d1.intoSize();
        d2.intoSize();
        d3.intoSize();

    }
}
