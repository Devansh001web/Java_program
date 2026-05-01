
class Account {
    
    private double balance;

   
    public void setBalance(double balance) {
        this.balance = balance;
    }

   
    public double getBalance() {
        return balance;
    }
}


class Camera {
    public void capture() {
        System.out.println("Camera is capturing a photo...");
    }
}


interface WideCapture {
    void wideCapture();
}


interface Video {
    void capture();
    void recordVideo();
}


class Mobile implements WideCapture, Video {
    @Override
    public void wideCapture() {
        System.out.println("Mobile is capturing a wide photo...");
    }

    @Override
    public void capture() {
        System.out.println("Mobile is capturing a normal photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Mobile is recording video at 4K resolution...");
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        
        Account acc = new Account();
        acc.setBalance(5000.75);
        System.out.println("Account Balance: " + acc.getBalance());

        
        Camera cam = new Camera();
        cam.capture();

        
        Mobile mob = new Mobile();
        mob.wideCapture();
        mob.capture();
        mob.recordVideo();
    }
}
