public class Main
{
    public static void main(String[] args)
    {
        Student[] sts = new Student[5];
        Student s1 = new Student(1,"Harsh");
        Student s2 = new Student(2,"Bro");
        
        for(int i = 0;i<5;i++)
        {
            new Student(i,"Harshbro");
        }
        
        StringBuffer sb = new StringBuffer("Harsh");
        System.out.println(sb);
        sb.append(" Raundal");
        System.out.println(sb);
        
        s1.display();
        s2.display();
        
        //wrapper class below
        
        int a = 10;
        System.out.println(a);
        Integer b = Integer.valueOf(a);
        System.out.println(b);
        int y = b;
        System.out.println(y);
        
        
    }
}
