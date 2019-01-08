package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game extends Thread {

    private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();
    private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();
    private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();

    private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    private Image noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    // spacebar is longer than the others so put a key together to seem a space bar as one key
    private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    private Image noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    private Image noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    private Image noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();

    private Image blueFlareImage;
    private Image judgeImage;
    private String titleName;
    private String difficulty;
    private String musicTitle;
    private Music gameMusic;

    ArrayList<Note> noteList = new ArrayList<Note>();

    public Game (String titleName,String difficulty, String musicTitle) {
        this.titleName = titleName;
        this.difficulty = difficulty;
        this.musicTitle = musicTitle;
        gameMusic = new Music(this.musicTitle,false);
    }

    public void screenDraw(Graphics2D g) {
        g.drawImage(noteRouteSImage,228,30,null);
        g.drawImage(noteRouteDImage,332,30,null);
        g.drawImage(noteRouteFImage,436,30,null);
        g.drawImage(noteRouteSpace1Image,540,30,null);
        g.drawImage(noteRouteSpace2Image,640,30,null);
        g.drawImage(noteRouteJImage,744,30,null);
        g.drawImage(noteRouteKImage,848,30,null);
        g.drawImage(noteRouteLImage,952,30,null);
        g.drawImage(noteRouteLineImage,224,30,null);
        g.drawImage(noteRouteLineImage,328,30,null);
        g.drawImage(noteRouteLineImage,432,30,null);
        g.drawImage(noteRouteLineImage,536,30,null);
        g.drawImage(noteRouteLineImage,740,30,null);
        g.drawImage(noteRouteLineImage,844,30,null);
        g.drawImage(noteRouteLineImage,948,30,null);
        g.drawImage(noteRouteLineImage,1052,30,null);
        g.drawImage(gameInfoImage,0,660,null);
        g.drawImage(judgementLineImage,0,580,null);
        for (int i = 0; i<noteList.size();i++) {
            Note note = noteList.get(i);
            if (note.getY() > 620) {
                judgeImage = new ImageIcon(Main.class.getResource("../images/judgeMiss.png")).getImage();
            }
            if (!note.isProceeded()) {
                noteList.remove(i);
                i--;
            } else {
                note.screenDraw(g);
            }
        }
        g.setColor(Color.white);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setColor(Color.white);
        g.setFont(new Font ("Arial",Font.BOLD,30));
        g.drawString(titleName,20,702);
        g.drawString(difficulty,1190,702);
        g.setFont(new Font("Arial",Font.PLAIN,26));
        g.setColor(Color.DARK_GRAY);
        g.drawString("S",270,609);
        g.drawString("D",374,609);
        g.drawString("F",478,609);
        g.drawString("Space Bar",580,609);
        g.drawString("J",784,609);
        g.drawString("K",889,609);
        g.drawString("L",993,609);
        g.setFont(new Font ("Elephant",Font.BOLD,30));
        g.drawString("000000",565,702);
        g.drawImage(blueFlareImage,320,370,null);
        g.drawImage(judgeImage,460,420,null);


    }

    public void pressS () {
        // blue
        judge("S");
        noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        new Music("drumSmall1.mp3",false).start();
    }

    public void releaseS () {
        // black
        noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    }
    public void pressD () {
        // blue
        judge("D");
        noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        new Music("drumSmall1.mp3",false).start();
    }

    public void releaseD () {
        // black
        noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    }
    public void pressF () {
        // blue
        judge("F");
        noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        new Music("drumSmall1.mp3",false).start();
    }

    public void releaseF () {
        // black
        noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();

    }
    public void pressSpace () {
        // blue
        judge("Space");
        noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        new Music("drumBig1.mp3",false).start();
    }

    public void releaseSpace () {
        // black
        noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
        noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    }
    public void pressJ () {
        // blue
        judge("J");
        noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        new Music("drumSmall1.mp3",false).start();
    }

    public void releaseJ () {
        // black
        noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    }
    public void pressK () {
        // blue
        judge("K");
        noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        new Music("drumSmall1.mp3",false).start();
    }

    public void releaseK () {
        // black
        noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    }
    public void pressL () {
        // blue
        judge("L");
        noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
        new Music("drumSmall1.mp3",false).start();
    }

    public void releaseL () {
        // black
        noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
    }

    @Override
    public void run() {
        dropNotes(this.titleName);
    }

    public void close() {
        gameMusic.close();
        this.interrupt();
    }

    public void dropNotes(String titleName) {
        Beat[] beats =  null;
        if (titleName.equals("Lemon Fight - Stroner") && difficulty.equals("Easy")) {
            int startTime = 4460 - Main.REACH_TIME * 1000;
            int gap = 125;
            beats = new Beat[] {
                    new Beat(startTime,"S"),
                    new Beat (startTime + gap*2,"S"),
                    new Beat (startTime + gap*4,"D"),
                    new Beat (startTime + gap*6,"S"),
                    new Beat (startTime + gap*8,"Space"),
                    new Beat (startTime + gap*10,"L"),
                    new Beat (startTime + gap*12,"J"),
                    new Beat (startTime + gap*14,"K"),
                    new Beat (startTime + gap*16,"K"),
                    new Beat (startTime + gap*18,"S"),
                    new Beat (startTime + gap*20,"D"),
                    new Beat (startTime + gap*22,"K"),
                    new Beat (startTime + gap*24,"Space"),
                    new Beat (startTime + gap*28,"Space"),
                    new Beat (startTime + gap*30,"D"),
                    new Beat (startTime + gap*32,"F"),
                    new Beat (startTime + gap*36,"L"),
                    new Beat (startTime + gap*38,"K"),
                    new Beat (startTime + gap*40,"L"),
                    new Beat (startTime + gap*42,"S"),
                    new Beat (startTime + gap*44,"Space"),
                    new Beat (startTime + gap*44,"Space"),
                    new Beat (startTime + gap*44,"Space"),
                    new Beat (startTime + gap*46,"D"),
                    new Beat (startTime + gap*48,"F"),
                    new Beat (startTime + gap*50,"L"),
                    new Beat (startTime + gap*52,"S"),
                    new Beat (startTime + gap*54,"Space"),
                    new Beat (startTime + gap*56,"S"),

            };
        }
        else if (titleName.equals("Lemon Fight - Stroner") && difficulty.equals("Hard")) {
            int startTime = 1000 - Main.REACH_TIME * 1000;
            beats = new Beat[] {
                    new Beat (startTime,"Space"),
            };
        }
        else if (titleName.equals("Brandon Jonak - Where Do I Go")&& difficulty.equals("Easy")) {
            int startTime = 1000 - Main.REACH_TIME * 1000;
            beats = new Beat[] {
                    new Beat(startTime,"Space"),
            };
        }
        else if (titleName.equals("Brandon Jonak - Where Do I Go")&& difficulty.equals("Hard")) {
            int startTime = 1000 - Main.REACH_TIME * 1000;
            beats = new Beat[] {
                    new Beat(startTime,"Space"),
            };
        }
        else if (titleName.equals("R bin Hustin x Tobimorrow - Light It Up") && difficulty.equals("Easy")) {
            int startTime = 1000 - Main.REACH_TIME * 1000;
            beats = new Beat[] {
                    new Beat (startTime,"Space"),
            };
        }
        else if (titleName.equals("Robin Hustin x Tobimorrow - Light It Up") && difficulty.equals("Hard")) {
            int startTime = 1000 - Main.REACH_TIME * 1000;
            beats = new Beat[] {
                    new Beat (startTime,"Space"),
            };
        }


        int i = 0;

        gameMusic.start();
        while (i < beats.length && !isInterrupted()) {
            boolean dropped = false;
            if (beats[i].getTime() <= gameMusic.getTime()) {
                Note note = new Note(beats[i].getNoteName());
                note.start();
                noteList.add(note);
                i++;
                dropped = true;
            }
            if (!dropped) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public void judge(String input) {
        for (int i = 0; i < noteList.size(); i++) {
            Note note = noteList.get(i);
            if (input.equals(note.getNoteType())) {
                judgeEvent(note.judge());
                break;
            }
        }
    }
    public void judgeEvent(String judge) {
        if (judge.equals("None")) {
            blueFlareImage = new ImageIcon(Main.class.getResource("../images/blueFlare.png")).getImage();
        }
        else if (judge.equals("Miss")) {
            judgeImage = new ImageIcon(Main.class.getResource("../images/judgeMiss.png")).getImage();
        }
        else if (judge.equals ("Early")) {
            judgeImage = new ImageIcon(Main.class.getResource("../images/judgeEarly.png")).getImage();
        }
        else if (judge.equals ("Good")) {
            judgeImage = new ImageIcon(Main.class.getResource("../images/judgeGood.png")).getImage();
        }
        else if (judge.equals ("Great")) {
            judgeImage = new ImageIcon(Main.class.getResource("../images/judgeGreat.png")).getImage();
        }
        else if (judge.equals ("Perfect")) {
            judgeImage = new ImageIcon(Main.class.getResource("../images/judgePerfect.png")).getImage();
        }
    }

}

