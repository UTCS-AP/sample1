package ir.ac.ut;

class A {
    private String aS;
    int aI;
    B[] bArr;

    A(String aS, int aI, B...bArr) {
        this.aS = aS;
        this.aI = aI;
        this.bArr = bArr;
    }

    String getAS() {
        return this.aS;
    }
}
