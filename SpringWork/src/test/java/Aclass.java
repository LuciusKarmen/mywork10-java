import org.junit.jupiter.api.Test;

public class Aclass {

    @Test  // 这个注解表示：这是一个测试方法
    public void testAdd() {  // 方法名随便起，最好能看出测什么
        // 你要测试的代码写在这里
        int a = 5;
        int b = 3;
        int result = a + b;

        // 检查结果对不对
        if (result == 8) {
            System.out.println("✅ 测试通过！");
        } else {
            System.out.println("❌ 测试失败！");
        }
    }
}