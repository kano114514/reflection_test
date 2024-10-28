/**
 * @author wuhaoyu
 * @date 2024/10/28  下午4:21
 * @description:
 */
public class Person {
    public String name;

    private Person(String name) {
        this.name = name;
    }
    public Person(){

    }

    public String toString(){
        return "被成功创建";
    }
}
