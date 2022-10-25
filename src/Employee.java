import java.util.Scanner;

public class Employee {
    String name;
    float salary,workHours,totalsalary;
    int HireYear;
    double tax,bonus,temp;

    Employee(String name,float salary,float workHours,int HireYear){
        this.name = name ;
        this.salary = salary;
        this.workHours = workHours;
        this.HireYear = HireYear;
    }

    public Employee() {

    }

    public double tax(){

        if (salary>1000){
             tax = (float) (salary * 0.03);
        }
       return 0;
    }

    public double bonus(){
        if (workHours>40){
            int hours = (int) (workHours - 40);
            bonus = hours*30;
            totalsalary = (float) (salary+bonus);
        }
        else {
            return salary;
        }
        return bonus;
    }
    public double raiseSalary() throws Exception{
        if (2021 - HireYear <10 && 2021 - HireYear >=0){
            temp = salary * 0.05;
            totalsalary = salary + (float) (temp + bonus - tax);
            return totalsalary;
        }
        else if (2021 - HireYear > 9 && 2021 < 20){
              temp = salary *0.1;
            totalsalary = (float) (salary + temp + bonus - tax);
            return  totalsalary;
        } else if (2021 - HireYear > 19) {
              temp = salary * 0.15;
            totalsalary = (float) (salary + temp + bonus - tax);
            return  totalsalary;
        }
        else {
            throw  new Exception("Geçersiz Yıl");
        }
    }
    public void tostring(){
        System.out.println("İsim: "+name);
        System.out.println("Maaşı: "+salary);
        System.out.println("Başlangıç Yılı : "+HireYear);
        System.out.println("Vergi : "+tax);
        System.out.println("Bonus : "+bonus);
        System.out.println("Maaş Artışı : "+(temp));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :  "+(salary+bonus-tax));
        System.out.println("Toplam Maaş"+totalsalary);
    }
    void unit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim Soy İsim Giriniz");
        name = scanner.nextLine();
        System.out.println("Maaş Giriniz");
        salary = scanner.nextInt();
        System.out.println("Haftalık Çalışma Saati Giriniz");
        workHours = scanner.nextInt();
        System.out.println("İşe Başlangıç Tarihi Giriniz");
        HireYear = scanner.nextInt();
    }

    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        e.unit();
        e.bonus();
        e.tax();
        e.raiseSalary();
        e.tostring();
    }
}