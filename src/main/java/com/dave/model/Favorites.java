package com.dave.model;

import lombok.*;

import java.beans.ConstructorProperties;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Favorites {
    private String iceCream;
    private String movie;
    private String rockGroup;
    private String vacation;
    private String sportsTeam;
    @NonNull private String userName;
}
