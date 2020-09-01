import io.reactivex.Flowable;
public class printTest {
    public static void main(String[] args) {
        Flowable<String> flowable = Flowable.just("Hello", "World");
        flowable.subscribe(data-> System.out.println(data));
    }
}
