package com.pet.Pet.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  title;
    @Lob
    private String content;
    private Long reactCount;
    private Long numberOfReports;
    private Long publicationDate;
    @OrderBy("lastUpdate DESC")
    private Long lastUpdate;
    private boolean featured;
    private int ReactType;
    private List<String> media;
    private boolean isBanned;
    private Long numberOfComments;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Users author;

    @ManyToMany
    @JoinTable(
            name = "blog_tags",
            joinColumns = @JoinColumn(name = "blog_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id",referencedColumnName = "id")
    )
    private List<Tags> tags;

    @OneToMany(mappedBy="blog",cascade = CascadeType.ALL)
    private List<Comment> comments;
}
