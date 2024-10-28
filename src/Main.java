import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wuhaoyu
 * @date 2024/10/28  下午4:21
 * @description:${description}
 *///TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        try{
            Class<?> personClass=Class.forName("Person");
//            这一步是直接使用Class对象创建 其只能用无参构造函数创建。
            Person person=(Person)personClass.newInstance();
            System.out.println(person);
//            这是使用Constructor去创建对象的
//            Constructor<?> constructor=personClass.getDeclaredConstructor(String.class);
//            constructor.setAccessible(true);
//            Person s=(Person) constructor.newInstance("djk");
//            System.out.println(s);
        }catch (IllegalAccessException|ClassNotFoundException |InstantiationException e){
            e.printStackTrace();
            System.out.println("哎嘿");
        }
//        catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }

    }
}