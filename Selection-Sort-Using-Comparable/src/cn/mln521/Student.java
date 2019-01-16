package cn.mln521;

/**
 * @Descripton TODO
 * Created by xl
 * @Date 2019/1/16 23:25
 */
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 定义Student的compareTo函数
    // 如果分数相等，则按照名字的字母序排序
    // 如果分数不等，则分数高的靠前
    @Override
    public int compareTo(Student that) {
        if (this.score < that.score)
            return -1;
        else if (this.score > that.score)
            return 1;
        else
            return this.name.compareTo(that.name);

    }

    // 定义Student实例的打印输出方式
    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString( this.score );
    }
}
