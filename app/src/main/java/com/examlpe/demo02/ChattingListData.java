package com.examlpe.demo02;

/**
 * Created by Zhou Hang on 2015/6/12.
 */
public class ChattingListData {

    public static final int SENDER=1;
    public static final int RECEIVER=2;
    private String content;
    private int flag;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public ChattingListData(String content,int flag) {
        setContent(content);
        setFlag(flag);


    }
}
