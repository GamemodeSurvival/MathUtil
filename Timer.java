import java.util.Timer;
import java.util.TimerTask;

public class Reminder {

    Timer timer;
    boolean timerActive;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timerActive = true;
	}

    class RemindTask extends TimerTask {
        public void run() {
            timerActive = false;
            timer.cancel(); 
        }
    }

}
