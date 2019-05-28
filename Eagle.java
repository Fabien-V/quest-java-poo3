public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {

        return this.altitude;
    }

    public boolean isFlying() {

        return flying;
    }

    @Override
    public String sing() {

        return "Screech!";
    }

    @Override
    public void TakeOff(){
        if (!this.flying && this.altitude == 0){
            System.out.println(getName()+" takes off in the sky.");
            this.flying = true;
        }

    }
    @Override
    public int ascend(int meters){
        if (this.flying){
            altitude = altitude+meters;
            System.out.println(getName()+" flies upward, altitude: "+getAltitude());
        }
        return meters;
    }
    @Override
    public int descend(int meters){
        if (this.flying){
            altitude = altitude-meters;
            System.out.println(getName()+" flies downward, altitude: "+getAltitude());

        }

        return meters;
    }
    @Override
    public void land(){
        if (this.flying && this.altitude == 1){
            System.out.println(getName()+" lands on the ground.");
            this.flying = false;
        }else{
            System.out.println(getName()+" is too high, it can't lands.");
        }

    }
}
