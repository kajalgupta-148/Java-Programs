class School
{
    void study()
    {
        System.out.println("School provides education");
    }
}

class College extends School
{
    void course()
    {
        System.out.println("College provides courses");
    }
}

class Student extends College
{
    void exam()
    {
        System.out.println("Student gives examination");
    }

    public static void main(String st[])
    {
        Student obj = new Student();

        obj.study();
        obj.course();
        obj.exam();
    }
}