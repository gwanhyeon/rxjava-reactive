import org.reactivestreams.Subscription;

public class MainClass implements Subscriber{

    // subscriber내부에 subscription보관하기
    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        // 받은 Subscription을 Subscriber 내부에 보관한다
        this.subscription = subscription;
        this.subscription.request(num);
    }

    @Override
    public void onNext(Object item) {
        // 요청한 데이터를 처리하면 다음 데이터 개수를 요청한다.
        subscription.request(num);
    }

    @Override
    public void onError(Throwable error) {

    }

    @Override
    public void onComplete() {

    }
}
