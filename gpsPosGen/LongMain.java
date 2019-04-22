public class LongMain extends X {
    public static void main(String[] args){
        char ew;

        int iwe = ran(2);

        if(iwe == 0){
            ew = 'E';
        }
        else{
            ew = 'W';
        }

        int longDeg = ran(180);
        int longMin = ran(60);
        int longSek = ran(60);

        print("long : "+longDeg+" deg "+longMin+"' "+ longSek+".00\" "+ew+"\n");
    }
}
