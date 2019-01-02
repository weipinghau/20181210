package superClass;

import com.sun.deploy.panel.SpecialTableRenderer;

public class SuperClass {
    String superName = "superName";
    String superAge = "superAge";
    String a;

    public SuperClass() {
        System.out.println("父类无参构造方法");
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public String getSuperAge() {
        return superAge;
    }

    public void setSuperAge(String superAge) {
        this.superAge = superAge;
    }

    public String superMethod(){
        return "superMethod";
    }
    public void a(){
        System.out.println(a);
    }
}
class SubClass extends SuperClass{
    public SubClass() {
        System.out.println("子类无参构造方法");
        a(super.a);
//        super.a = "wwww";
        System.out.println("a::"+a);
    }
    public void a(String a){
        super.a="555";
        System.out.println("123::"+a);
    }
}
