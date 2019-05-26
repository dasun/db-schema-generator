package example.dbschemagenerator.entities;

import javax.persistence.*;

@Entity
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    private String data;

}