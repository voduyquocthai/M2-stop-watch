import javafx.scene.paint.Stop;

public class StopWatch {
    private long startTime;
    private long endTime;
    private long getStartTime(){
        return this.startTime;
    };
    private long getEndTime(){
        return this.endTime;
    };
    public StopWatch(){
    };
    public void start(){
        this.startTime = System.currentTimeMillis();

    };
    public void stop(){
        this.endTime = System.currentTimeMillis();
    };
    public long getElapsedTime(){
        return (this.getEndTime() - this.getStartTime());
    }


    public static void main(String[] args) {
        double Array[] = new double [100000];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Math.random()*100000;
        }
        StopWatch sw = new StopWatch();
        sw.start();
        for(int i=0;i<Array.length-1;i++){
            for(int j=i+1;j<Array.length;j++){
                if(Array[i] > Array[j]){
                    double x = Array[i];
                    Array[i] = Array[j];
                    Array[j] = x;
                }
            }
        }
        sw.stop();
        System.out.println("Thời gian là " + (double)sw.getElapsedTime() / (double) 1000 + " giây");
    }
}
