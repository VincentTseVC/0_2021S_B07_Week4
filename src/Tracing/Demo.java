package Tracing;

class A {
  public static int n = 10;
  
  public char x = 'a';
  
  public static void g() {
    System.out.println("Ag");
  }
  
  public void f() {
    System.out.println("Af");
  }
   
}

class B extends A {
  public static int n = 11;
  
  public char x = 'b';
  
  public void f() {
    System.out.println("Bf");
  }
  
  public static void g() {
    System.out.println("Bg");
  }
}

class C extends B {
  public static int n = 12;
  
  public char x = 'c';
  
  
  public static void g() {
    System.out.println("Cg");
  }
  
  public void k() {
    System.out.println("Ck");
  }
}




public class Demo {
  public static void main(String[] args) { 
    
    // 1. see if ref-type knows about the variable / method
    
    // 2. Java Vertual Machine... 
    
    
    // reference type var1 = new actual object();
    
    A var1 = new A();
    A var2 = new B();
    A var3 = new C();
    
    C var4 = new C();
    
    // a
    System.out.println(var1.x);
    System.out.println(var2.x);
    System.out.println(var3.x);
    
    System.out.println(var4.x);
    
    
    // System.out.println((B) var1).x); // Down-cast
    
    System.out.println(((B) var2).x); // down-cast  -> b
    // System.out.println(((C) var2).x); // down-cast -> 最多只能 cast成 B (actual object)
    
    System.out.println(((B) var3).x);   // -> b
    System.out.println(((C) var3).x);   // -> c
    
    System.out.println(((B) var4).x); // up-cast -> b
    
    
    
    // 10
    System.out.println(var1.n);
    System.out.println(var2.n);
    System.out.println(var3.n);
    

    
    // JVM -> runtime -> invoke -> actual object -> instance (non-static) method
    var1.f();
    var2.f();
    var3.f();
    
    
    
    // static -> NOOOOO JVM -> reference type -> static method
    var1.g();
    var2.g();
    var3.g();
    
   
    
  }
}



class Person {
  
  public static int numberOfLags = 3;
  
  
  public String name;
  
  
}






























