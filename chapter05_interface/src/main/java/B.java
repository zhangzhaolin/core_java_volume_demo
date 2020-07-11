public interface B extends A {

    @Override
    default void hello() {
        System.out.println("B");
    }

}
