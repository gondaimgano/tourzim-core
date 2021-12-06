package za.co.entelect.tourzimcore.model;

import lombok.Data;
import za.co.entelect.tourzimcore.model.base.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Resort extends BaseModel {
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String phoneNumber;
    @Column
    private String emailAddress;
    @Column
    private String physicalAddress;

}
