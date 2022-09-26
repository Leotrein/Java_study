public class Clock {
    
    public static void main(String[] args) {
        
        long totalMilisec = System.currentTimeMillis() - 10800000;

        long totalSecs = totalMilisec / 1000; long currentSec = totalSecs % 60;
        long totalMins = totalSecs / 60; long currentMin = totalMins % 60;
        long totalHours = totalMins / 60; long currentHour = totalHours % 24;
        
        System.out.println(currentHour + ":" + currentMin + ":" + currentSec);
        
    }
}
