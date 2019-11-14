package chapter7;

import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dkjiaf", "dfiandfio", "difjsfios");
//        List<String> result = list.stream().collect(Collectors.toCollection(LinkedList::new));
//        List<String> result = list.stream().collect(Collectors.toCollection(CopyOnWriteArrayList::new));
        Set<String> result = list.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result);
        //joining
        String joinResult = list.stream().collect(Collectors.joining());
        System.out.println(joinResult);
        String joinResult2 = list.stream().collect(Collectors.joining(" "));
        System.out.println(joinResult2);
        String joinResult3 = list.stream().collect(Collectors.joining(" ","_","_"));
        System.out.println(joinResult3);

        //partitionBy
        List<String> stringList = Arrays.asList("SpringBoot","Java","HTML5","CSS3");
        Map<Boolean,List<String>> resultMap = stringList.stream().collect(Collectors.partitioningBy(obj->obj.length()>4));
        resultMap.forEach((a,b)-> System.out.println(a+":"+b));

        List<Student> studentList = Arrays.asList(
                new Student("山东",21),new Student("广东",21),new Student("陕西",21),
                new Student("山东",22),new Student("广东",22),new Student("陕西",22),
                new Student("山东",23),new Student("广东",23),new Student("陕西",23));
        //groupBy
        Map<String,List<Student >> stringListMap = studentList.stream().collect(Collectors.groupingBy(obj->obj.getProvince()));
        stringListMap.forEach((a,b)-> System.out.println(a+ " : "+b));
        Map<String,Long> map= studentList.stream().collect(Collectors.groupingBy(obj->obj.getProvince(),Collectors.counting()));
        map.forEach((key,value)-> System.out.println(key+":"+value));

        //summarizingInt
        IntSummaryStatistics intSummaryStatistics =  studentList.stream().collect(Collectors.summarizingInt(Student::getAge));
        System.out.println(intSummaryStatistics.toString());
    }
}
class Student{
    private int age;
    private String province;
    public Student(){}
    public Student(String province,int age){
        this.province= province;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", province='" + province + '\'' +
                '}';
    }
}
