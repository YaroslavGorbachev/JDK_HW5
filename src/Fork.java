public class Fork {

    private int id;
    private boolean isBusy;


    public Fork(int id) {
        this.id = id;
        this.isBusy = false;
    }

    public synchronized boolean pickUp(int philosopherId) {
        if (!isBusy) {
            isBusy = true;
            System.out.println(" --Философ " + philosopherId + " взял вилки " + id);
            return true;
        }
        return false;
    }


    public synchronized void putDown(int philosopherId) {
        isBusy = false;
        System.out.println(" --Философ " + philosopherId + " отложил вилки " + id);
    }
}