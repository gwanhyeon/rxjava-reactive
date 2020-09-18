import org.reactivestreams.Subscription;

// 데이터를 받아 처리 하는 소비자
public interface Subscriber<T> {
    // 구독 시작시 처리
    public void onSubscribe(Subscription subscription);

    // 데이터 통지시 처리
    public void onNext(T item);

    // 에러 통지시 처리
    public void onError(Throwable error);

    // 완료 통지시 처리
    public void onComplete();

}
