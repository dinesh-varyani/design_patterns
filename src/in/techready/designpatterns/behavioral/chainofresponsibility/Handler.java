package in.techready.designpatterns.behavioral.chainofresponsibility;

public interface Handler {
    void setNextHandler(Handler handler);
    void process(Video video);
}