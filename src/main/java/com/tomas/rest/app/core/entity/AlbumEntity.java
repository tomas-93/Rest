package com.tomas.rest.app.core.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 17/08/2016
 */
@Entity
@Table(name = "album", schema = "test")
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class AlbumEntity
{
    private Long id;
    private String name;
    private ArtisEntity artisEntity;
    private Set<SongsEntity> songsEntities;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    @JsonProperty
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlbumEntity that = (AlbumEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }



    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idArt")
    @JsonIgnore
    public ArtisEntity getArtisEntity()
    {
        return this.artisEntity;
    }

    public void setArtisEntity(ArtisEntity artis)
    {
        this.artisEntity = artis;
    }

    @OneToMany(
            mappedBy = "albumEntity",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonProperty
    public Set<SongsEntity> getSongsEntities()
    {
        return this.songsEntities;
    }

    public void setSongsEntities(Set<SongsEntity> songsEntities)
    {
        this.songsEntities = songsEntities;
    }

    public void addSong(SongsEntity songsEntity)
    {
        this.songsEntities.add(songsEntity);
    }


}
