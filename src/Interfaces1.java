interface camera{
    public void takeSnap();
    public void recordVideos();
    default void recordIn4k(){
        System.out.println("Recording in 4k");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectNetworks(String network);
}
class cellphone{
    void callNumber(int number){
        System.out.println("Calling " + number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class mySmartPhone extends cellphone implements camera, Wifi {
       public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideos(){
        System.out.println("Recording");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Ankush", "Anjali" , "Arsh", "Ansh"};
        return networkList;
    }
    public void connectNetworks(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Interfaces1 {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String[] arr =  ms.getNetworks();
        for(String item:arr) {
            System.out.println(item);
        }
        System.out.println();
            ms.recordVideos();
        System.out.println();
            ms.pickCall();
        System.out.println();
            ms.callNumber(1038);
        System.out.println();
        ms.recordIn4k();

    }
}
