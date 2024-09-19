package com.TellhexSociety.Api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.rmi.server.UID;

@Entity
public class Room {
    @Id
    public long Id;
    public long SocietyId;
    public String Name;
    public String Description;
    public String Image;
    public String Type;
}
