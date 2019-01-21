package com.stackroute.MuzixApplication.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Track {
    @Id
    @ApiModelProperty(notes = "The database generated Trackid")
    private int trackId;

    private String trackName;
    private String comment;

    public Track(int trackId, String trackName, String comment) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.comment = comment;
    }




}
