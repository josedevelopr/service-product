package academy.digitllab.store.product.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double stock;
    private Double price;
    private String status;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "category_id")
    private Category category;

}
