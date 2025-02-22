package in.techready.designpatterns.behavioral.chainofresponsibility;

public class Client {
   public static void main(String[] args) {
      Video video = new Video(
            "design_patterns",
            "mp4",
            "/upload/new/123");

      Handler handler = getDefaultChain();
      handler.process(video);
      System.out.println("-------------------------------");

      // Client can create a custom chains
      // Let's say watermark is not needed
      handler = getCustomChain();
      handler.process(video);
   }

   private static Handler getDefaultChain() {
      Handler qualityHandler = new QualityHandler();
      Handler thumbnailHandler = new ThumbnailHandler();
      Handler waterMarkHandler = new WatermarkHandler();
      Handler encodingHandler = new EncodingHandler();

      // Chain creation
      // quality --> thumbnail --> watermark -->
      // encoding
      qualityHandler.setNextHandler(thumbnailHandler);
      thumbnailHandler.setNextHandler(waterMarkHandler);
      waterMarkHandler.setNextHandler(encodingHandler);
      // return head of chain
      return qualityHandler;
   }

   private static Handler getCustomChain() {
      Handler qualityHandler = new QualityHandler();
      Handler thumbnailHandler = new ThumbnailHandler();
      Handler encodingHandler = new EncodingHandler();

      // Chain creation with no watermark handler
      // quality --> thumbnail --> encoding
      qualityHandler.setNextHandler(thumbnailHandler);
      thumbnailHandler.setNextHandler(encodingHandler);

      // return head of chain
      return qualityHandler;
   }
}