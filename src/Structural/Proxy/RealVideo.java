package Structural.Proxy;

public class RealVideo implements Video {
    public String url;
    public String content;
    public String comment;

    public RealVideo(String url) {
        this.url = url;

        /**
          * Load content and comment of video from url.
          * FOR EXAMPLE:
          *     + this.content = getContent(url);
          *     + this.comment = getComment(url);
         */
    }

    @Override
    public void display() {
        System.out.println("Link of video: " + url);
        System.out.println("Displaying video");
    }
}