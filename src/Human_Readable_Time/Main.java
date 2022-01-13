package Human_Readable_Time;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }
    public static String makeReadable(int seconds) {
        int hours = seconds/3600;
        int minutes = seconds/60 - hours*60;
        seconds = seconds - (hours*3600 + minutes * 60);
        String hoursStr = hours>9?Integer.toString(hours):"0"+hours;
        String minutesStr = minutes>9?Integer.toString(minutes):"0"+minutes;
        String secondsStr = seconds>9?Integer.toString(seconds):"0"+seconds;
        return hoursStr + ":" + minutesStr + ":" + secondsStr;
    }
}
