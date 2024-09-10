package Chapter9.Problem6;
import java.util.*;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(){
        startTime = new Date();
    }

    public Date getStartTime(){
        return startTime;
    }

    public void start(){
        this.startTime = new Date();
    }

    public Date getEndTime(){
        return endTime;
    }

    public void stop(){
        this.endTime = new Date();
    }

    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}
