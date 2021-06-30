package git;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("Hello Git 1");
        masterPrint();
        hotFixPrint();
        System.out.println("push test");

    }
    public static void masterPrint(){
        System.out.println("master写的第一段代码");
    }
    public static void hotFixPrint(){
        System.out.println("hot-fix写的第一段代码");
    }
}
