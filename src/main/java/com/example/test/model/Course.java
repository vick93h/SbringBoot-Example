package com.example.test.model;
import jakarta.persistence.*;
@Entity
@Table(name="Course")
public class Course {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="CATEGORY")
    private String category;
    @Column(name="RATING")
    private int rating;
    @Column(name="DESCRIPTION")
    private String description;
    public Course()
    {

    }
    public Course(String name, String category, int rating, String description) {
        super();
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.description = description;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
