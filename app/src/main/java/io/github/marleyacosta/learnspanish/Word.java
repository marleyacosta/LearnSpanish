package io.github.marleyacosta.learnspanish;

/**
 * Created by maurely on 7/7/16.
 */
public class Word {

    private String englishWord;

    private String spanishWord;

    private int imageId = NO_IMAGE_PROVIDED;

    private  static final int  NO_IMAGE_PROVIDED = -1;

    private int audioFileId;

    /**
     * The Word class constructor method.
     * @param englishWord
     * @param spanishWord
     */
    public Word(String englishWord, String spanishWord, int audioFileId){

        this.englishWord = englishWord;
        this.spanishWord = spanishWord;
        this.audioFileId = audioFileId;
    }

    public Word(String englishWord, String spanishWord, int imageId,  int audioFileId){

        this.englishWord = englishWord;
        this.spanishWord = spanishWord;
        this.imageId = imageId;
        this.audioFileId = audioFileId;
    }

    /**
     * This method returns the english word.
     * @return The english word.
     */
    public String getEnglishWord(){
        return englishWord;
    }

    /**
     * This methods returns the spanish translation of the  word.
     * @return The spanish word.
     */
    public String getSpanishWord(){
        return spanishWord;
    }

    /**
     *
     * @return
     */
    public int getImageId(){return imageId;}

    /**
     *
     * @return
     */
    public boolean hasImage(){ return NO_IMAGE_PROVIDED != imageId;}

    /**
     *
     * @return
     */
    public int getAudioFileId(){;return audioFileId;}



}
