//데이터를 통지하는 생산자
public interface Publisher<T> {
    // 데이터를 받는 Subscriber 등록
    public void subscribe(Subscriber<? super T> subscriber);
}
