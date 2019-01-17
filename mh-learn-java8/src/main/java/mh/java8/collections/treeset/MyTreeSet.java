package mh.java8.collections.treeset;

import com.sun.codemodel.internal.JForEach;

import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        TreeSet<Student> sut1 = new TreeSet<>();
        TreeSet<Student> sut = new TreeSet<>(new MyStudenComparator());

        sut.add(new Student("Aadu","Male",30));
        sut.add(new Student("Kirti","Female",20));
        sut.add(new Student("Manju","Male",10));

        sut1.add(new Student("Aadu","Male",30));
        sut1.add(new Student("Kirti","Female",20));
        sut1.add(new Student("Manju","Male",10));


        for(Student s: sut)
        {
            System.out.println(s.toString());
        }

        sut1.forEach(s -> System.out.println(s.toString()));
    }
}
