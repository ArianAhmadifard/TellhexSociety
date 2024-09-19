package com.TellhexSociety.Api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Society {
    @Id
    public long Id;
    public String Name;
    public String Description;
    public long CreatorNumber;
    public String Image;
}
