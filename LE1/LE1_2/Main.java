class Main {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); // Calls show() of Mother, displays "Hello World"

        Child ch = new Child();
        ch.show(); // Calls show() of Child, displays "Hello JUET"
    }
}
