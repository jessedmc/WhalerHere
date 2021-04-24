package com.company.view;

import com.company.view.draw.ViewCloud;
import com.company.view.draw.ViewGlitter;
import com.company.view.draw.ViewStar;
import com.company.view.draw.ViewWhale;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * This class is responsible for playing audio sounds during the game.
 */
public class SoundPlay {
    /**
     * Singleton instance
     */
    private static SoundPlay instance = null;

    /**
     * Singleton constructor
     */
    private SoundPlay() {

    }

    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static SoundPlay instance() {
        if (instance == null)
            instance = new SoundPlay();
        return instance;
    }

    /**
     * Plays a positive game sound.
     */
    public void playGoodSound() {
        Thread t = new Thread() {
            public void run() {
                try {
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("goodSound.wav"));
                    // Get a sound clip resource.
                    Clip clip = AudioSystem.getClip();
                    // Open audio clip and load samples from the audio input stream.
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
    /**
     * Plays a negative game sound.
     */
    public void playBadSound() {
        Thread t = new Thread() {
            public void run() {
                try {
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("badSound.wav"));
                    // Get a sound clip resource.
                    Clip clip = AudioSystem.getClip();
                    // Open audio clip and load samples from the audio input stream.
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
    /**
     * Plays a whale noise.
     */
    public void playWhaleSoundOne() {
        Thread t = new Thread() {
            public void run() {
                try {
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("whaleSoundOne.wav"));
                    // Get a sound clip resource.
                    Clip clip = AudioSystem.getClip();
                    // Open audio clip and load samples from the audio input stream.
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();

    }
    /**
     * Plays the game song.
     */
    public void playGameSong() {
        Thread t = new Thread() {
            public void run() {
                try {
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("hoodip.wav"));
                    // Get a sound clip resource.
                    Clip clip = AudioSystem.getClip();
                    // Open audio clip and load samples from the audio input stream.
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();

    }
}
