class A extends Object
{
   int k=10;
   public boolean equals(Object ob)
   {
     if(ob instanceof B)
      {
           return  (k==((B)ob).j); 
      } 
      else
       {
         return false;
       }        
   }
}
class B extends A
{
   int j=10;
    
} 
class apollo11
{
   public static void main(String args[])
   {
   A a=new A();
   B b=new B();
   System.out.println("value of a"+a.equals(b));
   }
}