package in.techready.designpatterns.behavioral.chainofresponsibility;

public class EncodingHandler extends VideoHandler {

   @Override
   public void process(Video video) {
      System.out.println("Steps performed for video encoding are - ");
      System.out.println(" 1. Processing various video formats such as 4k, 1080, 720 etc");
      System.out.println(" 2. Saving video files (SD/HD) in various encoding formats.");
      System.out.println();

      if (nextHandler != null) {
         nextHandler.process(video);
      }
   }
}
