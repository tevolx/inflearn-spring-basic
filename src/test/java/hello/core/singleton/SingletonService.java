package hello.core.singleton;

public class SingletonService {
    // 1. static 영역에 객체를 1개만 생성해둠
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어 객체 인스턴스가 필요하면 해당 static 메서드를 통해 조회하도록 허용
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 외부에서 새로운 인스턴스 생성하지 못하게 private으로
    private SingletonService() { }

    public void logic() {
        System.out.println("Call Singleton Object");
    }
}
