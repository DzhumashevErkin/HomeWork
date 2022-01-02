package com.company;

import java.util.Date;

public class News {
    private int id;
    private String heading;
    private String content;
    private Date timePublication;

    public void showHeadingAndContent(){
        System.out.println("Заголовок: " + heading + "\nСодрежимое новости: " + content);
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", content='" + content + '\'' +
                ", timePublication=" + timePublication +
                '}';
    }

    public News() {
    }

    public News(int id, String heading, String content, Date timePublication) {
        this.id = id;
        this.heading = heading;
        this.content = content;
        this.timePublication = timePublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimePublication() {
        return timePublication;
    }

    public void setTimePublication(Date timePublication) {
        this.timePublication = timePublication;
    }
}
