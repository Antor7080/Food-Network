public class TimeShow {
    private int second, minute, hour;

    TimeShow() {
        //display();
    }

    TimeShow(int h, int m, int s) {
        second = s;
        minute = m;
        hour = h;
    }

    TimeShow(TimeShow timeShow)
    {
        second = timeShow.second;
        minute = timeShow.minute;
        hour = timeShow.hour;
    }

    void display()
    {
        System.out.println(hour+":"+minute+":"+second);
    }
}
