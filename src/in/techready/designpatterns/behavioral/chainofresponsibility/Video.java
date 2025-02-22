package in.techready.designpatterns.behavioral.chainofresponsibility;

public class Video {
    private String fileName;
    private String fileType;
    private String filePath;

    // other metadata

    public Video(String fileName, String fileType, String 
                 filePath){
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
	}

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    // other methods
}