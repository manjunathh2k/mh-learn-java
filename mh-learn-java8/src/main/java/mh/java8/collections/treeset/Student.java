package mh.java8.collections.treeset;

public class Student implements Comparable{
    private String Name;
    private String Gender;

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public int getAge() {
        return Age;
    }

    private int Age;

    public Student(String _name, String _gender, int _age)
    {
        Name = _name;
        Gender = _gender;
        Age = _age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",Name, Gender, Age);
    }

    @Override
    public int compareTo(Object o) {
        if(((Student)o).getAge() > this.Age )
            return -1;
        else if (((Student)o).getAge() < this.Age )
            return 1;
        else
            return 0;
    }
}
