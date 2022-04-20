package lib;

public class Salary extends  Employee{
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;

    public  Salary(Employee employee)
    {
        super(
                employee.getEmployeeId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getIdNumber(),
                employee.getAddress(),
                employee.isForeigner(),
                employee.getGender()
        );
    }

    /**
     * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
     * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
     */

    public void setMonthlySalary(int grade) {
        if (grade == 1) {
            monthlySalary = 3000000;
            calculateEmplyeeIfIsForeigner(monthlySalary);
        }else if (grade == 2) {
            monthlySalary = 5000000;
            calculateEmplyeeIfIsForeigner(monthlySalary);
        }else if (grade == 3) {
            monthlySalary = 7000000;
            calculateEmplyeeIfIsForeigner(monthlySalary);
        }
    }

    public void calculateEmplyeeIfIsForeigner(int monthlySalary){
        if (super.isForeigner()) {
            monthlySalary = (int) (monthlySalary + (monthlySalary * 0.5));
        }
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }
}
