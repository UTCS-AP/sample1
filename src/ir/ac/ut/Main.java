package ir.ac.ut;

public class Main {

    public static void main(String[] args) {

        A[] aArray = new A[3];

        B b0 = new B();
        B b1 = new B();

        b0.bS = "Hello";
        b1.bS = "world!";

        aArray[0] = new A("Salam", 0, b0, b0);


        aArray[1] = new A("sdaadfa", 1, b1, b0);

        B b2 = new B();
        B b3 = new B();

        b2.bS = "b2";
        b3.bS = "b3";

        aArray[2] = new A("asasdgasgasfdg", 3, b2, b3);

        for (int i = 0; i < 3; i++) {
            System.out.println(aArray[i].aI + " " +
                                aArray[i].getAS() + " ");
            for (int j = 0; j < 2; j++) {
                System.out.println("\t" + aArray[i].bArr[j].bS);
            }
        }



    }
}
