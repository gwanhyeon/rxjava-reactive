import io.reactivex.Flowable;
public class printTest {
    public static void main(String[] args) {
        Flowable<String> flowable = Flowable.just("version Info=>", "rxjava2.2.6, reactiveStreams1.0.2");
        flowable.subscribe(data-> System.out.println(data));
    }
}
