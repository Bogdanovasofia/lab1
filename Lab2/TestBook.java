public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Красавица и чудовище", 100);
        Book d2 = new Book("Золушка", 64);
        Book d3 = new Book("Argument");
        d3.setPage(40);
        System.out.println(d1);
        d1.intoPages();
        d2.intoPages();
        d3.intoPages();
    }
}
