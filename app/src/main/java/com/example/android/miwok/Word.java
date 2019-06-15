package com.example.android.miwok;

public class Word {

    private String mdefaultTranslation;
    private String mmewokTranslation;
    private int  mImageResourceId;
    private int mMusicResourceId;
    private  Boolean flag = false;
    public Word(String defaultTranslation, String mewokTranslation, int musicResourceId) {
        mdefaultTranslation = defaultTranslation;
        mmewokTranslation = mewokTranslation;
        mMusicResourceId = musicResourceId;
    }
    public Word(String defaultTranslation, String mewokTranslation, int imageResourceId, int musicResourceId) {
        mdefaultTranslation = defaultTranslation;
        mmewokTranslation = mewokTranslation;
        mImageResourceId= imageResourceId;
        mMusicResourceId = musicResourceId;
        flag = true;
    }
    public String getMiwokTranslation() {
        return mmewokTranslation;
    }
    public String getDefaultTranslation() {
        return mdefaultTranslation;
    }
    public int getImageResourceId(){ return mImageResourceId; }
    public int getmMusicResourceId(){ return mMusicResourceId; }
    public Boolean getFlag() { return flag; }

}