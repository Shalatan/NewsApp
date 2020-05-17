package com.example.newsapplication;

public class News {

    private String mTitle;
    private String mSectionName;
    private String mWebURL;
    private String mDate;
    private String mTime;
    private String mAuthor;


    public News(String title, String webUrl, String sectionName, String date, String time, String author) {
        mWebURL = webUrl;
        mTitle = title;
        mSectionName = sectionName;
        mDate = date;
        mTime = time;
        mAuthor = author;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebURL() {
        return mWebURL;
    }

    public String getDate() {
        return mDate;
    }

    public String getTime() {
        return mTime;
    }

    public String getAuthor() {
        return mAuthor;
    }
}
