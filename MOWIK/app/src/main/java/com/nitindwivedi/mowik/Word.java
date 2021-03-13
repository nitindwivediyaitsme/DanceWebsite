package com.nitindwivedi.mowik;

public class Word {

    /**
     *  Default translation for tString mDefaultTranslation;

     /**
     *
     * Miwok translation for the word
     */
    public String mDefaultTranslation;
    public String mMiwokTranslation;
    private int mImageResourceId;
    private static final int No_Image_Provided=-1;
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    // return if there is an image or not
    public boolean hasImage(){
        return mImageResourceId !=No_Image_Provided;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
