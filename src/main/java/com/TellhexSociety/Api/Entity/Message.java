package com.TellhexSociety.Api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.rmi.server.UID;

@Entity
public class Message {
    @Id
    public long Id;
    public String Text;
    public long UserNumber;
    public long RoomId;
    public long Number;
    public long Time;
    public long ReplyToNumber;
    public String Type;
    public long SocietyId;
    public String FileId;
}
