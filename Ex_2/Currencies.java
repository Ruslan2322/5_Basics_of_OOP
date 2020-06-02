package Lesson_05.Ex_02;

public enum Currencies {
    BYN("Belorussian ruble", 2.41),
    USD("American dollar", 0.00);
    private String curName;
    private double rate;  // rate for USD

    Currencies(String curName, double rate) {
        this.curName = curName;
        this.rate = rate;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
