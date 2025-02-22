package in.techready.designpatterns.behavioral.chainofresponsibility;

public class ThumbnailHandler extends VideoHandler {

    @Override
    public void process(Video video) {
       System.out.println("Steps performed for thumbnail creation are - ");
       System.out.println(" 1. Checking if user provided custom thumbnail.");
       System.out.println(" 2. If not, creating various video snapshots.");
       System.out.println(" 3. Saving thumbnail files in respective folders.");
       System.out.println();
 
       if (nextHandler != null) {
          nextHandler.process(video);
       }
    }
}