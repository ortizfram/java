package Entitys;

public class Person {

    String name;
    String sex;
    int age;
    float weight;
    float height;

    public Person() {
    }

    public Person(String name, String sex, int age, float weight, float height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", sex=" + sex + ", age=" + age + ", weight=" + weight + ", height=" + height + '}';
    }

    
}
