package models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Source {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    public String name;
    public String ISSN;
    @OneToMany(mappedBy="source", fetch=FetchType.EAGER)
    public List<Publication> publications;
}
