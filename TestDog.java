public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Barsik", 3);
        Dog d2 = new Dog("Murka", 9);
        Dog d3 = new Dog("Pupsik");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
