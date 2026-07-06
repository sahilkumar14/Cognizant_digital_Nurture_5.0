public class SingletonTest {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("this is first message from log1.");
        log2.log("this is second message from log2");

        if(log1 == log2){
            System.out.println("both log are accessing same log instance showing there is only one Logger instance.");
        }else{
            System.out.println("Multiple Logger instance exists");
        }

        System.out.println("log1 Hashcode: "+log1.hashCode());
        System.out.println("log2 Hashcode: "+log2.hashCode());
    }
}
