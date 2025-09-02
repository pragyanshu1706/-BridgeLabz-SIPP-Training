package Test;


import java.util.ArrayList;
import java.util.List;

// BrowserHistory class
class BrowserHistory {
    private List<String> history;
    private int currentIndex;

    public BrowserHistory() {
        this.history = new ArrayList<>();
        this.currentIndex = -1;
    }

    public void visit(String url) {
        if (currentIndex < history.size() - 1) {
            history.subList(currentIndex + 1, history.size()).clear();
        }
        history.add(url);
        currentIndex++;
    }

    public String back(int steps) {
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);
    }

    public String forward(int steps) {
        currentIndex = Math.min(history.size() - 1, currentIndex + steps);
        return history.get(currentIndex);
    }

    public String getCurrentUrl() {
        return history.get(currentIndex);
    }
}

// MusicPlayerHistory class extends BrowserHistory
class MusicPlayerHistory extends BrowserHistory {
    private String currentSong;

    public void playSong(String song) {
        visit(song);
        currentSong = song;
    }

    public String getCurrentSong() {
        return currentSong;
    }
}

public class BrowserHistoryNavigation {
	public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visit("https://www.google.com");
        browserHistory.visit("https://www.facebook.com");
        browserHistory.visit("https://www.youtube.com");

        System.out.println("Current URL: " + browserHistory.getCurrentUrl());
        System.out.println("Back: " + browserHistory.back(1));
        System.out.println("Forward: " + browserHistory.forward(1));

        MusicPlayerHistory musicPlayerHistory = new MusicPlayerHistory();
        musicPlayerHistory.playSong("Song 1");
        musicPlayerHistory.playSong("Song 2");
        musicPlayerHistory.playSong("Song 3");

        System.out.println("Current Song: " + musicPlayerHistory.getCurrentSong());
        System.out.println("Previous Song: " + musicPlayerHistory.back(1));
    }
}

