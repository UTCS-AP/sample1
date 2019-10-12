package ir.ac.ut;

public class A {
    private String aS;
    int aI;
    B[] bArr;

    A(String aS, int aI, B b0, B b1) {
        this.aS = aS;
        this.aI = aI;
        this.bArr = new B[2];
        this.bArr[0] = b0;
        this.bArr[1] = b1;
    }

    String getAS() {
        return this.aS;
    }
}
