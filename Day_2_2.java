package Day2;

import java.awt.print.Book;

class Day_2_2{

    private String name = "ssss";

    public String getName()
    {
        int id = 0;
        setName("Java");
        return id+this.name;
    }
    private void setName(String name)
    {
        this.name = name;
    }
    public Day_2_2 getBook()
    {
        return this;
    }
    public static void main(String[] args)
    {
        String S1=new String("SSS");
        String S2=new String("sss");
        System.out.print(S1.equalsIgnoreCase(S2));

    }
}


