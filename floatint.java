class A1
{
   int x=45,y=100;
   int add()
   {
        x+=y;
         return x;
    }
}
class B extends A1
  {
     int add()
    {
        super.x+=super.y;
        super.x=super.x;
         return super.x;
      
}
}
  interface I
   {
      A1 m2();
     public static float m1()
     {
         float f=33.33f;
          return f;
     }
      public static I m3()
      {
         I i=new A();
        return i;
     }
      
  }
class A implements I
{
     public  B m2()
      {
         return new B();
      } 
  public static void main(String args[])
   {
      float f=I.m1();
      System.out.println(f);
            I i=I.m3();
             B b=(B)i.m2();
             int w=b.add();
              System.out.println(w);
     
   
  }
}