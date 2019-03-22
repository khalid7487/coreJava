package utilities;

class Parent {

    int pi, pj;

    void showpipj() {
        System.out.println("Pi and Pj " + pi + " " + pj);
    }
}

class Child extends Parent {

    int pk;

    void showPk() {
        System.out.println("Pk:" + pk);
    }

    void sum() {
        System.out.println("Pi+Pj+Pk:" + (pi + pj + pk));
    }
}

class InharetanceExam {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.pi = 3;
        p.pj = 7;
        System.out.println("Contents of parent class");
        p.showpipj();
        System.out.println();
        c.pi = 18;
        c.pj = 27;
        c.pk = 5;
        System.out.println("Contents of child Class");
        c.showpipj();
        c.showPk();
        System.out.println();
        System.out.println("Sum of pi,pj,pk in child");
        c.sum();
    }
}
