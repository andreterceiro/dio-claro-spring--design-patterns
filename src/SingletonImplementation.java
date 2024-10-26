public class SingletonImplementation {
    private static final SingletonImplementation instance = new SingletonImplementation();

    private void SingletonImplementation() {
        
    }

    public static SingletonImplementation getInstance() {
        return instance;
    }
}
