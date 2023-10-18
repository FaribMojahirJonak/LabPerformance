import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculateLeave {
    String employeeType;
    String joiningDate;
    boolean isLeapYear;
    int year;
    CalculateLeave(String employeeType, String joiningDate, boolean isLeapYear, int year) {
        this.employeeType = employeeType;
        this.isLeapYear = isLeapYear;
        this.year = year;
        this.joiningDate = joiningDate;
    }
    public void calculateLeave() {
        int daysInYear;
        double vacationLeaveDouble;
        int vacationLeave;
        double sickLeaveDouble;
        int sickLeave;

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate endDate = LocalDate.of(year, 12, 31);
        LocalDate startDate = LocalDate.parse(joiningDate,format);

        if(isLeapYear) {
            daysInYear = 366;
        } else {
            daysInYear = 365;
        }

        Period period = Period.between(startDate, endDate);
        int totalDays = (period.getDays() + period.getMonths() * 30 + period.getYears() * 365) + 1;

        if(employeeType.equalsIgnoreCase("officer")) {
            vacationLeaveDouble = (double) (totalDays * 15) / daysInYear;
            if (vacationLeaveDouble < 0.5) {
                vacationLeave = (int) Math.floor(vacationLeaveDouble);
            } else {
                vacationLeave = (int) Math.ceil(vacationLeaveDouble);
            }
            System.out.println("You have " + vacationLeave + " days for vacation leave!");

            sickLeaveDouble = (double) (totalDays * 10) / daysInYear;
            if (sickLeaveDouble < 0.5) {
                sickLeave = (int) Math.floor(sickLeaveDouble);
            } else {
                sickLeave = (int) Math.ceil(sickLeaveDouble);
            }
            System.out.println("You have " + sickLeave + " days for sick leave!");
        } else if (employeeType.equalsIgnoreCase("Staff")) {
            vacationLeaveDouble = (double) (totalDays * 10) / daysInYear;
            if (vacationLeaveDouble < 0.5) {
                vacationLeave = (int) Math.floor(vacationLeaveDouble);
            } else {
                vacationLeave = (int) Math.ceil(vacationLeaveDouble);
            }
            System.out.println("You have " + vacationLeave + " days for vacation leave!");

            sickLeaveDouble = (double) (totalDays * 7) / daysInYear;
            if (sickLeaveDouble < 0.5) {
                sickLeave = (int) Math.floor(sickLeaveDouble);
            } else {
                sickLeave = (int) Math.ceil(sickLeaveDouble);
            }
            System.out.println("You have " + sickLeave + " days for sick leave!");
        } else {
            System.out.println("Invalid Employee Type. Please try again.");
        }
    }
}
