public class BoxUtil {

    public static <T> void copyFromBoxToBox(Box<T> src, Box<? super T> dest) {
        dest.put(src.get());
    }

    public static void copyFreshFruitFromBoxToBox(Box<? extends Fruit> src, Box<? super Fruit> dest) {
        if (src.get().isFresh()) {
            dest.put(src.get());
        }
    }
    public static <T> void printElementFromTwoBoxes(Box<? super T> box) {
        System.out.println(box.get());
    }

    public static void printElementFromBoxes(Box<?> box) {
        System.out.println(box);
    }
}
