package org.kmvon.kisokos.commons;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@MappedSuperclass
@Getter
@Setter
@RequiredArgsConstructor
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private OffsetDateTime createdOn;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @Column(name = "last_modified_on")
    private OffsetDateTime lastModifiedOn;
}


