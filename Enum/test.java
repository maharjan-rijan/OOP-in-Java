package Enum;

enum Week{Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday }
public class test {
    Week DayOfWeek;
    public test(Week DayOfWeek){
        this.DayOfWeek = DayOfWeek;
    }

    public void SelectDay(){
        switch (DayOfWeek) {
            case Sunday:
                System.out.println("First day of the week.");
                break;
            case Monday:
                System.out.println("Second day of the week.");
                break;
                case Tuesday:
                System.out.println("Third day of the week.");
                break;
                case Wednesday:
                System.out.println("Fourth day of the week.");
                break;
                case Thursday:
                System.out.println("Fifth day of the week.");
                break;
                case Friday:
                System.out.println("Sixth day of the week.");
                break;
                case Saturday:
                System.out.println("Seventh day of the week.");
                break;
            default:
            System.err.println("Your value is out of range.");
                break;
        }
    }
}

