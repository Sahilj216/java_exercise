public abstract class Bank {
    String name;
    String headOfficeAddress;
    String chairmanName;
    int branchCount;
    double fdInterestRate;
    double personalLoanInterestRate;
    double homeLoanInterestRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank name = " + name +
                ", headOfficeAddress = " + headOfficeAddress +
                ", chairmanName = " + chairmanName + ", branchCount =" + branchCount +
                ", fdInterestRate =" + fdInterestRate +
                ", personalLoanInterestRate = " + personalLoanInterestRate +
                ", homeLoanInterestRate = " + homeLoanInterestRate;
    }
}

class SBI extends Bank {

    public SBI(String name, String headOfficeAddress, String chairmanName,
            int branchCount, double fdRate, double personalLoanRate,
            double homeLoanRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdRate;
        this.personalLoanInterestRate = personalLoanRate;
        this.homeLoanInterestRate = homeLoanRate;
    }

    @Override
    public String toString() {
        return " SBI Bank Details \n" + super.toString();
    }
}

class BOI extends Bank {

    public BOI(String name, String headOfficeAddress, String chairmanName,
            int branchCount, double fdRate, double personalLoanRate,
            double homeLoanRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdRate;
        this.personalLoanInterestRate = personalLoanRate;
        this.homeLoanInterestRate = homeLoanRate;
    }

    @Override
    public String toString() {
        return " BOI Bank Details \n" + super.toString();
    }
}

class ICICI extends Bank {

    public ICICI(String name, String headOfficeAddress, String chairmanName,
            int branchCount, double fdRate, double personalLoanRate,
            double homeLoanRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdRate;
        this.personalLoanInterestRate = personalLoanRate;
        this.homeLoanInterestRate = homeLoanRate;
    }

    @Override
    public String toString() {
        return " ICICI Bank Details \n" + super.toString();
    }
}
