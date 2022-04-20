package lib;

import java.time.LocalDate;

public class Year extends Employee {
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;
    Salary salary;
    Spouse spouse;

    public Year(Employee employee, Salary salary, Spouse spouse, int yearJoined, int monthJoined, int dayJoined)
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
        this.salary = salary;
        this.spouse = spouse;
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
    }
    public int getAnnualIncomeTax() {

        // Menghitung berapa lama pegawai bekerja dalam setahun ini,
        // jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
        LocalDate date = LocalDate.now();

        if (date.getYear() == yearJoined) {
            monthWorkingInYear = date.getMonthValue() - monthJoined;
        }else {
            monthWorkingInYear = 12;
        }

        return TaxFunction.calculateTax(salary, monthWorkingInYear, spouse, super.getTotalChildrens());
    }

}
