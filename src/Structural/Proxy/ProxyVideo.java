package Structural.Proxy;

public class ProxyVideo implements Video {
    public String url;
    public String title;
    public String description;
    public Video realVideo;

    public ProxyVideo(String url) {
        this.url = url;

        /**
          * Load title and description of video from url.
          * FOR EXAMPLE:
          *     this.title = getTitle(url);
          *     this.description = getDescription(url);
         */
    }

    @Override
    public void display() {
        if (realVideo == null) {
            realVideo = new RealVideo(url);
        }

        realVideo.display();
    }
}