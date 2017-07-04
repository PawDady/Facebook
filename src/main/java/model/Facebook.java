package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Facebook {
    private String id;
    private long birthday;
    private String firstname;
    private String lastname;
    private String occupation;
    private String gender;
    private City city;
    private String work;
    private String friends;
    private String school;
    private String location;
    private String relationship;
    private Post[] posts;
}