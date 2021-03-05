public class SpaceLogger implements Logger{

    @Override
    public void error(String error) {
        System.out.println("Error: "+spacer(error));

    }

    @Override
    public void log(String log) {
       System.out.println(spacer(log));

    }
    

    private String spacer(String word){
        StringBuilder spacedWord = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            spacedWord.append(word.charAt(i) + " ");
        }
        return spacedWord.toString();
    }
}
