public class App {
    
    public static void main (String[] args){

        Logger starLog = new AsteriskLogger();
        Logger spaceLog = new SpaceLogger();


        starLog.log("hello");
        spaceLog.log("world");

        spaceLog.error("foo");
        starLog.error("bar");
    }
}
