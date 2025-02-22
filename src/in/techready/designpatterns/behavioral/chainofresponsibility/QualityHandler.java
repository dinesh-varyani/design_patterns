package in.techready.designpatterns.behavioral.chainofresponsibility;

public class QualityHandler extends VideoHandler {

    @Override
    public void process(Video video) {
        System.out.println("Steps performed for quality checks are - ");
        System.out.println(" 1. Checking if video is not malformed.");
        System.out.println(" 2. Compressing video for decent quality.");
        System.out.println();

        if (nextHandler != null) {
            nextHandler.process(video);
        }
    }
}