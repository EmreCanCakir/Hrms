package kodlamaio.northwind.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data  // lombok sayesinde getter setter olayini halleder!!!
@Entity  // Class'in entity katmanina ait oldugunu belirttik!!!
@Table (name = "positions")

public class JobPositions {
    @Id   // primary key'i belirttik !!!
    @GeneratedValue     // id'nin 1 er 1 er arttigini belirttik !!!

    @Column(name = "position_id")   // veri tabaninda nereye karsilik geldigini gosterdik
    private int positionId;

    @Column(name = "position_title")
    private String positionTitle;

    @Column(name = "sector_name")
    private String sectorName;

    @Column(name = "detail")
    private String detail;


    public JobPositions() {

    }

    public JobPositions(int positionId, String positionTitle, String sectorName, String detail) {
        super();
        this.positionId = positionId;
        this.positionTitle = positionTitle;
        this.sectorName = sectorName;
        this.detail = detail;
    }


}
