package mh.java.threads.simple1;

public class LongClass {

    private int l=0;

    public int getL() {
        return l;
    }

    public void updateInt(){
        synchronized (this.getClass()) {
            l = l + 1;
        }
    }
}
