interface WiFiEnabled { void connectWiFi(); }
interface VoiceControlled { void voiceCommand(String cmd); }
interface MusicPlayer { void playMusic(); }
interface VideoStreaming { void streamVideo(); }
interface TemperatureMonitor { void showTemperature(); }

class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {
    public void connectWiFi() { System.out.println("SmartSpeaker connected to WiFi"); }
    public void voiceCommand(String cmd) { System.out.println("Executing voice command: " + cmd); }
    public void playMusic() { System.out.println("SmartSpeaker playing music"); }
}

class SmartTV implements WiFiEnabled, VideoStreaming, MusicPlayer {
    public void connectWiFi() { System.out.println("SmartTV connected to WiFi"); }
    public void streamVideo() { System.out.println("SmartTV streaming video"); }
    public void playMusic() { System.out.println("SmartTV playing music"); }
}

class SmartFridge implements WiFiEnabled, TemperatureMonitor {
    public void connectWiFi() { System.out.println("SmartFridge connected to WiFi"); }
    public void showTemperature() { System.out.println("Fridge temperature: 4°C"); }
}

class SmartWatch implements WiFiEnabled, MusicPlayer, TemperatureMonitor {
    public void connectWiFi() { System.out.println("SmartWatch connected to WiFi"); }
    public void playMusic() { System.out.println("SmartWatch playing music"); }
    public void showTemperature() { System.out.println("Body temperature: 36.5°C"); }
}

// New device: SmartCar
class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    public void connectWiFi() { System.out.println("SmartCar connected to WiFi"); }
    public void voiceCommand(String cmd) { System.out.println("SmartCar executing voice command: " + cmd); }
    public void playMusic() { System.out.println("SmartCar playing music"); }
    public void streamVideo() { System.out.println("SmartCar streaming video"); }
}

public class SmartDevice {
    public static void main(String[] args) {
        SmartSpeaker sp = new SmartSpeaker();
        sp.connectWiFi(); sp.voiceCommand("Play song"); sp.playMusic();

        SmartTV tv = new SmartTV();
        tv.connectWiFi(); tv.streamVideo(); tv.playMusic();

        SmartFridge fridge = new SmartFridge();
        fridge.connectWiFi(); fridge.showTemperature();

        SmartWatch watch = new SmartWatch();
        watch.connectWiFi(); watch.playMusic(); watch.showTemperature();

        SmartCar car = new SmartCar();
        car.connectWiFi(); car.voiceCommand("Navigate home"); car.playMusic(); car.streamVideo();
    }
}
