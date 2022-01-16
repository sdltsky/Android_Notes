package ru.gb.notes;

public class Note {

    private int id;
    private String headline;
    private String noteDetails;
    private long date;


    public Note(int id, String headline, String noteDetails, long date) {
        this.id = id;
        this.headline = headline;
        this.noteDetails = noteDetails;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getNoteDetails() {
        return noteDetails;
    }

    public void setNoteDetails(String noteDetails) {
        this.noteDetails = noteDetails;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }


}
