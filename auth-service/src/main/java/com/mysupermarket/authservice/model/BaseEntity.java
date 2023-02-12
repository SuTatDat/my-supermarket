package com.mysupermarket.authservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    
    @Id
    @GeneratedValue
    @Column(columnDefinition="uuid", updatable=false, nullable=false)
    public UUID oid ;

    public LocalDateTime modifyDate;
}
