public class TimeExample {
    public static void main(String[] args) {
        TimeShow obj1 = new TimeShow();
        TimeShow obj2 = new TimeShow(10,31,19);
        TimeShow obj3 = new TimeShow(obj2);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
