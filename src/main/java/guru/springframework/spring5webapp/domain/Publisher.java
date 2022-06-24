package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @OneToOne
    private Address publisherAddress;

    public Publisher() {
    }

    public Publisher(String name, Address publisherAddress) {
        this.name = name;
        this.publisherAddress = publisherAddress;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(Address publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisherAddress=" + publisherAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
