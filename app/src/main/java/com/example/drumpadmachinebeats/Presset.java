package com.example.drumpadmachinebeats;

public class Presset {
    private String Title;
    private int Preview;

    public Presset() {}

    public Presset(String title, int preview) {
        Title = title;
        Preview = preview;
    }

    public String getTitle() {
        return Title;
    }

    public int getPreview() {
        return Preview;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPreview(int preview) {
        Preview = preview;
    }
}
