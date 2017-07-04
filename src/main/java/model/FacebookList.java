package model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class FacebookList {
    private List<Facebook> facebookList = new ArrayList<Facebook>();

    public void add(Facebook facebook){
        this.facebookList.add(facebook);
    }
}