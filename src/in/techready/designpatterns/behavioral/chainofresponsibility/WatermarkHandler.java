package in.techready.designpatterns.behavioral.chainofresponsibility;

public class WatermarkHandler extends VideoHandler {

   @Override
   public void process(Video video) {
      System.out.println("Steps performed for watermark creation - ");
      System.out.println(" 1. Checking if user provided any watermark.");
      System.out.println(" 2. Processing watermark with videos.");
      System.out.println(" 3. Saving video files along with watermark.");
      System.out.println();

      if (nextHandler != null) {
         nextHandler.process(video);
      }
   }
}