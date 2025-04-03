package htl.teddy_com.code._04.homework._2_4;

public class Computer {
    String name, IP="0.0.0.0";
    int MHZ;

    public Computer(String name){
        this.name = name;
    }

    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", IP='" + IP + '\'' +
                ", MHZ=" + MHZ +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getMHZ() {
        return MHZ;
    }

    public void setMHZ(int MHZ) {
        this.MHZ = MHZ;
    }
}
