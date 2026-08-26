interface Certifiable {
    void issueCertificate();
}

abstract class Course {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public abstract double calculateFee();
}

class VideoCourse extends Course implements Certifiable {
    private int numberOfVideos;

    public VideoCourse(String courseName, int numberOfVideos) {
        super(courseName);
        this.numberOfVideos = numberOfVideos;
    }

    @Override
    public double calculateFee() {
        return numberOfVideos * 150.0;
    }

    public void issueCertificate() {
        System.out.println("Certificate issue for " + courseName);
    }
}

public class MainQ1 {
    public static void main(String[] args) {
        Course c = new VideoCourse("Java Programming", 20);
        System.out.println("Course fee: " + c.calculateFee());

        Certifiable cert = (Certifiable) c;
        cert.issueCertificate();
    }
}