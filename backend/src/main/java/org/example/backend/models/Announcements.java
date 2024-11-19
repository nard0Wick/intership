package org.example.backend.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "announcements")
public class Announcements {
    @Id
    @Column(name = "ann_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ann_id;

    @Column(name = "title")
    private String title;

    @Column(name = "explanation")
    private String explanation;

    @Column(name = "date")
    private Date date;

    //private List<Category>  categories;

    @ManyToOne
    @JoinColumn(name = "author_id",
                referencedColumnName = "user_id")
    private User author;



}
