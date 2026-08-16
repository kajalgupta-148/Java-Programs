class College
{
    void study()
    {
        System.out.println("Students study in college");
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
        obj.exam();
    }
}