import java.io.FileNotFoundException;

public class TrackInfo extends Track {
    public static void main(String[] args) {
        Track track = new Track();
        if (args.length == 0) {
            System.out.println("filename error");
        }
        try {
            track.readFile(args[0]);
            System.out.println(track.size() + " points in track");
            System.out.println("Lowest point is " + track.lowestPoint().toString());
            System.out.println("Highest point is " + track.highestPoint().toString());
            System.out.printf("Total distanc = %.3f km\n", track.totalDistance()/1000);
            System.out.printf("Average speed = %.3f m/s", track.averageSpeed());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
