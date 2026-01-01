/*class Base {
    // --- Static members ---
    static int sx = initStaticX();
    static {
        System.out.println("Base: static block");
    }
    static int initStaticX() {
        System.out.println("Base: static field initializer (sx)");
        return 100;
    }
    static void sMethod() {
        System.out.println("Base: static method sMethod(), sx=" + sx);
    }

    // --- Instance members ---
    int x = initX();
    { 
        System.out.println("Base: instance initializer block, x=" + x);
        x += 1;
    }
    int initX() {
        System.out.println("Base: instance field initializer (x)");
        return 10;
    }

    // --- Constructors ---
    Base() {
        System.out.println("Base: constructor start, x=" + x);
        int local = 1; // local variable
        x += local;
        System.out.println("Base: constructor end, x=" + x);
    }

    // --- Instance method ---
    void iMethod() {
        System.out.println("Base: instance method iMethod(), x=" + x);
        int local = 5; // local variable
        x += local;
        System.out.println("Base: instance method iMethod() after, x=" + x);
    }
}

class Derived extends Base {
    // --- Static members ---
    static int dsx = initDerivedStaticX();
    static {
        System.out.println("Derived: static block");
    }
    static int initDerivedStaticX() {
        System.out.println("Derived: static field initializer (dsx)");
        return 200;
    }
    static void sMethod() {
        System.out.println("Derived: static method sMethod(), dsx=" + dsx);
    }

    // --- Instance members ---
    int dx = initDX();
    {
        System.out.println("Derived: instance initializer block, dx=" + dx + ", current x=" + x);
        dx += 2;
        x += 3; // touch base instance field to show visibility
    }
    int initDX() {
        System.out.println("Derived: instance field initializer (dx)");
        return 20;
    }

    // --- Constructors ---
    Derived() {
        System.out.println("Derived: constructor start, dx=" + dx + ", x=" + x);
        int local = 7; // local variable
        dx += local;
        System.out.println("Derived: constructor end, dx=" + dx + ", x=" + x);
    }

    // --- Instance method ---
    @Override
    void iMethod() {
        System.out.println("Derived: instance method iMethod(), dx=" + dx + ", x=" + x);
        int local = 9; // local variable
        dx += local;
        System.out.println("Derived: instance method iMethod() after, dx=" + dx + ", x=" + x);

        // Optionally call base method
        super.iMethod();
    }
}

public class Demo {
    static {
        System.out.println("FlowDemo: static block");
    }
    public static void main(String[] args) {
        System.out.println("Main: start");

        // Call static methods (no objects needed)
        Base.sMethod();
        Derived.sMethod();

        System.out.println("Main: creating Derived object...");
        Derived d = new Derived();

        System.out.println("Main: calling instance methods...");
        d.iMethod();

        System.out.println("Main: end");
    }
}
*/

/*class Base {
    static int sx = 1;
    int ix = 10;
}

class Derived extends Base {
    static int sx = 2;   // hides Base.sx
    int ix = 20;         // hides Base.ix
}

class Demo {
    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println("sx=" + b.sx + ", ix=" + b.ix);
    }
}*/

/*class Parent {
    Parent() {
        System.out.println("Parent constructor start");
        show();
        System.out.println("Parent constructor end");
    }
    void show() { System.out.println("Parent show()"); }
}

class Child extends Parent {
    int x = 10;
    Child() { System.out.println("Child constructor"); }
    @Override
    void show() { System.out.println("Child show(), x=" + x); }
}

public class Demo {
    public static void main(String[] args) {
        new Child();
    }
}*/

/*class Base {
    // --- Static members ---
    static int sx = initStaticX();
    static {
        System.out.println("Base: static block");
    }
    static int initStaticX() {
        System.out.println("Base: static field initializer (sx)");
        return 100;
    }
    static void sMethod() {
        System.out.println("Base: static method sMethod(), sx=" + sx);
    }

    // --- Instance members ---
    int x = initX();
    { 
        System.out.println("Base: instance initializer block, x=" + x);
        x += 1;
    }
    int initX() {
        System.out.println("Base: instance field initializer (x)");
        return 10;
    }

    // --- Constructors ---
    Base() {
        System.out.println("Base: constructor start, x=" + x);
        int local = 1; // local variable
        x += local;
        System.out.println("Base: constructor end, x=" + x);
    }

    // --- Instance method ---
    void iMethod() {
        System.out.println("Base: instance method iMethod(), x=" + x);
        int local = 5; // local variable
        x += local;
        System.out.println("Base: instance method iMethod() after, x=" + x);
    }
}

class Derived extends Base {
    // --- Static members ---
    static int dsx = initDerivedStaticX();
    static {
        System.out.println("Derived: static block");
    }
    static int initDerivedStaticX() {
        System.out.println("Derived: static field initializer (dsx)");
        return 200;
    }
    static void sMethod() {
        System.out.println("Derived: static method sMethod(), dsx=" + dsx);
    }

    // --- Instance members ---
    int dx = initDX();
    {
        System.out.println("Derived: instance initializer block, dx=" + dx + ", current x=" + x);
        dx += 2;
        x += 3; // touch base instance field to show visibility
    }
    int initDX() {
        System.out.println("Derived: instance field initializer (dx)");
        return 20;
    }

    // --- Constructors ---
    Derived() {
        System.out.println("Derived: constructor start, dx=" + dx + ", x=" + x);
        int local = 7; // local variable
        dx += local;
        System.out.println("Derived: constructor end, dx=" + dx + ", x=" + x);
    }

    // --- Instance method ---
    @Override
    void iMethod() {
        System.out.println("Derived: instance method iMethod(), dx=" + dx + ", x=" + x);
        int local = 9; // local variable
        dx += local;
        System.out.println("Derived: instance method iMethod() after, dx=" + dx + ", x=" + x);

        // Optionally call base method
        super.iMethod();
    }
}

public class Demo {
    static {
        System.out.println("FlowDemo: static block");
    }
    public static void main(String[] args) {
        System.out.println("Main: start");

        // Call static methods (no objects needed)
        Base.sMethod();
        Derived.sMethod();

        System.out.println("Main: creating Derived object...");
        Derived d = new Derived();

        System.out.println("Main: calling instance methods...");
        d.iMethod();

        System.out.println("Main: end");
    }
}*/

class A {
    static int a = print("A static field");

    static {
        print("A static block");
    }

    A() {
        print("A constructor");
    }

    static int print(String s) {
        System.out.println(s);
        return 0;
    }
}

class B extends A {
    static int b = print("B static field");

    static {
        print("B static block");
    }

    B() {
        print("B constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}



