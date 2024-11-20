public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int hours = Integer.parseInt(time.charAt(0) + "" + time.charAt(1));
        int minutes = Integer.parseInt(time.charAt(3) + "" + time.charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        String out = "";
        hours = hours + (minutes + minutesToAdd) / 60;
        hours = hours % 24;
        minutes = (minutes + minutesToAdd) % 60;
        if (hours < 10) {
            out += "0" + hours;
        } else {
            out += hours;
        }
        out += ":";
        if (minutes < 10) {
            out += "0" + minutes;
        } else {
            out += minutes;
        }
        System.out.println(out);
    }
}
