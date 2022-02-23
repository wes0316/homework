package parking;


import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;


    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }
//中文測式
    public void leave(){
        this.leave = LocalDateTime.now();
    }

    public long getDuration(){
        Duration duration = Duration.between(enter,leave);
        return  duration.toMinutes();
    }
    public void setLeave(LocalDateTime leave){
        if (leave.isAfter(enter)) {
            this.leave = leave;
            
        }
    }
}
