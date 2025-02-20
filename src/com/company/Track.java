package com.company;

public class Track {

    private String titleImage; // image title
    private String startImage; // image when game started
    private String gameImage; // image when music played
    private String startMusic; // music when started
    private String gameMusic; // music when played
    private String titleName; // music title

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public String getStartImage() {
        return startImage;
    }

    public void setStartImage(String startImage) {
        this.startImage = startImage;
    }

    public String getGameImage() {
        return gameImage;
    }

    public void setGameImage(String gameImage) {
        this.gameImage = gameImage;
    }

    public String getStartMusic() {
        return startMusic;
    }

    public void setStartMusic(String startMusic) {
        this.startMusic = startMusic;
    }

    public String getGameMusic() {
        return gameMusic;
    }

    public void setGameMusic(String gameMusic) {
        this.gameMusic = gameMusic;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String gameMusic) {
        this.titleName = titleName;
    }

    public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic, String titleName) {
        super();
        this.titleImage = titleImage;
        this.startImage = startImage;
        this.gameImage = gameImage;
        this.startMusic = startMusic;
        this.gameMusic = gameMusic;
        this.titleName = titleName;
    }
}
