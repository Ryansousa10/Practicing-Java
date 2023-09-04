package uol.compass.introducao.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
//      =, -=, +=, *=, /=, %=
        int wage = 500;
        wage = wage + (int) (wage * 0.1);
//          wage += 1000;
//          wage *= 3;
        System.out.println(wage);
    }
}
