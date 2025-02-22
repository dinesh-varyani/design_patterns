package in.techready.designpatterns.behavioral.chainofresponsibility;

public abstract class VideoHandler implements Handler {
    protected Handler nextHandler;
	
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public abstract void process(Video video);
}