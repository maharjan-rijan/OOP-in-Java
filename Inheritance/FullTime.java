package Inheritance;
public class FullTime extends Programmer {
    public int hir = 80000;
public int calculateSalary () {
    return this.salary + this.bonus + this.hir;
}
}