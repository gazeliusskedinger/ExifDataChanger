public class LatMain extends X{
    public static void main(String[] args) {
        char ns;

        int ins = ran(2);

        if(ins == 0){
            ns = 'N';
        }
        else{
            ns = 'S';
        }

        int latDeg = ran(90);
        int latMin = ran(60);
        int latSek = ran(60);

        print( "lat  : " + latDeg+" deg "+latMin+"' " +latSek+".00\" "+ns+"\n");
    }
}
